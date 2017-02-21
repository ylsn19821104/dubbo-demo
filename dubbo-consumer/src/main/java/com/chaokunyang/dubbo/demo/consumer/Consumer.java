package com.chaokunyang.dubbo.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangck
 * @create 2017-02-21 17:23
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world");// 执行远程方法
        System.out.println( hello ); // 显示调用结果
    }
}
