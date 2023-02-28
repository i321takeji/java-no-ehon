package ch02;

/**
 * 計算の演算子 (1), p.29
 */

class Plus {
    public static void main(String[] args) {
        int a = 90;

        a += 10;
        System.out.println("90 に 10 を足すと " + a + " です．");

        example();
    }

    static void example() {
        int b = 90;
        b -= 20;
        System.out.println("90 から 20 を引くと " + b + " です．");

        int c = 90;
        c *= 5;
        System.out.println("90 に 5 を掛けると " + c + " です．");

        int d = 90;
        d /= 3;
        System.out.println("90 を 3 で割ると " + d + " です．");

        int e = 90;
        e %= 40;
        System.out.println("90 を 40 で割った余りは " + e + " です．");

    }
}
