//package name
package com.inputstreamreader;

//importing
import java.io.*;
import java.nio.charset.StandardCharsets;

//class
public class ByteStreamToCharacterStream {

    //main method
    public static void main(String[] args) {
        StringBuilder hexString = new StringBuilder();
        try {
            // Open file
            FileInputStream fs = new FileInputStream("C:\\Users\\admin\\OneDrive\\Desktop\\notepad++\\Week-03\\Day04\\src\\com\\inputstreamreader\\Byte.txt");

            // Read as UTF-8
            InputStreamReader isr = new InputStreamReader(fs, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null) {
                // Store hex values
                hexString.append(line).append(" ");
            }
            // Close file
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Convert hex to text
        String decodedText = hexToString(hexString.toString().trim());

        // Print result
        System.out.println("Decoded UTF-8 Text: " + decodedText);
    }

    // Convert hex to string
    public static String hexToString(String hex) {
        StringBuilder output = new StringBuilder();

        // Split hex pairs
        String[] hexValues = hex.split(" ");

        for (String hexValue : hexValues) {

            // Hex to decimal
            int decimal = Integer.parseInt(hexValue, 16);

            // Decimal to char
            output.append((char) decimal);
        }
        return output.toString();
    }
}
