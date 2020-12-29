package com.patterns.factory;

/**
 * 实现类1
 *
 * @Author: jianglu
 * @Date: 2020/12/29 16:58
 **/
public class MailSender implements Sender {

    @Override
    public void Send() {
        System.out.println("This is mail sender!");
    }
}
