public class Isogram {
    public static boolean isIsogram(String str) {
        String lowerCase = str.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            int count = 0;

            for (int x = 0; x < lowerCase.length(); x++) {
                if (lowerCase.charAt(i) == lowerCase.charAt(x)) {
                    count++;
                }
                if (count > 1) {
                    return false;
                }
            }
        }

        return true;
    }
}
