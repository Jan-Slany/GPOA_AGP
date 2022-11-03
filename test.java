import java.util.Arrays;
                                                    // code by ME
public class slany {
    public static void main(String[] args) {
        // creating arrays
        String[] names = {"Jan","Petr","Franta","Jana","Pavla","Simona"};
        int[] numbers = {5,3,6,2,4,1,7,9,8};
        int[] numbersCopy = numbers.clone();

        // creating empty lists for
        String[] tempFemale = new String[names.length];
        String[] tempMale = new String[names.length];
        String[] sortedNames = new String[names.length];

        int fIndex = 0;
        int femaleNumber = 0;
        int mIndex = 0;
        int maleNumber = 0;

        // sorting names and printing them
        Arrays.sort(names);

        for (String i : names) {
            switch (i) {                // switch can be expanded any time, so we can recognize more names
                // females
                case "Jana":
                case "Pavla":
                case "Simona":
                    tempFemale[fIndex] = i;
                    fIndex += 1;
                    femaleNumber += 1;
                    break;
                // males
                case "Jan":
                case "Petr":
                case "Franta":
                    tempMale[mIndex] = i;
                    mIndex += 1;
                    maleNumber += 1;
                    break;
            }
        }

        // combining two arrays to one
        System.arraycopy(tempFemale, 0, sortedNames, 0, femaleNumber);
        System.arraycopy(tempMale, 0, sortedNames, femaleNumber, maleNumber);

        // printing sorted names
        for (String i : sortedNames) System.out.printf("%s, ", i);
        System.out.printf("%n");

        // sorting and printing numbers
        Arrays.sort(numbers);
        for (int i : numbers) System.out.printf("%d, ", i);
        System.out.printf("%n");

        // switching slots in numbersCopy and printing them
        int temp = numbersCopy[0];
        numbersCopy[0] = numbersCopy[3];
        numbersCopy[3] = temp;

        temp = numbersCopy[8];
        numbersCopy[8] = numbersCopy[5];
        numbersCopy[5] = temp;
        for (int i : numbersCopy) System.out.printf("%d, ", i);
    }
}
