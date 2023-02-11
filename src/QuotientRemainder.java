import java.util.Scanner;

public class QuotientRemainder {

    public static void main(String[] args) {
        System.out.println("PLease Enter Dividend");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Please Enter Divisor");
        int b = sc.nextInt();
        division(a,b);
    }
    public static void division(int x, int y){
        int c = x/y;
        int d = x%y;
        System.out.println("Quotient : " +c );
        System.out.println("Remainder : " +d);
    }
}
