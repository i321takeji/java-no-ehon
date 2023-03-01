package ch03;

class Score1 {
    public static void main(String[] args) {
        int s = 65;

        System.out.println("あなたの点数は " + s + " 点です．");

        if (s < 70) {
            System.out.println("平均まであと " + (70 - s) + " 点");
            System.out.println("がんばりましょう！");
        } else {
            System.out.println("よくできました！");
        }
    }
}
