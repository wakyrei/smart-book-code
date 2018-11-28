package org.smart4j.example2.SpringAop;

import org.smart4j.example2.Greeting;
import org.smart4j.example2.GreetingImpl;
import org.springframework.aop.framework.ProxyFactory;

public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new GreetingImpl());
        proxyFactory.addAdvice(new GreetingBeforeAdvice());
        proxyFactory.addAdvice(new GreetingAfterAdvice());
        Greeting greeting = (Greeting) proxyFactory.getProxy();
        greeting.sayHello("jack");

    }
}
