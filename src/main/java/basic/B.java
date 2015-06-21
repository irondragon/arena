package basic;

import java.io.IOException;

/**
 * Created by messi on 14.06.2015.
 */
class B extends A {
    void a() {
        System.out.println("B-a");
    }



    void b() {
        System.out.println("B-b");
        super.b();
    }
}
