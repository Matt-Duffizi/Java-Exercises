package it.unikey;

import java.io.*;
import java.util.ArrayList;

public class Ex_3 {
    public static void main(String[] args) throws IOException {

        Swap swapper =new Swap();
        String path1 = "DivinaStart.txt";
        String path2 = "DivinaEnd.txt";

        System.out.println(swapper.isInverted());
        Text[] list = swapper.swapFile(path1,path2);
        System.out.println(swapper.isInverted());


    }

}

