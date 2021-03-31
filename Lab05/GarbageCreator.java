package hust.soict.hedspi.garbage;

import java.io.*;
import java.util.Scanner;

public class GarbageCreator {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        File file = new File("D:/Java project/src/hust/soict/hedspi/garbage/test.txt");
        try {
            InputStream inputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String s="";
            String line = "";
            while ((line = reader.readLine()) != null) {

                s = s + line +"\n";
            }
            System.out.println(s);
            System.out.println("Time: ");
            System.out.println(System.currentTimeMillis()-start);
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
