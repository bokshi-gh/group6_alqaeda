public class SkipAndDouble {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i == 15) System.out.println("skip"); 
            else if (i % 4 == 0) System.out.println(2 * i); 
            else System.out.println(i);
        }

        System.out.println("done");
    }
}