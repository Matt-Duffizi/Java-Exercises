package it.unikey;

public class Ex_5 {
    public static void main(String[] args) {
        int[] array = {7,6,5,4};

        // stampa originale
        System.out.println("\n Stampa Originale");
        for (int num: array){
            System.out.println(num);
        }

        if (array.length>1) {

            int counter = 0;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    counter++;
                } else if (array[i] > array[i + 1]) {
                    counter--;
                } else {
                    counter = 0;
                }
            }

            System.out.println("\nL'Array è crescente o decrescente?");

            if (counter / (array.length - 1) == 1) {
                System.out.println(1 + " crescente");
            } else if (counter / (array.length - 1) == -1) {
                System.out.println(-1 + " decrescente");
            } else {
                System.out.println("0 indefinito");
            }
        } else{
            System.out.println("\nL'Array è crescente o decrescente?");
            System.out.println("0 indefinito");

        }

    }
}
