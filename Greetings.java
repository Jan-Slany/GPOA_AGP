import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // getting user input using scanner
        System.out.print("Type your name: ");
        String name = scan.nextLine();

        System.out.print("Hello, nice to meet you " + name);
    }
}