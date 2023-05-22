import java.util.Arrays;

public class HighestNumberInTheList {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 2, 5, 7, 10, 24, 34, 11, 6};

        System.out.println("Highest number in the list is: " + Highest(numbers));
    }
    public static int Highest(int[] list){
        // sorting list, so highest number will be at the end
        Arrays.sort(list);

        // returning last element in the list
        return list[list.length-1];
    }
}
