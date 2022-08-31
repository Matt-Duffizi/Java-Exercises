package it.unikey;

public class Ex_8 {
    public static void main(String[] args) {
        int[] array = {3,6,9,12,9,15};
        int len = array.length;

        System.out.println("\n Stampa Originale");
        for (int num : array) {
            System.out.println(num);
        }

        double min = array[0];
        int count = 0;

        if (len == 0 || min == 0) {
            System.out.println("false");
        } else {
            for(int i = 0; i < array.length;i++){
                if(array[i] < min){
                    min = array[i];
                }
            }

            System.out.println("\n Valore minimo: " + min);
            System.out.println("\n TEST di multiplo:");
            int test = 0;

            for(int i = 0; i < len; i++){
                double test_2 = array[i]%min;
                if(test_2!=0){
                    test = 1;
                }
            }

            if (test == 1){
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        }



    }
}
