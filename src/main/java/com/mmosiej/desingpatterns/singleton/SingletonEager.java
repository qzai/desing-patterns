package com.mmosiej.desingpatterns.singleton;

public class SingletonEager {
    private static SingletonEager ourInstance = new SingletonEager();

    public static SingletonEager getInstance() {
        return ourInstance;
    }

    private SingletonEager() {
    }
}
