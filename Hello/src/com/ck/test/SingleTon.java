package com.ck.test;

import java.util.Map;

public class SingleTon {

    public double d = Math.random();

    private static final SingleTon single = new SingleTon();

    private SingleTon(){

    }

    public static SingleTon getInstance(){
        return single;
    }

    public static void main(String[] args) {
        SingleTon s1 = SingleTon.getInstance();
        System.out.println(s1.d);

        SingleTon s2 = SingleTon.getInstance();
        System.out.println(s2.d);

    }
}
