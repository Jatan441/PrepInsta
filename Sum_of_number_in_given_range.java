import java.util.Scanner;

/**
 * InnerSum_of_number_in_given_range
 */
public class Sum_of_number_in_given_range {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for ( int j = i; j <= n; j++) {
            sum  = sum + j;
        }

        System.out.println("Sum: "+sum);
        sc.close();
    }
}