package com.stx.p1;

public class Demo01 {
    public static void main(String[] args) {
        double Papper = 0.1;
        double ZhuMulangMA = 8848.86;
        int N = 0;
        while (Papper <= ZhuMulangMA) {
            Papper *= 2;
//            Papper=Papper*2;
            N++;
        }
        System.out.println("需要对折" + N);
    }
}
