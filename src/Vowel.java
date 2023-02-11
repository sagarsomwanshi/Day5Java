import java.util.Scanner;


public class Vowel {
    public static void main(String[] args) {
        System.out.println("Enter any Alphabet");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if(a.equalsIgnoreCase("a") || a.equalsIgnoreCase("e") || a.equalsIgnoreCase("i") || a.equalsIgnoreCase("o") || a.equalsIgnoreCase("u")){
            System.out.println(a+ " is Vowel");
        }else{
            System.out.println(a+ " is Consonant");
        }

    }
}
