package ch03;

/**
 * if 文 (1), p.48
 */

class Even {
    public static void main(String[] args) {
        int a = 5;

        if (a % 2 == 0)
            System.out.println(a + " は偶数です．");
        else
            System.out.println(a + " は奇数です．");
    }
}
