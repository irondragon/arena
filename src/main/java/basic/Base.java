package basic;

/**
 * Created by messi on 05.03.2015.
 */
public class Base {

    public Base() {

        System.out.println("BASE");
    }

    public static void main(String[] args) {
           Integer i = 10;
        Integer j = 10;
        System.out.print(i.compareTo(j));
    }
}
