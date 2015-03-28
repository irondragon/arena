package basic;

/**
 * Created by messi on 03.03.2015.
 */
public class BubbleSort {

    public static void main(String[] srgs) {
        int[] a = {2, 1, 4, 5, 6, 2, 1};
        for (int i = 0; i < a.length - 1; ++i) {
            for (int j = i + 1; j < a.length; ++j) {
                if (a[i] > a[j]) {
                    int b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }
        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }
    }
}
