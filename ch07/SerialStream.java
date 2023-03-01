package ch07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * シリアライズ, p.155
 */

class Hello implements Serializable {
    void check() {
        System.out.println("こんにちは");
    }
}

public class SerialStream {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.check();

        try {
            FileOutputStream outFile = new FileOutputStream("serialcheck.dat");
            ObjectOutputStream outObject = new ObjectOutputStream(outFile);
            outObject.writeObject(hello);
            outObject.close();
            outFile.close();

            FileInputStream inFile = new FileInputStream("serialcheck.dat");
            ObjectInputStream inObject = new ObjectInputStream(inFile);
            Hello chkHello = (Hello) inObject.readObject();
            inObject.close();
            inFile.close();

            chkHello.check();
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
        }
    }
}
