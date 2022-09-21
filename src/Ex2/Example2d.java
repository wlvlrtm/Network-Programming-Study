package Ex2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Example2d {
    public static void fileCopy(String sourceFile, String targetFile) throws IOException {
        try (FileInputStream in = new FileInputStream(sourceFile);
             FileOutputStream out = new FileOutputStream(targetFile)) {
            byte[] a = new byte[1024];
            
            while (true) {
                int count = in.read(a);

                if (count < 0) {    // if, -1
                    break;
                }

                out.write(a, 0, count);
            } 
        }
    }


    public static void main(String[] args) throws IOException {
        fileCopy("c:/temp/a.txt", "c:/temp/b.txt");
    } 
}
