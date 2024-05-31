

import java.io.StringReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.IOException;

public class frequantChar {
    public static void main(String[] args) {
        
 // aufgabe 5
     
        String testString1 = "abcdefghijklmnopqrstuvwxyz";
        count(new StringReader(testString1));

        
        String testString2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        count(new StringReader(testString2));

        
        String testString3 = "AbCdeFGHIjKLmnoPqRStuVWxYz";
        count(new StringReader(testString3));

        
        String testString4 = "";
        count(new StringReader(testString4));
    }

    public static void count(Reader reader) {
        
        int[] frequency = new int[26];
        char mostFrequentCharacter = '\0'; 
        int maxFrequency = 0;

        try (BufferedReader bufferedReader = new BufferedReader(reader)) {
            int currentChar;
            while ((currentChar = bufferedReader.read()) != -1) {
               
                if (currentChar >= 'A' && currentChar <= 'Z') {
                    currentChar += ('a' - 'A');
                }

                
                if (currentChar >= 'a' && currentChar <= 'z') {
                    
                    frequency[currentChar - 'a']++;

                    
                    if (frequency[currentChar - 'a'] > maxFrequency) {
                        mostFrequentCharacter = (char) currentChar;
                        maxFrequency = frequency[currentChar - 'a'];
                    }
                }
            }

           
            for (char c = 'a'; c <= 'z'; c++) {
                System.out.println(c + ": " + frequency[c - 'a']);
            }

            
            System.out.println("Most frequent character: " + mostFrequentCharacter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

