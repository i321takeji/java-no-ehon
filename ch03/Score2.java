package ch03;

/**
 * if 文 (2), p.51
 */

class Score2 {
    public static void main(String[] args) {
        int a = 90;

        if (a > 80) {
            if (a == 100)
                System.out.println("満点です");
            else
                System.out.println("もう少しです．");
        } else
            System.out.println("がんばりましょう．");
    }
}
