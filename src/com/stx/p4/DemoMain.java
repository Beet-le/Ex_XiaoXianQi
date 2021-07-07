package com.stx.p4;

public class DemoMain {
    public static void main(String[] args) {
        Noodle noodle=new Noodle();
        Noodle n1 = new Noodle("羊肉面", 2 ,true) ;
        n1.setType("羊肉面");
        n1.setWeight(2);
        Noodle n2= new Noodle("麻辣面", 2,true) ;
        String T= n1.getType();
        show(n2.getType(), n1.getWeight(), n2.isHaveSoup());


    }
    public static void show(String T,int W,boolean I){
        System.out.println("什么面:"+T+" 分量:"+W+"两  "+"是否加汤:"+I);
    }
}
