import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        System.out.println("please enter how many times you want flip the coin ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double heads = 0;
        double tails = 0;

        for(int i = 1; i <= num; i++){
            float toss = (float) Math.random();
            if(toss<0.5){
              heads++;
            }else{
                tails++;
            }
        }
        System.out.println("Heads :" +(heads/num)*100 +"%");
        System.out.println("Tails :" +(tails/num)*100 +"%");


    }
}
