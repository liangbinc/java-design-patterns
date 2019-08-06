package com.iluwatar.proxy.DynamicProxy;

public interface ProxyInterface<T,V> {
    Object doBegin(T t, Object[] param);

    Object doEnd(V returnObj, T t,Object[] param);
}
