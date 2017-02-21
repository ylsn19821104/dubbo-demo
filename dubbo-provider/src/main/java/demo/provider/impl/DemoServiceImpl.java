package demo.provider.impl;


import demo.DemoService;

/**
 * @author yangck
 * @create 2017-02-21 17:01
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello" + name;
    }
}
