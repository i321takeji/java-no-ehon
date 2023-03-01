package ch03;

import java.util.*;

/**
 * for 文の拡張, p.55
 */

class ForLoopSample2 {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<String>();

        lst.add(new String("0"));
        lst.add(new String("1"));
        lst.add(new String("2"));

        for (String s : lst) {
            System.out.println(s);
        }
    }
}
