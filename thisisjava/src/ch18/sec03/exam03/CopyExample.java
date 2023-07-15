package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) throws Exception{
        String originalFileName = "C:/Temp/test.jpg";
        String targetFileName = "C:/Temp/test2.jpg";

        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(targetFileName);

        is.transferTo(os);

        os.flush();
        os.close();
        is.close();
    }
}
