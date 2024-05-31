

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 //aufgabe 3
public class FrequencyCounter {
    public static void main(String[] args) {
        String inputFilePath = "/users/alicia/Downloads/input.txt"; 
        String outputFilePath = "frequency.txt"; 

       
        int[] frequency = new int[52]; 

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            int currentChar;
            while ((currentChar = reader.read()) != -1) {
               
                if (currentChar >= 'A' && currentChar <= 'Z') {
                    currentChar += ('a' - 'A');
                }

                
                if (currentChar >= 'a' && currentChar <= 'z') {
                   
                    frequency[currentChar - 'a']++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (char c = 'a'; c <= 'z'; c++) {
                writer.write(c + ": " + frequency[c - 'a'] + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("frequencies are written in " + outputFilePath);
    }
}
