package it.unikey;

public class Ex_10 {
    public static void main(String[] args) {
            int[] array1 = {3,6,9,12,9,15};
            int[] array2 = {3,6,4,4,2,15};
            int len1 = array1.length;
            int len2 = array2.length;

            int count = 0;

            if(array1[0]==array2[0]){
                count=1;
            }

            for (int i = 0; i < len1 ;i++){
                int num = array1[0];
                for(int j = i; j < len2;j++){
                    if(array1[i]==array2[j] && array2[j]!=num){
                        count++;
                        num = array1[i];
                    }
                }
            }
             System.out.println("\nRisultato Coppie\n" + count);
    }
}
