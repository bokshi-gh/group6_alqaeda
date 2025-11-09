public class SumAndProduct {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;

        for (int i = 1; i <= 10; i++) {
            if ((i & 1) == 0) sum += i;
            else product *= i;
        }

        System.out.println("Sum of even numbers: " + sum);
        System.out.println("Product of odd numbers: " + product);
    }
}