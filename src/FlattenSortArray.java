import java.util.Arrays;

public class FlattenSortArray {
    /*
    https://www.codewars.com/kata/57ee99a16c8df7b02d00045f/train/java

    Given a two-dimensional array of integers, return the flattened version of the array with all the integers in the sorted (ascending) order.

    Examples:

    Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].
     */

    /*
    The tricky bit was unboxing int to Integer so I had to look at a solution.
     */

    public static int[] flattenAndSort(int[][] array) {
        return Arrays.stream(array).flatMapToInt(Arrays::stream).sorted().toArray();
    }
}
