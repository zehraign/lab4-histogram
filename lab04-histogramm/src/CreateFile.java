import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 // aufgabe 2
public class CreateFile {
    public static void main(String[] args) {
        String filePath = "createfile1.txt";

        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("created Fiel named: " + file.getName());
            } else {
                System.out.println("File exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
