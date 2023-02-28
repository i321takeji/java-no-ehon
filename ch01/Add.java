package ch01;

/**
 * 文字列自由自在 (2), p.17
 */

import java.util.*;

class Add {
    public static void main(String[] args) {
        StringTokenizer v = new StringTokenizer("a b c");
        String s = v.nextToken();

        while (v.hasMoreTokens()) {
            s = s + " + " + (v.nextToken());
        }
        System.out.println(s);

        example();
    }

    /**
     * p.16
     */
    static void example() {
        StringTokenizer a = new StringTokenizer("I,Love,Cat", ",");

        while (a.hasMoreTokens()) {
            System.out.println(a.nextToken());
        }
    }
}
