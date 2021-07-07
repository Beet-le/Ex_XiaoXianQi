package com.stx.p3;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01 {
    public static void main(String[] args) {
     int[] Array={124, 1, 9, 38, 79, 66, 12, 99, 125};
     ArrayList<Integer>Odd=new ArrayList<>();
     ArrayList<Integer>Even=new ArrayList<>();
        for (int i = 0; i < Array.length; i++) {

          if(Array[i]%2!=0){
                Odd.add(Array[i]);
          }else {
              Even.add(Array[i]);
          }
        }
        Collections.sort(Odd);
        Collections.sort(Even);
        System.out.println("奇数小到大: "+Odd);
        System.out.println("偶数小到大: "+Even);
    }
}
