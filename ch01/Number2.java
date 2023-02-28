package ch01;

/**
 * 多次元配列 (2), p23
 */

class Number2 {
    public static void main(String[] args) {
        int[][] a = {
                { 10, 20, 30 },
                { 40, 50 },
                { 60, 70, 80, 90 }
        };

        System.out.println("一次元配列の要素数 " + a.length);
        System.out.println("a[0] の要素数 " + a[0].length);
        System.out.println("a[1] の要素数 " + a[1].length);
        System.out.println("a[2] の要素数 " + a[2].length);

        example();
    }

    /**
     * p.22--23
     */
    static void example() {
        int[][] a1 = {
                { 10, 20, 30 },
                { 40, 50 },
                { 60 }
        };

        int[][] a2 = new int[3][];
        a2[0] = new int[3];
        a2[1] = new int[2];
        a2[2] = new int[1];

        int[] a3 = new int[4];
        int b3 = a3.length;

        System.out.println("a3 の要素数 " + b3);

        int[][] a4 = {
                { 1, 2, 3 },
                { 4, 5 }
        };
        int b4 = a4.length;
        int c4 = a4[1].length;

        System.out.println("a4 の要素数 " + b4);
        System.out.println("a4[1] の要素数 " + c4);
    }
}
