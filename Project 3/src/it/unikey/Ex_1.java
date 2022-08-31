package it.unikey;

public class Ex_1 {
    public static void main(String[] args) {

        int[] array = {0,1,2,3,4};

        // stampa originale
        System.out.println("\n Stampa Originale");
        for (int num: array){
            System.out.println(num);
        }

        int last = array[array.length-1];

        for (int i = (array.length-1); i >= 0; i--){
            if (i == 0) {
                array[0] = last;
            } else {
                array[i] = array[i-1];
            }
        }

        // stampa cambiamento
        System.out.println("\n Stampa Cambiamento");
        for (int num: array){
            System.out.println(num);
        }
    }
}




