package ch02;

/**
 * 型の変換, p.40
 */

public class Type {
    public static void main(String[] args) {
        System.out.println("3 ÷ 2 = " + 3 / 2);
        System.out.println("3.0 ÷ 2.0 = " + 3.0 / 2.0);
        System.out.println("3.0 ÷ 2 = " + 3.0 / 2);
        System.out.println("3 ÷ 2.0 = " + 3 / 2.0);

        example();
    }

    /**
     * p.40
     */
    static void example() {
        short s = 536;
        byte b = 12;
        int a = s + b;
        System.out.println(a);
        // https://docs.oracle.com/javase/specs/jls/se19/html/jls-4.html#jls-4.2.2
    }
}
