package basic;

/**
 * Created by messi on 27.03.2015.
 */
public class KMP {

    public static void createPi(String text, int[] pi) {
        pi[0] = 0;
        for (int i = 1; i < text.length(); i++) {
            int j = pi[i - 1];
            while (j > 0 && text.charAt(j) != text.charAt(i)) {
                j = pi[j - 1];
            }
            if (text.charAt(j) == text.charAt(i)) {
                j++;
            }
            pi[i] = j;
        }
    }

    public static void main(String[] args) {
        String text = "qwerabctqweyui";
        String value = "abc";
        String newText = value.concat("$").concat(text);
        int[] pi = new int[newText.length()];
        createPi(newText, pi);
        for (int i = value.length() + 1; i < pi.length; i++) {
            if (pi[i] == value.length()) {
                System.out.println(i - 2 * value.length());
            }
        }
    }

}
