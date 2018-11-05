package org.smart4j.example2;

public class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello!"+name);
    }


}
