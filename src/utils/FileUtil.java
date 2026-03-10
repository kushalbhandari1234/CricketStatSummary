package util;

import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {

    public static void write(String fileName, String data) {

        try {

            FileWriter fw = new FileWriter(fileName, true);
            fw.write(data + "\n");
            fw.close();

        } catch (IOException e) {

            System.out.println("File write error");

        }
    }
}