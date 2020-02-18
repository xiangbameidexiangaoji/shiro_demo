package com.example.shirodemo.uitl;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.example.shirodemo.constant.AliYunConstant;

/**
 * 短信验证
 */
public class SendPhoneUtil {

    /**
     * 短信验证
     * @param phone             发送的手机号
     * @param sing_name         短信签名
     * @param template_Code     短信模板
     * @param template_param    随机数
     * @return
     */
    public static boolean send(String phone,String sing_name,String template_Code,String template_param) {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", AliYunConstant.ACCESSKEY_ID,AliYunConstant.SECRET);
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();

        request.setMethod(MethodType.POST);
        //产品域名,开发者无需替换
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        //必填:待发送手机号
        request.putQueryParameter("PhoneNumbers", phone);   //手机号
        //必填:短信签名-可在短信控制台中找到
        request.putQueryParameter("SignName", sing_name);   //短信签名,验证码签名
        //必填:短信模板-可在短信控制台中找到    SMS_183150138,验证码${name}
        request.putQueryParameter("TemplateCode", template_Code);
        //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
        request.putQueryParameter("TemplateParam", "{\"number\":\""+template_param+"\"}");
        request.putQueryParameter("OutId", "yourOutId ");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
            return true;
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return false;
    }
}
