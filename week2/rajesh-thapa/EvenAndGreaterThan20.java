import java.util.Scanner;

public class EvenAndGreaterThan20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number: ");
            int number = scanner.nextInt();

            if((number & 1) == 0 && number > 20) System.out.println("Number \"" + number + " \"is even and greater than 20");
        }

        scanner.close();
    }
}
