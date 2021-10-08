public class WhoLikesIt {

    /*
    https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java

    Implement the function which takes an array containing the names of people that like an item.
    It must return the display text as shown in the examples:
    []                                -->  "no one likes this"
    ["Peter"]                         -->  "Peter likes this"
    ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
    ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
    ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
    Note: For 4 or more names, the number in "and 2 others" simply increases.
     */

    /*
    Check if size is <= 3
    Then do switch statement on size
     */

    public static String whoLikesIt(String... names) {
        int sizeOfNames = names.length;
        String whoLikesIt;
        switch (sizeOfNames) {
            case 0:
                whoLikesIt = "no one likes this";
                break;
            case 1:
                whoLikesIt = String.format("%s likes this", names[0]);
                break;
            case 2:
                whoLikesIt = String.format("%s and %s like this", names[0], names[1]);
                break;
            case 3:
                whoLikesIt = String.format("%s, %s and %s like this", names[0], names[1], names[2]);
                break;
            default:
                whoLikesIt = String.format("%s, %s and %d others like this", names[0], names[1], sizeOfNames - 2);
                break;
        }

        return whoLikesIt;
    }
}
