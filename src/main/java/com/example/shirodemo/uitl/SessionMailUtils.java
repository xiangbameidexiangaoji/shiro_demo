package com.example.shirodemo.uitl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SessionMailUtils {
    @Autowired
    private JavaMailSenderImpl javaMailSender;

    /**
     * 发送邮箱验证码
     *
     * @param fromEmail 发送者邮箱
     * @param email     收件邮箱
     */
    public void sendMailForResetPwd(String fromEmail, String email, HttpServletRequest request) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("登录保护验证");
        String code = (long)(Math.random()* 1000000) + "";
        message.setText("亲爱的用户:" + "/n" + "您好，感谢您使用该服务,您在进行的邮箱验证,本次请求的验证码为:" + code +
                "有效时长5分钟,为了保障您帐号的安全性，请在1小时内完成验证。");
        message.setFrom(fromEmail);
        message.setTo(email);
        try {
            this.javaMailSender.send(message);
            HttpSession session = request.getSession();
            session.setAttribute("code", code);
        } catch (MailException e) {
            e.printStackTrace();
        }
    }
    //效验邮箱验证码
    public static boolean verifyCode(String email,String code,HttpServletRequest request){
        String sessionCode = (String)request.getSession().getAttribute("code");
        if(sessionCode != null){
            if(sessionCode.equals(code)){
                return true;
            }
        }
        return false;
    }


    //验证邮箱合法性
    public static boolean isEmail(String email) {
        if (null == email || "".equals(email)) {
            return false;
        }
        String regEx1 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern p = Pattern.compile(regEx1);
        Matcher m = p.matcher(email);
        if (m.matches()) {
            return true;
        } else {
            return false;
        }
    }
}
