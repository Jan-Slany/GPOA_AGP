public class FormTriangle {
    public static void main(String[] args) {
        int sideA = 5;
        int sideB = 3;
        // side C must be largest
        int sideC = 7;

        System.out.println("Is this triangle: " + IsTriangle(sideA, sideB, sideC));
    }
    public static boolean IsTriangle(int A, int B, int C){
        return A + B  > C;
    }
}
