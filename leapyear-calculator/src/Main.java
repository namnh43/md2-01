import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = scanner.nextInt();
        boolean is_leap_year = is_leap_year(year);
        if (is_leap_year) {
            System.out.println("This year is leap year");
        } else {
            System.out.println("Not is the leap year");
        }
    }
    public static boolean is_leap_year(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }else {
                return true;
            }
        }
        return false;
    }
}
