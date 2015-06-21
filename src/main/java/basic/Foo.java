package basic;

/**
 * Created by messi on 05.03.2015.
 */
public class Foo extends Base {

    int field = -1024;

    public Foo() {
        System.out.println("OK");
    }

    int getField(){
        return field;
    }

    public static void main(String[] args) {
        Integer i1= 1;
        Integer i2= 1;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        String s1 = "a";
        String s2 = "a";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }
}
