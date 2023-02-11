import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.println("Enter 1st Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();
        System.out.println("1st Number : "+a+ "\n2nd Number : "+b);

        int c;
         c = a;
         a = b;
         b = c;
        System.out.println("Swapping is done\nNow\n1st NUmber : " +a+ "\n2nd Number : " +b);

    }
}
