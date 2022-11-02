package Ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class Example2a {
    public static void fileCopy(String sourceFile, String targetFile) throws IOException {
        FileInputStream fileIn = new FileInputStream(sourceFile);
        FileOutputStream fileOut = new FileOutputStream(targetFile);
        byte[] data = new byte[1024];
        
        while (true) {
            int count = fileIn.read(data);
            
            if (count < 0) {
                break;
            }
            
            System.out.write(data, 0, count);
            fileOut.write(data, 0, count);
        }

        fileIn.close();
        fileOut.close();
    }

    public static void main(String[] args) throws IOException {
        fileCopy("/Users/araina/Documents/Programming-Study/Network-Programming-Study/file/ex2a-source.txt", 
                 "/Users/araina/Documents/Programming-Study/Network-Programming-Study/file/ex2a-target.txt"); 
           
    }
}
