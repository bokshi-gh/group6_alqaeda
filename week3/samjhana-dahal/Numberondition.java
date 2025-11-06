public class Numberondition {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i == 15) {
                System.out.println("skip");
            } else if (i % 4 == 0) {
                System.out.println(i * 2); // double numbers divisible by 4
            } else {
                System.out.println(i);
            }
        }
        System.out.println("done");
    }
}
