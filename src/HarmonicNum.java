import java.util.Scanner;

public class HarmonicNum {
    public static void main(String[] args) {
        System.out.println("Please enter a Number whose Harmonic value you want to evaluate");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        harmonic(num);
    }

    public static void harmonic(int x){
        double har = 0;
        for(double i = 1; i<=x; i++){
            har =  har + (1/i);
        }
        System.out.println("Harmonic value of " +x+ " : " +har);
    }
}
