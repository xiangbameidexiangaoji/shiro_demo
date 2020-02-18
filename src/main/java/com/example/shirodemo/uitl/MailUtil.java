package com.example.shirodemo.uitl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 邮箱验证码
 */
@Component
public class MailUtil {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private JavaMailSenderImpl javaMailSender;

    //发送邮件验证码
    public void mail(String fromEmail,String email,Model model){
        SimpleMailMessage message = new SimpleMailMessage();
        boolean email1 = isEmail(email);
        if(email1){
            String code = this.emailCode(email);
            //邮件设置
            message.setSubject("登录保护验证");
            message.setText("亲爱的用户:"+"/n"+"您好，感谢您使用该服务,您在进行的邮箱验证,本次请求的验证码为:"+code+
                    "有效时长5分钟,为了保障您帐号的安全性，请在1小时内完成验证。");
            //发件者
            message.setFrom(fromEmail);
            //收件者
            message.setTo(email);

            try {
                this.javaMailSender.send(message);  //发送成功
            } catch (MailException e) {
                model.addAttribute("msg", "发送失败,请稍后发送");
            }
        }
    }

    //验证邮件验证码
    public boolean  ValidationEmailCode(String email,String code){
        String vCode = (String)this.redisTemplate.opsForHash().get("email", email);
        if(code.equals(vCode)){
            return true;
        }else{
            return false;
        }
    }

    //验证邮箱合法性
    public static boolean isEmail(String email){
        if (null==email || "".equals(email)){
            return false;
        }
        String regEx1 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern p = Pattern.compile(regEx1);
        Matcher m = p.matcher(email);
        if(m.matches()){
            return true;
        }else{
            return false;
        }
    }

    //生成6位数字验证码
    public String emailCode(String email){
        //1、生成一个6位随机整数
        String code = (long)(Math.random() * 1000000) + "";
        //2、将验证码存储到 Redis 中
        try {
            this.redisTemplate.opsForHash().put("email", email, code);
            this.redisTemplate.expire("email", 1L, TimeUnit.HOURS);
            return code;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
