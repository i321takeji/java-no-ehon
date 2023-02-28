package ch02;

/**
 * 型の変換, p.41
 */
class Cast {
    public static void main(String[] args) {
        System.out.println("3 ÷ 2 = " + (float) 3 / 2);
        System.out.println("3 ÷ 2 = " + 3 / (float) 2);

        example();
    }

    /**
     * p.41
     */
    static void example() {
        int i = 8;
        float f = i;

        System.out.println("i is " + ((Object) i).getClass().getSimpleName());
        System.out.println("f is " + ((Object) f).getClass().getSimpleName());

        double d = 2.8;
        // long l = d; /* compile error */
        long l = (long) d;

        System.out.println("d is " + ((Object) d).getClass().getSimpleName());
        System.out.println("l is " + ((Object) l).getClass().getSimpleName());
    }
}
