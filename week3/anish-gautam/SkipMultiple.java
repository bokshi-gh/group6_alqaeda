import java.util.Scanner;

class SkipMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= number; i++) if (i % 4 != 0) System.out.println(i);
    }
}