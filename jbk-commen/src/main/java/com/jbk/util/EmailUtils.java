package com.jbk.util;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.net.InetAddress;
import java.util.Calendar;
import java.util.Properties;
import java.util.Random;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/19
 * 项目名称 : jbk
 * 包的名称 : com.jbk.util
 * 说明 ：
 */
public class EmailUtils {
    private static String fromEmail="zhoujinglei137@163.com";//发件邮箱
    private static String sqm="zjl137371";//授权码
    private static String host="smtp.163.com";//服务器地址
    /**
     * 参数说明：
     * 1、接收人的邮箱
     * 2、接收人姓名
     * 3、激活码
      */
    public static int sendEmail(String Email)  {

       String mi = ""+rd()+rd()+rd()+rd()+rd()+rd();
        Properties properties=new Properties();
        properties.setProperty("mail.transport.protocol", "smtp");//设置邮箱协议
        properties.setProperty("mail.smtp.host", host);//设置邮箱的服务器地址
        properties.setProperty("mail.smtp.auth", "true");//设置是否请求认证
        //获取会话对象---连接邮箱服务器
        Session session= Session.getInstance(properties);
        session.setDebug(true);//开启调试信息
        //创建消息对象

        try {
            MimeMessage message=new MimeMessage(session);
            //设置消息信息
            message.setFrom(new InternetAddress(fromEmail, "聚宝坑","UTF-8"));//设置发件人信息
            message.setRecipient(MimeMessage.RecipientType.TO,
                    new InternetAddress(Email, "hello,word", "utf-8"));
            message.setSubject("欢迎使用聚宝坑！！！");
            String ip= InetAddress.getLocalHost().getHostAddress();
            //String url="http://"+ip+":8080/SSH_BookStore/user.op?type=active&code="+code+"&email="+toEmail;
            //message.setContent(title1+",你好：<br/>欢迎你成为我们一员，快来激活吧，这样你就可以真正的加入我们<a href='"+url+"'>"+"点击激活&nbsp;"+url+"</a>","text/html;charset=utf-8");
            message.setContent("哈喽，你的验证码是<font color='#00ff00'>"+mi+"</font>请尽快输入","text/html;charset=utf-8");
            message.setSentDate(Calendar.getInstance().getTime());//设置发送时间
            //获取传输对象
            Transport transport=session.getTransport();
            //登录
            transport.connect(fromEmail, sqm);
            //发送邮件
            transport.sendMessage(message,message.getAllRecipients());
            //关闭
            transport.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return Integer.valueOf(mi);
    }
    public static  int rd(){
        Random random = new Random();
        return random.nextInt(10);
    }
}

