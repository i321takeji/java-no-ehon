package ch07;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 * サンプルプログラム, エディタの作成, p.161
 */

class MyEditor {
    public static void main(String[] args) {
        try {
            FileWriter out = new FileWriter(args[0]);
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            String lf = System.getProperty("line.separator");
            String data;

            System.out.println("データを入力してください．(終了: 0)");
            while (!(data = in.readLine()).equals("0")) {
                out.write(data + lf);
            }
            System.out.println("終了します．");
            out.close();

        } catch (Exception e) {
            System.out.println(e); // エラーが起こった場合にその内容を表示
        }
    }
}
