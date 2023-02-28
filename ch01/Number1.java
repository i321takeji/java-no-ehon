package ch01;

/**
 * 多次元配列 (1), p.21
 */

class Number1 {
    public static void main(String[] args) {
        // int[][] a = new int[3][2]
        int[][] a = {
                { 10, 20 },
                { 30, 40 },
                { 50, 60 }
        };

        System.out.println("a[0][0]=" + a[0][0] + " a[0][1]=" + a[0][1]);
        System.out.println("a[1][0]=" + a[1][0] + " a[1][1]=" + a[1][1]);
        System.out.println("a[2][0]=" + a[2][0] + " a[2][1]=" + a[2][1]);

        example();
    }

    /**
     * p.21
     */
    static void example() {
        int[][] a = {
                { 10, 20, 30 },
                { 40, 50, 60 }
        };
        a[0][2] = 0;
        System.out.println(a[1][0]);
    }
}
