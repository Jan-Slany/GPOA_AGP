import java.util.Arrays;

public class LargestNumberInTheList {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 24, 13, 1, 9};

        System.out.println("Lowest number in the list is: " + MinNumber(numbers) + "\nHighet number in the list is: " + MaxNumber(numbers));
    }
    public static int MinNumber(int[] list){
        // sorts list, so lowest number will be first
        Arrays.sort(list);
        // return first item
        return list[0];
    }
    public static int MaxNumber(int[] list){
        // sorts list, so highest number will be last
        Arrays.sort(list);
        // return last item
        return list[list.length-1];
    }
}
