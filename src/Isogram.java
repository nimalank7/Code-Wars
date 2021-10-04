public class Isogram {
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
