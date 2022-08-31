package it.unikey;

import java.io.*;

public class Swap {

    boolean inverted = false;

    public Swap() {
    }

    public boolean isInverted(){
        return inverted;
    }

    public  Text[] swapFile(String path1, String path2) throws IOException {
        Text[] list = new Text[2];
        Text text1 = new Text();
        Text text2 = new Text();

        try(FileReader fileReader = new FileReader(path1);
            BufferedReader buffered_1 = new BufferedReader(fileReader)) {
            String string = buffered_1.readLine();
            while (string != null){
                text1.text.add(string);
                string = buffered_1.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(FileReader fileReader = new FileReader(path2);
            BufferedReader buffered_2 = new BufferedReader(fileReader)) {
            String string = buffered_2.readLine();
            while (string != null){
                text2.text.add(string);
                string = buffered_2.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(FileWriter fileWriter = new FileWriter(path1); FileWriter fileWriter2 = new FileWriter(path2);
            BufferedWriter buffered = new BufferedWriter(fileWriter); BufferedWriter buffered2 = new BufferedWriter(fileWriter2)) {
            text1.text.forEach(p -> {
                try {
                    buffered2.write(p);
                    buffered2.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            text2.text.forEach(p -> {
                try {
                    buffered.write(p);
                    buffered.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        list[0] = text1;
        list[1] = text1;

        if (this.inverted == false) this.inverted = true;
        else if (this.inverted == true) this.inverted = false;

        return list;
    }
}
