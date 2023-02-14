package com.bl.FunctionalProblem;

import java.util.Scanner;

public class SumOfThree { static void findTriplets(int[] arr, int n)
{
    boolean check = false;
    for (int i = 0; i < n - 2; i++) {
        for (int j = i + 1; j < n - 1; j++) {
            for (int k = j + 1; k < n; k++) {
                if (arr[i] + arr[j] + arr[k] == 0) {

                    System.out.println("3 Elements whose Sum becomes zero are : " +arr[i] + " "
                            + arr[j] + " "
                            + arr[k]);
                    check = true;
                }
            }
        }
    }

    if (check == false)
        System.out.println(" 3 Elements whose sum becomes zero dose not exist in Array ");
}

    public static void main(String[] args) {

        System.out.println("Enter Length of Array");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Arr[]  = new int[num];
        System.out.println("Enter " +num+ " Elements for Array ");

        for(int i = 0;i<num; i++){
            Arr[i] = sc.nextInt();
        }
        findTriplets(Arr, num);
    }
}
