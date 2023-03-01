package ch03;

/**
 * if 文 (2), p.50
 */

class Rank {
    public static void main(String[] args) {
        int num = 1000;
        System.out.print(num + " は");

        if (0 <= num && num <= 9)
            System.out.println("1 桁の数です．");
        else if (10 <= num && num <= 99)
            System.out.println("2 桁の数です．");
        else if (100 <= num && num <= 999)
            System.out.println("3 桁の数です．");
        else
            System.out.println("4 桁の数です．");
    }
}
