import java.util.Arrays;
import java.util.Comparator;

public class DescendingOrder {

    /*
    https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java

    Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order.
    Essentially, rearrange the digits to create the highest possible number.

    Examples:
    Input: 42145 Output: 54421
    Input: 145263 Output: 654321
    Input: 123456789 Output: 987654321
     */

    /*
    Split into array of numerals
    Define a comparator which will sort in ascending order hence the -1
    Pass into the Arrays method
     */

    /*
    A better solution using streams
    Integer.parseInt(
        String.valueOf(num)
        .chars()
        .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.joining()));
     */

    public static int sortDesc(final int num) {
        String[] arrayOfNumerals = String.valueOf(num).split("");
        Comparator<String> comparator = Comparator.comparing(
                string -> string, (s1, s2) -> -1 * Integer.compare(Integer.parseInt(s1), Integer.parseInt(s2))
        );

        Arrays.sort(arrayOfNumerals, comparator);

        return Integer.parseInt(String.join("", arrayOfNumerals));
    }
}
