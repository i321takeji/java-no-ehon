package ch02;

/**
 * 論理型, p.35
 */

class Truth {
    public static void main(String[] args) {
        String right = "正解", wrong = "不正解";
        boolean value;

        value = true;
        String answer = value ? right : wrong;
        System.out.println(answer);

        value = false;
        answer = value ? right : wrong;
        System.out.println(answer);
    }
}
