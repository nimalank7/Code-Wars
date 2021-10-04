import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    /*
    https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java

    Count the number of Duplicates
    Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string.
    The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

    Example
    "abcde" -> 0 # no characters repeats more than once
    "aabbcde" -> 2 # 'a' and 'b'
    "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
    "indivisibility" -> 1 # 'i' occurs six times
    "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
    "aA11" -> 2 # 'a' and '1'
    "ABBA" -> 2 # 'A' and 'B' each occur twice
     */

    /*
    Overview of solution:

    Count each occurrence of a letter and place it in a hashmap with the character
    Check if the character exists in the hashmap before searching
     */

    public static int duplicateCount(String text) {
        Map<Character, Integer> searchedChars = new HashMap<>();
        String lowerCase = text.toLowerCase();
        for (int i = 0; i < lowerCase.length(); i++) {
            char characterToSearch = lowerCase.charAt(i);
            if (searchedChars.containsKey(characterToSearch)) {
                continue;
            }
            int numberOfOccurrences = (int) lowerCase.chars().filter(character -> character == characterToSearch).count();
            if (numberOfOccurrences > 1) {
                searchedChars.put(characterToSearch, numberOfOccurrences);
            }

        }
        return searchedChars.keySet().size();
    }

    public static void main(String[] args) {
    }
}
