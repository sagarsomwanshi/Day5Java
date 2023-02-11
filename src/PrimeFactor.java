import java.util.Scanner;

public class PrimeFactor {

    public static void main(String[] args) {
        System.out.println("Enter a nimber to find it's prime factors");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Prime Factors of " +num+ " :");
        factor(num);


    }
    public static void factor(int x){
        int factor;

        for(int i = 2; i<= x/2; i++){
            int check = 0;
            if(x%i == 0){
                for(int j =2; j <= i/2; j++){
                    if(i%j == 0){
                        check = 1;
                    }

                }
                if(check != 1){
                    System.out.println(i);
                }

            }


        }
    }
}
