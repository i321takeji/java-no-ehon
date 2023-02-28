package ch02;

/**
 * 論理演算子, p.37
 */
class Or {
    public static void main(String[] args) {
        int a = 3, b = 4;
        boolean x, y;

        x = (a < 0);
        y = (b > 0);
        System.out.println((a == 3) && (b == 3));
        System.out.println(x || y);

        example1();
        example2();
    }

    /**
     * p.37
     */
    static void example1() {
        int a = 10;
        boolean ba = (50 <= a) && (a < 100);
        System.out.println("a が 50 以上 100 未満である．" + ba);

        int b, c, d;
        b = c = d = 20;
        boolean bb = !((b == 0) || (b == 1));
        System.out.println("b = " + b);
        System.out.println("「b = 0 または b = 1」ではない: " + bb);

        boolean bc = !(c == 0) && !(c == 1);
        System.out.println("c = " + c);
        System.out.println("c = 0 ではなく， c = 1 でもない: " + bc);

        System.out.println("d = " + d);
        boolean bd = (d != 0) && (d != 1);
        System.out.println("d ≠ 0 かつ， b ≠ 1 である: " + bd);
    }

    /**
     * p.37
     */
    static void example2() {
        int c = 5;
        boolean x = (c == 5);
        boolean y = (c == 9);

        System.out.println("c = " + c);
        System.out.println("x は " + x);
        System.out.println("y は " + y);
        System.out.println("x || y は " + (x || y));

    }
}
