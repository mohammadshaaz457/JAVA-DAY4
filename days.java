import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7) to get the corresponding day of the week: ");
        int day = scanner.nextInt();

        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                System.out.println("monday");
                break;
            case 2:
                dayName = "Tuesday";
                System.out.println("tuesday");

                break;
            case 3:
                dayName = "Wednesday";
                System.out.println("wednesday");

                break;
            case 4:
                dayName = "Thursday";
                System.out.println("thursday");

                break;
            case 5:
                dayName = "Friday";
                System.out.println("friday");

                break;
            case 6:
                dayName = "Saturday";
                System.out.println("saturday");

                break;
            case 7:
                dayName = "Sunday";
                System.out.println("sunday");

                break;
            default:
                dayName = "Invalid input! Please enter a number between 1 and 7.";
        }

        System.out.println(dayName);
        scanner.close();
    }
}