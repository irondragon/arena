package basic;

import java.util.ArrayList;

/**
 * Created by messi on 03.03.2015.
 */
public class QuickSort {

    public static int partition(int[] a, int p, int r) {
        int x = a[p];
        int i = p - 1;
        int j = r + 1;
        while (true) {
            for (--j; a[j] > x; --j) ;

            for (++i; a[i] < x; ++i) ;

            if (i < j) {
                int y = a[i];
                a[i] = a[j];
                a[j] = y;
            } else {
                return j;
            }
        }
    }

    public static void sort(int[] a, int p, int r) {
        if (p < r) {
            int q = partition(a, p, r);
            sort(a, p, q);
            sort(a, q + 1, r);
        }
    }

    public static int binarySearch(int[] a, int x){
        int b = 0;
        int e = a.length;
        while (b < e) {
            int middle = (b + e) / 2;
            if (a[middle] == x) {
                return middle;
            } else {
                if (a[middle] < x) {
                    b = middle + 1;
                } else {
                    e = middle;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1};
        sort(a, 0, a.length - 1);
//        for (int i = 0; i < a.length; ++i) {
//            System.out.println(a[i]);
//        }
        System.out.println(binarySearch(a, 10));
    }
}
