import java.util.Scanner;

public class atm{
    public static void main(String[] args) {
        final int CORRECT_PIN = 1234;
        int attempts = 0;
        Scanner sc = new Scanner(System.in);

        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == CORRECT_PIN) {
                System.out.println("Access Granted");
                return; // stop program
            } else {
                System.out.println("Incorrect PIN, try again");
                attempts++;
            }
        }

        System.out.println("Account locked");
        sc.close();
    }
}
