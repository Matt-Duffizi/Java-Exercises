package it.unikey;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_2 {
    public static void main(String[] args) {
        String path = "equazioni.txt";
        String path2 = "equazioni_risolte.txt";

        operation(path, path2);

    }

    public static void operation(String path, String path_2){
        ArrayList<String> operationList = new ArrayList<>();

        try (FileReader reader = new FileReader(path);
             BufferedReader bReader = new BufferedReader(reader)){

            String line = bReader.readLine();
            while (line != null){
                operationList.add(line);
                line = bReader.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<String[]> operationListUp1 = operationList.stream().map(s -> s.split(" ")).collect(Collectors.toList());
        List<String> operationListAdd = operationListUp1.stream().filter(x -> x[1].equals("+"))
                .map(s -> s[0] + " " + s[1] + " " + s[2] + " " + s[3] + " " + String.valueOf(Double.valueOf(s[0]) + Double.valueOf(s[2])))
                .collect(Collectors.toList());
        List<String> operationListMinus = operationListUp1.stream().filter(x -> x[1].equals("-"))
                .map(s -> s[0] + " " + s[1] + " " + s[2] + " " + s[3] + " " + String.valueOf(Double.valueOf(s[0]) - Double.valueOf(s[2])))
                .collect(Collectors.toList());
        List<String> operationListMul = operationListUp1.stream().filter(x -> x[1].equals("*"))
                .map(s -> s[0] + " " + s[1] + " " + s[2] + " " + s[3] + " " + String.valueOf(Double.valueOf(s[0]) * Double.valueOf(s[2])))
                .collect(Collectors.toList());
        List<String> operationListDivide = operationListUp1.stream().filter(x -> x[1].equals("/"))
                .map(s -> s[0] + " " + s[1] + " " + s[2] + " " + s[3] + " " + String.valueOf(Double.valueOf(s[0]) / Double.valueOf(s[2])))
                .collect(Collectors.toList());

        List<String> total = new ArrayList<>();
        operationListAdd.forEach(p -> total.add(p));
        operationListMinus.forEach(p -> total.add(p));
        operationListMul.forEach(p -> total.add(p));
        operationListDivide.forEach(p -> total.add(p));

        try (FileWriter writer = new FileWriter(path_2);
             BufferedWriter bWriter = new BufferedWriter(writer)){
             total.forEach(p -> {
                 try {
                     bWriter.write(p);
                     bWriter.newLine();
                 } catch (IOException e) {
                     throw new RuntimeException(e);
                 }
             });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
