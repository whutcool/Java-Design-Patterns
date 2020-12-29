package com.patterns.factory;

/**
 * 实现类2
 *
 * @Author: jianglu
 * @Date: 2020/12/29 16:59
 **/
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("This is sms sender!");
    }
}
