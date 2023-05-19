public class NumbersSum {
    public static void main(String[] args) {
        int[] numbers = {7, 5, 8, 9, 3, 1};

        System.out.println(Sum(numbers));
    }
    public static double Sum(int[] nums){
        double sum = 0;
        // adding all number from list together
        for (double i : nums) sum += i;

        return sum;
    }
}