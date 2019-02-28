package com.itheima.jvm;

public class TestJVM {
    public static void main(String[] args) {
        String str = System.getProperty("str");
        if (str == null){
            System.out.println("itheima");
        }else {
            System.out.println(str);
        }
        int a = 10;
        int b = 100;
        int c = 0;
    }
}
