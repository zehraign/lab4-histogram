

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 //Aufgabe 6
public class histogram {
    public static void main(String[] args) {
        String filePath = "/users/alicia/Downloads/histo.txt"; 
        
        count(filePath);
    }

    public static void count(String filePath) {
       
        int[] frequency = new int[52]; 

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int currentChar;
            while ((currentChar = reader.read()) != -1) {
              
                if (currentChar >= 'A' && currentChar <= 'Z') {
                    currentChar += ('a' - 'A');
                }

                
                if (currentChar >= 'a' && currentChar <= 'z') {
                   
                    frequency[currentChar - 'a']++;
                }
            }

          
            for (char c = 'a'; c <= 'z'; c++) {
                System.out.print(c + " : ");
                for (int i = 0; i < frequency[c - 'a']; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
