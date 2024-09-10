package com.ogiraffers.section06.singleton;

public class Application {
    public static void main(String[] args) {




        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println("lazy1 = " + lazy1);
        System.out.println("lazy2 = " + lazy2);
    }
}
