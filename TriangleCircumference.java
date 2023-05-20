public class TriangleCircumference {
    public static void main(String[] args) {
        int sideA = 5;
        int sideB = 3;
        int sideC = 7;

        System.out.println("Circumference of this triangle is: " + Circumference(sideA, sideB, sideC));
    }
    public static int Circumference(int A, int B, int C) { return A + B + C; }
}