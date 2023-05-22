public class OddEven {
    public static void main(String[] args) {
        int number = 3;

        OddEven(number);
    }
    public static void OddEven(int num){
        // checking if number divided by two has remainder of zero
        if (num % 2 == 0) System.out.println("This number is even");

        // if not than it is odd number
        else System.out.println("This number is odd");
    }
}
