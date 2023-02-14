package com.bl.FunctionalProblem;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        WindChill W = new WindChill();
        int t = temp();
        int v = speed();

        double windChill = 35.74 + 0.625*t +(0.425*t - 35.75) * (Math.pow(v,0.16));
        System.out.print("WindChill Factor : " +windChill );



    }
    public static int temp(){
        System.out.println("Please Enter a Temperature should be less than or equal to 50' Fahrenheit As Above 50' wind wont be chill ");
        Scanner sc = new Scanner(System.in);
        int temp= sc.nextInt();
        if(temp > 50){
            System.out.println("Invalid Input");
            temp();
        }
        return temp;
    }
    public static int speed(){
        System.out.println("Please Enter Speed of wind should be greater than 3 or less than or equal to 120 As below 3 is not effective & above 120 is not Bearable ");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        if(v > 120){
            System.out.println("Invalid Input");
            speed();
        } else if (v<3) {
            System.out.println("Invalid Input");
            speed();
        }
        return v;

    }
}
