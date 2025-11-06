import java.util.Scanner;

public class EvenGreater{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers:");

        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0 && num > 20) {
                System.out.println(num);
            }
        }
        sc.close();
    }
}
