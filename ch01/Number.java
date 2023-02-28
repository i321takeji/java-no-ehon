package ch01;

/**
 * 配列, p.19
 */

class Number {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

        example();
    }

    /**
     * p.19
     */
    static void example() {
        int[] a = new int[4];
        int n = 1;
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        System.out.println(a[n]);
    }
}
