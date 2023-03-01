package ch03;

/**
 * ループの中断, p.58
 */

class Break {
    public static void main(String[] args) {
        int a, b = 2;

        for (a = 0; a < 5; a++) {
            if (b - a <= 0)
                break;

            System.out.println(b + " - " + a + " = " + (b - 1));
        }
    }
}
