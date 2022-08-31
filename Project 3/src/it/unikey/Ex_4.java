package it.unikey;

public class Ex_4 {
    public static void main(String[] args) {
        boolean[] arr1 = {false,true,true};

        System.out.println("il primo array");
        for (boolean num: arr1) {
            System.out.println(num);
        }

        float counter = 0;
        for (int i = 0; i< arr1.length; i++){
            if (arr1[i] == true) {
                counter++;
            }
        }

        System.out.println("\n\nIl Risultato\n");

        if (counter/arr1.length > 0.5){
            System.out.println(true);

        } else if (counter/arr1.length == 0.5) {
            System.out.println("null");
        } else {
            System.out.println(false);
        }

    }
}
