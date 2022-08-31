package it.unikey;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String path = "Scrittura_EX_1";

        try(FileWriter fileWriter = new FileWriter(path);
                BufferedWriter buffered = new BufferedWriter(fileWriter)) {
            String input = "";
            int counter = 0;
            while (!(input.equals("chiudi"))){
                System.out.println("Scrivi qui");
                input = scanner.nextLine();
                if (!(input.equals("chiudi"))){
                    if (counter != 6){
                        buffered.write(input +" " );
                        counter++;
                    } else {
                        buffered.write("\n" + input + " ");
                        counter = 0;
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}