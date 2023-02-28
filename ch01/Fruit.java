package ch01;

/**
 * 文字と文字列, p13
 */

class Fruit {
    public static void main(String[] args) {
        String apple = "りんご";
        int a = 3;

        String fruit = apple + a + "こ";
        System.out.println(fruit);

        sample();
    }

    /**
     * p.12
     */
    static void sample() {
        char a = 'A';
        System.out.println(a);
        System.out.println('\u0041');

        char c1 = 'あ';
        System.out.println(c1);

        // NOTE: compile error
        // char c2 = "あ";
        // char c3 = "abc";
    }
}
