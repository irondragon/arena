package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {

    private List<Integer> array = new ArrayList<Integer>();

    private boolean yes;

    public List<Integer> getArray() {
        return array;
    }

    public boolean isYes() {
        return yes;
    }

    public void setArray(List<Integer> array) {
        this.array = array;
    }

    public void setYes(boolean yes) {
        this.yes = yes;
    }

    public Permutations(boolean yes) {
        this.yes = yes;
    }

    public void next() {
        int i = array.size() - 2;
        while (i >= 0 && array.get(i) > array.get(i + 1)) {
            --i;
        }
        if (i >= 0) {
            int j = i + 1;
            while (j < array.size() - 1 && array.get(j + 1) > array.get(i)) {
                ++j;
            }
            Collections.swap(array, i, j);
            List sublist = array.subList(i + 1, array.size());
            Collections.reverse(sublist);
            (array = array.subList(0, i + 1)).addAll(sublist);
            setYes(true);
        } else {
            setYes(false);
        }

    }

    public static void main(String[] args) {
        Permutations permutations = new Permutations(true);
        int N = 3;

        for (int i = 0; i < N; ++i) {
            permutations.getArray().add(i + 1);
        }

        while (permutations.isYes()) {
            for (int i = 0; i < permutations.getArray().size(); ++i) {
                System.out.print(permutations.getArray().get(i));
            }
            System.out.println();
            permutations.next();
        }
    }

}
