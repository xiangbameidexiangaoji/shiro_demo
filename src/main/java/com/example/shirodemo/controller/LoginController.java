package com.example.shirodemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotEmpty;
import java.util.concurrent.TimeUnit;

@Controller
@Slf4j
@RequestMapping("/user")
public class LoginController {

    @Value("${SING_NAME}")
    private String SING_NAME;     //短信签名
    @Value("${TEMPLATE_CODE}")
    private String TEMPLATE_CODE; //短信模板->验证码
    @Value("${PHONE_CODE_kEY}")
    private String PHONE_CODE_kEY;

    @Autowired
    private RedisTemplate redisTemplate;
    /**
     * 登录页面
     */
    @PostMapping("/login")
    public String login(@NotEmpty String username, @NotEmpty String password, Model model, HttpServletRequest request){
        //1、获取 subject
        Subject subject = SecurityUtils.getSubject();

        //2、封装用户数据
        String s = DigestUtils.md5DigestAsHex(password.getBytes());
        UsernamePasswordToken token = new UsernamePasswordToken(username, s);

        //3、执行登录方法
        try {
            subject.login(token);
            log.info("用户名:" + username);
            return "redirect:/user/testThymeleaf";
        } catch (UnknownAccountException e) {
            model.addAttribute("msg", "账号错误");
            return "login";
        } catch (IncorrectCredentialsException e) {
            model.addAttribute("msg", "密码错误");
            return "login";
        }
    }

    /**
     * 拦截页面
     */
    @GetMapping("/toLogin")
    public String toLogin() {
        return "login";
    }
    /**
     * 主页面
     *
     * @param model
     * @return
     */
    @GetMapping("/testThymeleaf")
    public String testThymeleaf(HttpServletRequest request, HttpServletResponse response, Model model) {
        model.addAttribute("name", "测试Thymeleaf");
        String name = request.getParameter("name");
        request.setAttribute("name", name);
        log.debug("测试日志保存");
        return "test";
    }

    /***
     * 短信验证
     * @param phone
     * @return
     */
    @GetMapping("/phone")
    @ResponseBody
    public String sendPhoneCode(@RequestParam(value = "phone") @NotEmpty String phone){
        String code = (long)(Math.random()*1000000) + "";
        log.info("短信生成验证码:{}",code);
//        boolean send = SendPhoneUtil.send(phone, SING_NAME, TEMPLATE_CODE, code);
//        this.redisTemplate.opsForHash().put(PHONE_CODE_kEY, phone, code);
        this.redisTemplate.opsForValue().set("phon", code, 30, TimeUnit.SECONDS);
//        if(send){
//            this.redisTemplate.opsForHash().put(PHONE_CODE_kEY, phone, code);
//            return "发送成功";
//        }
        return "发送失败";
    }

    /**
     * 短信验证码效验
     * @param phone
     * @param code
     * @return
     */
    @GetMapping("/valPhone")
    @ResponseBody
    public String valPhoneCode(@RequestParam(value = "phone") @NotEmpty String phone,
                               @RequestParam(value = "code") @NotEmpty String code){
        String phoneCode = (String)this.redisTemplate.opsForHash().get(PHONE_CODE_kEY, phone);
        if(code .equals(phoneCode)){
            log.info("短信验证码为:{}",phoneCode);
            return "短信验证成功";
        }
        return "短信验证失败";
    }
}
