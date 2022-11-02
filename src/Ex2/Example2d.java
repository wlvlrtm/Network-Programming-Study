package Ex2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Example2d {
    public static void fileCopy(String sourceFile, String targetFile) throws IOException {
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;

        try {
            fileIn = new FileInputStream(sourceFile);
            fileOut = new FileOutputStream(targetFile);
            byte[] data = new byte[1024];

            while (true) {
                int count = fileIn.read(data);

                if (count < 0) {
                    break;
                }

                fileOut.write(data, 0, count);
            }
        }
        finally {
            if (fileIn != null) {
                fileIn.close();
            }
            if (fileOut != null) {
                fileOut.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        fileCopy("c:/temp/a.txt", "c:/temp/b.txt");
    }
}
