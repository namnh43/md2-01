import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width:");
        width = scanner.nextFloat();
        System.out.println("Enter height:");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is: "+ area);

        day_of_month();
    }
    public static void day_of_month() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month do you want to count the day?");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.println("28 or 29 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("Not valid");
                break;
        }
    }
}
