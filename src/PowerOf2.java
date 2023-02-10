import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1 - 63, upto which you want to evaluate powers of 2");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        power(N);

    }
    public static void power(int x){
        for(int i = 0; i <= x; i++){
            long a = (long)Math.pow(2,i);
            if(i == 63){
                System.out.println("2^" + i + " = " + (a+1));
            }else {
                System.out.println("2^" + i + " = " + a);
            }
        }
    }
}
