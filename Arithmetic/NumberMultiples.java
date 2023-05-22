import java.util.Scanner;

public class NumberMultiples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // asking user to choose multiplier
        System.out.print("Choose multiplier: ");
        int multiplier = scan.nextInt();

        // asking user to set limit of multiplication
        System.out.print("Set limit: ");
        int limit = scan.nextInt();

        Multiplication(multiplier, limit);
    }
    public static void Multiplication(int multiplier, int limit) {
        for (int i = 1; i < limit + 1; i++) System.out.print(i * multiplier + ", " );
    }
}
