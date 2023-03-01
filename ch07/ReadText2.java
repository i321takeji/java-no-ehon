package ch07;

import java.io.FileReader;
import java.io.IOException;

/**
 * リソース付き try 文, p.152
 */

class ReadText2 {
    public static void main(String[] args) {
        FileReader in = null;
        try {
            in = new FileReader(args[0]);
            int c;
            String s = new String();

            while ((c = in.read()) != -1) {
                s = s + (char) c;
            }
            System.out.print(s);

        } catch (IOException ie) {
            System.out.println("ファイルがありません．");
        } catch (Exception e) {
            System.out.println("コマンドライン引数がありません．");
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ie2) {
                    System.out.println("ファイルの close に失敗しました．");
                }
            }

        }
    }
}
