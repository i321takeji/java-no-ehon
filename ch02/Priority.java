package ch02;

/**
 * 演算の優先度, p.43
 */

class Priority {
    public static void main(String[] args) {
        System.out.println("2 × 8 - 6 ÷ 2 = " + (2 * 8 - 6 / 2));
        System.out.println("2 × (8 - 6) ÷ 2 = " + (2 * (8 - 6) / 2));
        System.out.println("1 - 2 + 3 = " + (1 - 2 + 3));
        System.out.println("1 - (2 + 3) = " + (1 - (2 + 3)));
    }
}
