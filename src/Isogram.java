public class Isogram {
    /*
    An isogram is a word that has no repeating letters, consecutive or non-consecutive.
    Implement a function that determines whether a string that contains only letters is an isogram.
    Assume the empty string is an isogram. Ignore letter case.

    Example:

    isIsogram "Dermatoglyphics" == true
    isIsogram "aba" == false
    isIsogram "moOse" == false -- ignore letter case
     */

    public static boolean isIsogram(String str) {
        String lowerCase = str.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            int finalI = i;
            long count = lowerCase.chars().filter(character -> character == lowerCase.charAt(finalI)).count();
            if (count > 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("aba"));
        System.out.println(isIsogram("moOse"));
    }
}
