package it.unikey;

public class Ex_2 {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6};

        // stampa originale
        System.out.println("\n Stampa Originale");
        for (int num: array){
            System.out.println(num);
        }

        int len = array.length;
        int[] array_temp = new int[len];
        System.arraycopy(array, 0, array_temp, 0, len);

        if (len%2 == 0) {
            for (int i = 0; i < len / 2; i++) {
                array[i] = array[i + len / 2];
            }

            for (int i = len / 2; i < len; i++) {
                array[i] = array_temp[i - len / 2];
            }
        } else {
            for (int i = 0; i < len/2; i++){
                array[i] = array[1+i+len/2];
            }

            for (int i = 1+len/2; i < len; i++){
                array[i] = array_temp[i-1-len/2];
            }
        }

        // stampa cambiamento
        System.out.println("\n Stampa Cambiamento");
        for (int num: array){
            System.out.println(num);
        }
    }
}
