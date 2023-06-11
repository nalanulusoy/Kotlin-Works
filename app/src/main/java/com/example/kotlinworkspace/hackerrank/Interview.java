package com.example.kotlinworkspace.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by Nalan Ulusoy on 26,Ekim,2022
 */
public class Interview {
    Long i = 1L ;
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = n; n >= 3; i--) {
            if (n % 3 == 0 || n % 5 == 0) {
                sum += sum;
            }
        }

        System.out.println(sum);
    }

}

