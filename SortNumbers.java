import java.util.Arrays;
import java.util.Comparator;

public class SortNumbers {
    public static void main(String[] args) {
        String[] stringNumbers = {"1, 2, 0", "4, 5"};
        int[] arrayOfNumbers = Arrays.stream(stringNumbers)
                .flatMapToInt(digit -> {
                    String[] splitedNumbers = digit.split(", ");
                    return Arrays.stream(splitedNumbers).mapToInt(number -> Integer.parseInt(number)).sorted();
                })
                .toArray();
        System.out.println(Arrays.toString(arrayOfNumbers));

    }
}
