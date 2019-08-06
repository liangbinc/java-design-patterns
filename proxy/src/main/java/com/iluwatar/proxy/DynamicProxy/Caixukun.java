package com.iluwatar.proxy.DynamicProxy;

import com.iluwatar.proxy.Wizard;

public class Caixukun implements Star {

    @Override
    public Wizard playBasketball() {
        return new Wizard("get data from db");
    }

    @Override
    public void save(Wizard wizard) {
        System.out.println("save to db");
    }
}
