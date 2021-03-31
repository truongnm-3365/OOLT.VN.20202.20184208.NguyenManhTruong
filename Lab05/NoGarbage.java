package hust.soict.hedspi.garbage;

import java.io.*;

public class NoGarbage {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        File file = new File("D:/Java project/src/hust/soict/hedspi/garbage/test.txt");
        try {
            InputStream inputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String s ="";
            StringBuilder sb = new StringBuilder();
            String line = "";
            while ((line = reader.readLine()) != null) {

                sb.append(line +"\n");
            }
            s = sb.toString();
            System.out.println(s);
            System.out.println("Time: ");
            System.out.println(System.currentTimeMillis()-start);
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
