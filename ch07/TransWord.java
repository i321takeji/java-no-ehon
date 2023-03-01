package ch07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * サンプルプログラム, ファイルの中の文字列, p.160
 */

class TransWord {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("mydic.txt"));
            String a = args[0];

            String eword, jword = null;
            while ((eword = in.readLine()) != null) {
                if (a.equals(eword)) {
                    jword = in.readLine();
                    break;
                }
            }

            if (jword == null) {
                System.out.println(a + " はありませんでした．");
            } else {
                System.out.println(jword);
            }

            in.close();

        } catch (FileNotFoundException e) {
            System.out.println("ファイルがありません．");
        } catch (Exception e) {
            System.out.println("コマンドライン引数がありません．");
        }
    }
}
