package Streams;

import java.io.*;

public class CountSystemWord {

    public static void main(String[] args) {

        int count = 0;

        try (BufferedReader br =
                     new BufferedReader(new FileReader("C:\\Users\\surya\\coding folders\\Java Project\\Class Task\\5022026\\untitled\\src\\Streams\\StrictSum.java"))) {

            String line;

            while ((line = br.readLine()) != null) {

                int index = 0;

                while ((index = line.indexOf("System", index)) != -1) {
                    count++;
                    index += "System".length(); // move forward
                }
            }

            System.out.println("System appears " + count + " times.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
