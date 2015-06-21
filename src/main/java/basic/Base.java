package basic;

/**
 * Created by messi on 05.03.2015.
 */

public class Base {

    public static int BinaryCode(int input, int r) {
        int result = 1;
        return 1;
    }

    public static void BinaryCode (int input) {
        int mask = 1;
        char[] result = new char[32];
        int length = 0;
        while (input > 0) {
            result[length++]= (input&mask) == 1 ? '1' : '0';
            input>>>=1;
        }
        for(int i = length - 1; i >=0; --i) {
            System.out.print(result[i]);
        }
    }

    private static class Entry{
        public int value;
        public Entry next;

        public Entry(int value, Entry next) {
            this.next = next;
            this.value = value;
        }
    }

    public static void main(String[] args) {

          Entry root = new Entry(1, null);
          Entry iterator = root;
          for(int i = 2; i < 10; ++i) {
              Entry e = new Entry(i, null);
              iterator.next = e;
              iterator = iterator.next;
          }
          iterator = root;
          while(iterator != null ){
              System.out.print(iterator.value);
              iterator = iterator.next;
          }
          Entry current = root;
          Entry prev = null;
          while(current != null) {
              Entry temp = current.next;
              current.next = prev;
              prev = current;
              current = temp;

          }
        current = prev;
        while(current != null ){
            System.out.print(current.value);
            current = current.next;
        }

//        double pi = Math.PI;
//        System.out.println("PI = "+ pi + "\nFormatted PI = " + String.format("%.2f", pi));
//
//        double s=0;
//
//        for (int i=0; i<26; i++)
//            s += 0.1;
//        System.out.println(s);
//
//        double f = 17.5;
//        long binary = Double.doubleToLongBits(f);
//        String strBinary = Long.toBinaryString(binary);
//
//        double f1 = -17.5;
//        long binary1 = Double.doubleToLongBits(f1);
//        String strBinary1 = Long.toBinaryString(binary1);
//
//
//        System.out.println(String.format("%.10f", f));
//        System.out.println(strBinary);
//        System.out.println(strBinary1);
//
//        float a, b, ff;
//        a=123456789;
//        b=123456788;
//        ff=a-b;
//
//        System.out.println(String.format("%f", ff));
    }
}
