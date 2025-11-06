import java.util.Scanner;

public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Enter numbers (type 0 to stop):");

        while (true) {
            number = sc.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        System.out.println("Total sum of all numbers: " + sum);

        if (sum % 2 == 0) {
            System.out.println("Since total sum is even, sum of even numbers = " + evenSum);
        } else {
            System.out.println("Since total sum is odd, sum of odd numbers = " + oddSum);
        }

        sc.close();
    }
}
