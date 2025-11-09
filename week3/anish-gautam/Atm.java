import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int _PIN = 1234;
        int count = 0;

        for (;;) {
            System.out.print("Enter ATM PIN: ");
            int pin = scanner.nextInt();

            if (pin == _PIN) {
                System.out.println("Access Granted");
                scanner.close();
                System.exit(0);
            }
            if(++count == 3){
                System.out.println("Account locked");
                break;
            }
            
            System.out.println("Incorrect PIN, try again");
        }

        scanner.close();
    }
}
