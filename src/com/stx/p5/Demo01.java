package com.stx.p5;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("请输入2个数:");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char one = 'A';
        char[][] Array = new char[N][M];

        for (int i = 0; i < N; i++) {
            Array[i][0] = (char) (one + i);
        }

        for (int j = 0; j < M; j++) {
            Array[0][j] = (char) (one + j);
        }

        for (int x = 1; x < N; x++) {
            for (int y = 1; y < M; y++) {
                Array[x][y] = Array[x - 1][y - 1];
            }
        }

        for (int y = 0; y < N; y++) {
            for (int z = 0; z < M; z++) {
                System.out.print(Array[y][z]);
            }
            System.out.println();
        }
    }
}
