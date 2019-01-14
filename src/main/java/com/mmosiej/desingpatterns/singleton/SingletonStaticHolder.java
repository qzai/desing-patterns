package com.mmosiej.desingpatterns.singleton;

public class SingletonStaticHolder {

    private SingletonStaticHolder() {
    }

    public static SingletonStaticHolder getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private static class InstanceHolder {
        private static final SingletonStaticHolder INSTANCE = new SingletonStaticHolder();
    }
}
