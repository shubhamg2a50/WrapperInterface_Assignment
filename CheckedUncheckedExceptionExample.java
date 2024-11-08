package oop.assignment;

import java.io.IOException;

//Step 1: Create the ExceptionHandlingExample class
public class CheckedUncheckedExceptionExample {

 // Step 2: Method to simulate reading a file
 public static void readFile(String fileName) throws IOException {
     if (fileName == null) {
         throw new IOException("File name cannot be null");
     }
     System.out.println("Reading file: " + fileName);
 }

 // Step 3: Method to demonstrate ArrayIndexOutOfBoundsException
 public static void demonstrateArrayException() {
     int[] array = new int[5];
     try {
         System.out.println(array[10]); // This will cause an exception
     } catch (ArrayIndexOutOfBoundsException e) {
         System.err.println("Error: " + e.getMessage());
     }
 }

 // Step 4: Main method to demonstrate checked and unchecked exceptions
 public static void main(String[] args) {
     // Handling checked exception
     try {
         readFile(null); // This will cause an IOException
     } catch (IOException e) {
         System.err.println("Error: " + e.getMessage());
     }

     // Handling unchecked exception
     demonstrateArrayException();
 }
}

