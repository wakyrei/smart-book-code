package org.smart4j.example;

import com.sun.tracing.dtrace.ArgsAttributes;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.sql.ResultSet;

public class CGLlibProxy implements MethodInterceptor {

    public <T> T getProxy(Class<T> cls){
        return (T) Enhancer.create(cls, this);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o,args);
        afrer();
        return result;
    }

    private void afrer() {

    }

    private void before() {

    }

    public static void main(String[] args) {
        CGLlibProxy cgLlibProxy = new CGLlibProxy();
        HelloImpl2 helloProxy = cgLlibProxy.getProxy(HelloImpl2.class);
        helloProxy.say("jack");
    }
}
