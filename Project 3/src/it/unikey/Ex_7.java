package it.unikey;

public class Ex_7 {
    public static void main(String[] args) {

        int[] array = { 1, 2, 8, 4, 5, 6, 0, 8};
        System.out.println("\n Stampa Originale");
        for (int num : array) {
            System.out.println(num);
        }

        int max = array[0];
        int count = 0;

        for(int i = 0; i < array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        for(int i = 0; i< array.length;i++){
            if(array[i]==max){
                count++;
            }
        }

        int counter = 0;

        int[] array_ris = new int[count];
        for(int i = 0; i < array.length; i++){
            if(array[i]==max){
                array_ris[counter] = i;
                counter++;
            }
        }
        System.out.println("\nRisultato posizione");
        for (int num : array_ris) {
            System.out.println(num);
        }

    }
}
