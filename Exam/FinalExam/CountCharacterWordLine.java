// 2022_Q5_C(2) : Write a program that counts number of characters, words and lines in a file. Use exceptions to check whether the file that is read exists or not.

import java.io.*;

public class CountCharacterWordLine {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file1.txt");
            BufferedReader reader = new BufferedReader(fr);

            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            String line;
            while ((line = reader.readLine()) != null) {
                // Count characters
                charCount += line.length();

                // Count words
                String[] words = line.split("\\s");
                wordCount += words.length;

                // Counting lines
                lineCount++;
            }

            reader.close();

            System.out.println("Number of characters:: " + charCount);
            System.out.println("Number of words:: " + wordCount);
            System.out.println("Number of lines:: " + lineCount);

        } catch (IOException e) {
            System.out.println("Sorry! This File Cannot Found");
        }
    }
}
