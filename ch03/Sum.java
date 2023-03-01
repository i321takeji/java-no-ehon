package ch03;

/**
 * while 文, p.57
 */

class Sum {
    public static void main(String[] args) {
        int s = 0, i = 0;

        do {
            // i = ++i; ?
            ++i;
            s = s + i;
        } while (i < 10);

        System.out.println("1 から " + i + " までの和は " + s);
    }

    static void loop() {
        int a = 0;

        while (a < 5) {
            System.out.println(a);
        }
    }
}
