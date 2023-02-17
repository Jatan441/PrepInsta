import java.util.Scanner;

/**
 * Leap_year_or_not
 */
public class Leap_year_or_not {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = sc.nextInt();

        if(year % 4 == 0)
        System.out.println(year+" is leap year");
        else
        System.out.println("year is not leap year");

        sc.close();
    }
}