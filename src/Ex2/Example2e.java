package Ex2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Example2e {
    public static void fileCopy(String sourceFile, String targetFile) throws IOException {
        try (FileInputStream fileIn = new FileInputStream(sourceFile); FileOutputStream fileOut = new FileOutputStream(targetFile)) {
            while (true) {
                int data = fileIn.read();
                
                if (data == -1) {
                    break;
                }

                fileOut.write(data);
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        fileCopy("/Users/araina/Documents/Programming-Study/Network-Programming-Study/file/ex2e-source.txt", "/Users/araina/Documents/Programming-Study/Network-Programming-Study/file/ex2e-target.txt");
    }
}
