package com.bl.FunctionalProblem;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        System.out.println("Enter X co-ordinate");
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        System.out.println("Enter Y co-ordinate");
        int Y = sc.nextInt();
        euclidien(X,Y);
    }
    public static void euclidien(int x, int y){
        double dist = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("Distance from origin : " +dist);
    }
}
