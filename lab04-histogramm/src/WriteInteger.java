

import java.io.FileWriter;
import java.io.IOException;
//Aufgabe nummer 2
public class WriteInteger {
    public static void main(String[] args) {
        Integer number = 10046;
        String filePath = "output.txt";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(number.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}