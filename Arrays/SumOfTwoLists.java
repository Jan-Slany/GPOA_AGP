public class SumOfTwoLists {
    public static void main(String[] args) {
        int[] firstList = {10, 24, 34, 11, 6};
        int[] secondList = {12, 9, 22, 51, 3};

        System.out.println("Sum of these two lists is: " + SumLists(firstList, secondList));

    }
    public static int SumLists(int[] FirstList, int[] SecondList){
        int sum = 0;

        // adding element on current position to sum variable
        for (int f : FirstList) sum += f;
        for (int s : SecondList) sum += s;

        return sum;
    }
}
