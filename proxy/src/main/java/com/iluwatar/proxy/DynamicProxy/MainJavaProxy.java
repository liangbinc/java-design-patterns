package com.iluwatar.proxy.DynamicProxy;

import com.iluwatar.proxy.Wizard;

public class MainJavaProxy {
    public static void main(String[] args) {

        Star star = new Caixukun();
        Wizard changlb = new Wizard("changlb");
        new CaixunkunProxy<Star>(new RedisUtil()).newProxyInstance(star, new ProxyInterface() {

            @Override
            public Object doBegin(Object o, Object[] param) {
                RedisUtil redisUtil = (RedisUtil) o;
                redisUtil.save(changlb);
                return null;
            }

            @Override
            public Object doEnd(Object returnObj, Object o, Object[] param) {
                RedisUtil redisUtil = (RedisUtil) o;
                redisUtil.save(changlb);
                return null;
            }
        }).save(changlb);


    }
}
