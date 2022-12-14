package Ex4;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Example4d {
    public static String readFile(String filePath, String encoding) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(filePath), encoding)))
        {
            StringBuilder builder = new StringBuilder();
            char[] a = new char[1024];

            while (true) {
                int count = reader.read(a);

                if (count == -1) {
                    break;
                }

                builder.append(a, 0, count);
            }

            return builder.toString();
        }
    }

    public static void main(String[] args) throws IOException {
        String s = readFile("c:/temp/c.txt", "UTF-8");
        
        System.out.println(s);
    }

}
