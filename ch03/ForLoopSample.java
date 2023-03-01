package ch03;

/**
 * for 文の拡張, p.54
 */

class ForLoopSample {
    public static void main(String[] args) {
        String[] season = { "春", "夏", "秋", "冬" };

        for (String s : season) {
            System.out.println(s);
        }
    }
}
