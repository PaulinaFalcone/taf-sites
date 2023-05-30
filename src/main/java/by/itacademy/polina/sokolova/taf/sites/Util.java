package by.itacademy.polina.sokolova.taf.sites;

public class Util {
    public static String generateEmail() {
        String[] elements = {"a", "b", "o", "d", "e", "f", "i" };
        return selectRandomElement(elements, 7) + "@gmail.com";
    }

    public static String generatePassword() {
        String[] elements = {"!", "@", "1", "2", "3", "#", "4", "5", "6"};
        return selectRandomElement(elements, 9);
    }

    private static String selectRandomElement(String[] array, int numberOfChars) {
        String result = "";
        for (int i = 0; i < numberOfChars; i++) {
            int j;
            j = (int) Math.floor(Math.random() * array.length);
            result = result.concat(array[j]);
        }
        return (result);
    }
}
