package ch07;

import java.io.FileReader;
import java.io.IOException;

/**
 * 文字の読み込み, p.145
 */

class ReadText {
    public static void main(String[] args) {
        try {
            FileReader in = new FileReader(args[0]);
            int c;
            String s = new String();

            while ((c = in.read()) != -1) {
                s = s + (char) c;
            }
            System.out.print(s);

            in.close();
        } catch (IOException ie) {
            System.out.println("ファイルがありません．");
        } catch (Exception e) {
            System.out.println("ファイル指定がありません．");
        }
    }
}
