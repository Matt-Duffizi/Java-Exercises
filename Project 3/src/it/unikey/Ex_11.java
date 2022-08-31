package it.unikey;

public class Ex_11 {
    public static void main(String[] args) {
        int[] array1 = {3,-6,9,12,15,6,9};
        int len1 = array1.length;

        System.out.println("\n Stampa Originale");
        for (int num : array1) {
            System.out.println(num);
        }

        int[] result = new int[2];

        for(int i =0;i<len1-1;i++){
            for(int j=i+1;j<len1;j++){
                if (array1[i] == - array1[j]){
                    result[0]= array1[i];
                    result[1]= array1[j];
                    break;
                }
            }
        }
        if (result[0]==0){
            System.out.println("\nRisultato: null");
        } else {
            System.out.println("\nRisultato " + result[0] + " "+ result[1]);
        }
    }
}
