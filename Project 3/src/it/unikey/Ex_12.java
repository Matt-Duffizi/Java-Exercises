package it.unikey;

public class Ex_12 {
    public static void main(String[] args) {

        int[] array1 = {3,-6,9,12,15,-6,9};
        int len1 = array1.length;

        System.out.println("\n Stampa Originale");
        for (int num : array1) {
            System.out.println(num);
        }


        int min =array1[0];
        int max =array1[0];

        for(int i = 0;i<len1;i++){
            if(array1[i]>max){
                max=array1[i];
            }
        }

        for(int i = 0;i<len1;i++){
            if(array1[i]<min){
                min=array1[i];
            }
        }

        int num_min = 0;
        int num_max = 0;

        for (int i =0;i<len1;i++){
            if(array1[i]== max){
                num_max++;
            } else if (array1[i]==min) {
                num_min++;
            }
        }
        System.out.println("\n Numero Max:" + num_max);
        System.out.println("\n Numero Min:" + num_min);

        int[] result =  new int[len1-(num_max+num_min)];

        int counter = 0;
        for(int j=0; j<len1;j++){
            if(array1[j] != max && array1[j] !=min){
                result[counter] = array1[j];
                counter++;
                }
            }


        System.out.println("\n SOLUZIONE\nARRAY SENZA MAX E MIN: \n");
        for (int num : result) {
            System.out.println(num);
        }



    }
}
