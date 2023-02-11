import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Please Enter 1st NUmber");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Please Enter 2nd Number");
        int b = sc.nextInt();
        System.out.println("Please Enter 3rd Number");
        int c = sc.nextInt();
        check(a,b,c);
    }
    public static void check(int x, int y, int z){
        if(x > y && x>z){
            System.out.println( x+ " is Largest Number");
        }else if(y>x && y>z){
            System.out.println(y+ " is Largest NUmber");
        }else{
            System.out.println(z+ " is largest Number");
        }
    }
}
