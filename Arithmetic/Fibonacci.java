public class Fibonacci {
    public static void main(String[] args) {
        // declaring starting values
        int last = 0;
        int beforeLast = 1;

        for (int i = 0; i < 24; i++) {
            // using formula to add two previous numbers
            int current = last + beforeLast;
            // declaring two previous numbers
            beforeLast = last;
            last = current;

            // printing current number
            System.out.println(current);
        }
    }
}
