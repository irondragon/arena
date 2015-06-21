package basic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by messi on 03.03.2015.
 */
public class BubbleSort {

    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o); // Correct
        }
    }

    public static void main(String[] srgs) {
        String[] sa = new String[100];
        Collection<String> cs = new ArrayList<String>();

// T inferred to be String
        fromArrayToCollection(sa, cs);
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
