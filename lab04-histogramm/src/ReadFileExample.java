

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

//Aufgabe nummer 1
public class ReadFileExample {
    private static ArrayList<Character> letters;

    public ReadFileExample() {
        letters = new ArrayList<>();
       
        for (char c = 'a'; c <= 'z'; c++) {
            letters.add(c);
        }
    }
    


   
    public static void nextChar1() {
        Iterator<Character> iterator = letters.iterator();
        boolean A = iterator.hasNext();
        
        while (iterator.hasNext()) {
            char nextChar = iterator.next();
            System.out.println("Next character: " + nextChar);
        } if (!A) {
            System.out.println("No more characters.");
           
        }
    }

    public static void main(String[] args) {
        new ReadFileExample(); 

        Path path = Paths.get("/users/alicia/Downloads/abc.txt");

        
        try (BufferedReader reader = Files.newBufferedReader(path)) {
        	nextChar1();
           
        } catch (IOException e) {
         System.err.format("IOException: %s%n", e);
       }

        
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (char letter : letters) {
                writer.write(letter);
            }
        } catch (IOException i) {
            System.err.format("IOException: %s%n", i);
        }
    }
    }
