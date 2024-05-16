public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int steps = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                // divides n by 2 when n is even
                n /= 2;
            } else {
                n -= 1;
            }
            steps += 1;
        }
        System.out.println(steps);
    }
}
