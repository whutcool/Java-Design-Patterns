package com.patterns.factory;

/**
 * 工厂类
 *
 * @Author: jianglu
 * @Date: 2020/12/29 16:57
 **/
public class SendFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
