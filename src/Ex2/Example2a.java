package Ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Example2a {
    public static void fileCopy(String sourceFile, String targetFile) throws IOException {
        FileInputStream in = new FileInputStream(sourceFile);
        FileOutputStream out = new FileOutputStream(targetFile);
        byte[] arr = new byte[1024];
        
        while(true) {
            int count = in.read(arr);

            if (count < 0) {
                break;
            }

            out.write(arr, 0, count);
        }

        in.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        fileCopy("/Users/araina/Documents/Programming-Study/Network-Programming-Study/file/ex2a-source.txt", 
                 "/Users/araina/Documents/Programming-Study/Network-Programming-Study/file/ex2a-target.txt");    
    }
}
