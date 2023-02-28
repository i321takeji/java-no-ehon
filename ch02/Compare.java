package ch02;

/**
 * 比較演算子, p.33
 */

class Compare {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a < b  ・・・ " + (a < b));
        System.out.println("a > b  ・・・ " + (a > b));
        System.out.println("a == b ・・・ " + (a == b));
        System.out.println("a != b ・・・ " + (a != b)); // 追加
        System.out.println("a = b  ・・・ " + (a = b));
    }
}
