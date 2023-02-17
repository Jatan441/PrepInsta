import java.util.Scanner;

/**
 * Innersum_of_n_natural_numbers
 */
public class sum_of_n_natural_numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum is equal to: "+sum);
        sc.close();
    }
}