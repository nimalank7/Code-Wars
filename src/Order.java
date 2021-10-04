public class Order {
    /*
    https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java

    Your task is to sort a given string.
    Each word in the string will contain a single number.
    This number is the position the word should have in the result.
    Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
    If the input string is empty, return an empty string.
    The words in the input String will only contain valid consecutive numbers.

    Example:

    "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
    "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
    ""  -->  ""
     */

    /*
    A much better solution:
    Arrays.stream(words.split(" "))
      .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
      .reduce((a, b) -> a + " " + b).get();

    replaceAll replaces all non-digits (i.e. letters with an empty space) returning the digit
    comparator then sorts the strings by this
    Then you reduce it
     */

    public static String order(String words) {
        String[] splitWords = words.split(" ");
        if (words.length() == 0) {
            return words;
        }
        String[] orderedSplitWords = new String[splitWords.length];

        for(String word : splitWords) {
            for (int i = 0; i < word.length(); i++) {
                if (Character.isDigit(word.charAt(i))) {
                    int index = Integer.parseInt(String.valueOf(word.charAt(i))) - 1;
                    orderedSplitWords[index] = word;
                    break;
                }
            }
        }

        String orderedString = String.join(" ", orderedSplitWords);
        return orderedString;
    }
}
