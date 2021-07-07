package com.stx.p2;


public class Demo01 {
    public static void main(String[] args) {
        String str="500111200011098009";
        String str1=str.substring(6,10);
        String str2=str.substring(10,12);
        String str3=str.substring(12,14);
        System.out.println("你的生日"+str1+"年"+str2+"月"+str3+"号");
    }
}
