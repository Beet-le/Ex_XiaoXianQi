package com.stx.p5;

import java.util.Scanner;

public class Demo01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            char one = 'A';
            char[][] arr = new char[n][m];
            for(int j = 0;j<m;j++) {
                arr[0][j] = (char)(one +j);
            }
            for (int i = 0;i<n;i++){
                arr[i][0] = (char) (one + i);
            }
            for (int x = 1;x<n;x++){
                for (int y = 1;y<m;y++){
                    arr[x][y] = arr[x-1][y-1];
                }
            }
            for (int a = 0;a<n;a++){
                for (int b = 0;b<m;b++){
                    System.out.print(arr[a][b]);
                }
                System.out.println();
            }
        }
}
