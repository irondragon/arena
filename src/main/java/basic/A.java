package basic;

/**
 * Created by messi on 14.06.2015.
 */
class A {
    void a() {
        System.out.println("A-a");
    }

    public void process() { System.out.print("A,"); }

    void b() {
        System.out.println("A-b");
        a();
    }
}
