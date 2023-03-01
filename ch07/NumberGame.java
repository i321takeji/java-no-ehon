package ch07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * キーボード入力, p.157
 */

class NumberGame {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int a, b = 7;
            System.out.println("名前を入力して下さい");
            String name = in.readLine();
            System.out.println("数あてクイズ！ 0 から 9 の数字を入力してね");
            String c = in.readLine();
            a = Integer.parseInt(c);

            while (a != b) {
                if ((a == b - 1) || (a == b + 1)) {
                    System.out.println("おしい！");
                } else if (a > b + 1) {
                    System.out.println("もっと小さい数です");
                } else if (a < b - 1) {
                    System.out.println("もっと大きい数です");
                }

                c = in.readLine();
                a = Integer.parseInt(c);
            }
            System.out.println("正解！ " + name + " さん，おめでとう！！");

        } catch (Exception e) {
            System.out.println("エラーです");
        }
    }
}
