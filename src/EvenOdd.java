import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        check(a);
    }
    public static void check(int x){
        if(x%2 == 0){
            System.out.println(x+ " is Even Number");
        }else {
            System.out.println(x+ " is Odd Number");
        }
    }
}
