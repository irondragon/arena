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
        Foo foo = new Foo();
        double f = Math.sqrt(2) ;
        int i=8;
        int j=++i;
        j>>=1;
        System.out.print(j);
    }
}
