package com.patterns.factory;

/**
 * 测试类
 *
 * @Author: jianglu
 * @Date: 2020/12/29 17:05
 **/
public class FactoryTest {

    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.Send();
    }
}
