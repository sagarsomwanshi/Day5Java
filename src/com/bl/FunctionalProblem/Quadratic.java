package com.bl.FunctionalProblem;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        System.out.println("Here we have to find roots of Equation : a*X*X + b*X +c ");
        System.out.println("Please Enter the Values of a, b, c below ");
        Scanner sc = new Scanner(System.in);
        System.out.println("a : ");
        int a= sc.nextInt();
        System.out.println("b : ");
        int b= sc.nextInt();
        System.out.println("c : ");
        int c= sc.nextInt();
        root(a,b,c);
    }
    public static void root(int a, int b, int c){
        int delta = b*b - 4*a*c;
        if(delta > 0) {
            double root1 = (-b + (Math.sqrt(delta))) / (2 * a);
            double root2 = (-b - (Math.sqrt(delta))) / (2 * a);
            System.out.println("Root of X are " + root1 + " & " + root2);
        } else if (delta == 0) {
            int root1 = -b / (2*a);
            System.out.println("Root of X is " +root1);
        }else{
            System.out.println("Roots are Not Real");
        }
    }
}
