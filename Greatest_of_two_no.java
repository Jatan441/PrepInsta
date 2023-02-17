import java.util.Scanner;

/**
 * InnerGreatest_of_two_no
 */
public class Greatest_of_two_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (n1>n2) {
            System.out.println(n1+" is greater");
        }
        else
        System.out.println(n2+" is greater");
        sc.close();
    }
    
}