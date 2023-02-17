import java.util.Scanner;

/**
 * Positive_or_Negative_number
 */
public class Positive_or_Negative_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num>0)
        System.out.println("Nnumber is positive");
        else if(num<0)
        System.out.println("NUmber is Negative");
        else
        System.out.println("Zero");
        sc.close();
    }
}