package ch03;

/**
 * サンプルプログラム, 素数を探す, p.63
 */

class Prime {
    public static void main(String[] args) {
        int max = 100; // 素数を探す数の最大値
        boolean[] a = new boolean[max]; // 素数かどうかを判定する配列

        // 配列の初期化
        for (int i = 0; i < max; i++) {
            a[i] = true;
        }

        // 素数かどうか判定
        for (int i = 2; i < max; i++) {
            if (a[i - 1]) {
                for (int j = 2; i * j <= max; j++) {
                    a[i * j - 1] = false;
                }
            }
        }

        // 結果を表示
        for (int i = 1; i < max; i++) {
            if (a[i]) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
    }
}
