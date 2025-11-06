public class Sumproduct {
    public static void main(String[] args) {
        int sumEven = 0;
        int productOdd = 1;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                productOdd *= i;
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Product of odd numbers: " + productOdd);
    }
}
