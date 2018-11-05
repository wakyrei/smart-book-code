package org.smart4j.example;

public class HelloImpl implements Hello{
    @Override
    public void say(String name) {
        System.out.println("Hello!"+ name);
    }
}
