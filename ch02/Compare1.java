package ch02;

/**
 * 論理型, p.34
 */
class Compare1 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        boolean c, d, e;

        c = a < b;
        d = a > b;
        e = a == b;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a < b  ・・・ " + c);
        System.out.println("a > b  ・・・ " + d);
        System.out.println("a == b ・・・ " + e);
    }
}
