package com.iluwatar.proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CaixunkunProxy<T> implements InvocationHandler {

    private Object obj;

    private ProxyInterface proxyInterface;

    private Object param;

    public CaixunkunProxy(Object param) {
        this.param = param;
    }

    public <T> T newProxyInstance(T obj, ProxyInterface myProxyInterface) {
        this.obj = obj;
        this.proxyInterface = myProxyInterface;
        return (T) Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {

        Object obj = null;
        obj = proxyInterface.doBegin(param, args);
        if (obj != null) {
            return obj;
        }
        obj = method.invoke(this.obj, args);
        proxyInterface.doEnd(obj, param, null);
        return obj;
    }

}
