package com.bl.FunctionalProblem;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        System.out.println("Enter Number of rows for 2D Array ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Enter Number of columns for 2D Array");
        int cl = sc.nextInt();
        int Arr[][]  = new int[row][cl];
        System.out.println("Enter values for array");

        for(int i = 0;i<row; i++){
            for(int j=0;j<cl;j++){
                Arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i<row; i++){
            for(int j=0;j<cl;j++){
                System.out.print(Arr[i][j]+ " ");
            }
            System.out.println("");
        }


    }
}
