import java.util.Scanner;

public class factor8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a factor of 8: ");
        int number = scanner.nextInt();
        
        if (isFactorOfEight(number)) {
            System.out.println(number + " is a factor of 8.");
        } else {
            System.out.println(number + " is not a factor of 8.");
        }
        
        scanner.close();
    }

    public static boolean isFactorOfEight(int num) {
        return (8 % num == 0);
    }
}