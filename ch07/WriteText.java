package ch07;

import java.io.FileWriter;

/**
 * 文字の書き出し, p.147
 */

class WriteText {
    public static void main(String[] args) {
        try {
            FileWriter out = new FileWriter("math.txt");
            String lf = System.getProperty("line.separator");
            int a = 10, b = 5;
            out.write("加法: ");
            out.write(a + " + " + b + " = " + (a + b) + lf);
            out.write("減法: ");
            out.write(a + " - " + b + " = " + (a - b) + lf);
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
