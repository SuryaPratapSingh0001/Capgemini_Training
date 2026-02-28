package Streams;

import java.io.*;

public class StrictSum {
    public static void main(String[] args) {

        int sum = 0;

        try (BufferedReader br =
                     new BufferedReader(new FileReader("C:\\Users\\surya\\coding folders\\Java Project\\Class Task\\5022026\\untitled\\src\\data.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] tokens = line.split("\\s+");

                for (String token : tokens) {
                    sum += Integer.parseInt(token);
                }
            }

            System.out.println("Sum = " + sum);

        } catch (NumberFormatException e) {
            System.out.println("Error: File contains non-integer value!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
