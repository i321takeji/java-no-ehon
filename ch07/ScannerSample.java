package ch07;

import java.util.Scanner;

/**
 * Scanner クラス, p.159
 */

class ScannerSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("駅名を入力してください: ");
        String ekimei = sc.next();
        System.out.print("ホーム番号を入力して下さい: ");
        int bansen = sc.nextInt();

        sc.close();

        System.out.println(ekimei + " 駅の " + bansen + " 番ホームで待っています");
    }
}
