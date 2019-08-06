package com.iluwatar.proxy.DynamicProxy;

import com.iluwatar.proxy.Wizard;

public class RedisUtil {
    public Wizard getProjectById(String id) {
        if (id != null && "123".equals(id)) {

            return new Wizard("from datebase");
        } else {
            return null;
        }
    }

    public void save(Wizard wizard) {
        System.out.println("save cache");
    }
}
