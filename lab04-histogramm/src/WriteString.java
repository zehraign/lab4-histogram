import java.io.FileWriter;
import java.io.IOException;
//Aufgabe nummer 2
public class WriteString {
    public static void main(String[] args) {
        String text = "lets write a string into a file";
        String filePath = "out.txt";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}