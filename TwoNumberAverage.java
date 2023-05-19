public class TwoNumberAverage {
    public static void main(String[] args) {
        int[] numbers = {7, 5};

        System.out.println(Average(numbers));
    }
    public static double Average(int[] nums){
        double sum = 0;
        // adding all number from list together
        for (double i : nums) sum += i;

        // using formula for average
        return sum / nums.length;
    }
}