package ch07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * バイナリの読み書き, p.147
 */

class InOut {
    public static void main(String[] args) {
        try {
            String filename = "file.dat";
            FileOutputStream out = new FileOutputStream(filename);
            FileInputStream file = new FileInputStream(filename);
            InputStreamReader in = new InputStreamReader(file);

            for (byte i = 1; i <= 10; i++) {
                out.write(i);
            }

            int c;
            while ((c = in.read()) != -1) {
                System.out.print(c + " ");
            }

            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println("ファイルがありません．");
        }
    }
}
