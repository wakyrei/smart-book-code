package org.smart4j.example2.staticproxy;

import org.smart4j.example2.Greeting;
import org.smart4j.example2.GreetingImpl;

public class GreetingProxy implements Greeting {
    private GreetingImpl greetingImpl;

    public GreetingProxy(GreetingImpl greetingImpl) {
        this.greetingImpl = greetingImpl;
    }

    @Override
    public void sayHello(String name) {
        before();
        greetingImpl.sayHello(name);
        after();
    }
    private void after() {
        System.out.println("After");
    }

    private void before() {
        System.out.println("Before");
    }

    public static void main(String[] args) {
        GreetingProxy greetingProxy = new GreetingProxy(new GreetingImpl());
        greetingProxy.sayHello("jack");
    }

}
