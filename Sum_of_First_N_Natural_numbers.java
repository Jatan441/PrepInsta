import java.util.Scanner;

/**
 * Sum_of_First _N_Natural_numbers
 */
public class Sum_of_First_N_Natural_numbers {

    private static int sum;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sum = n*(n+1)/2;
        System.out.println("Sum:"+ sum);
        sc.close();
    }
}