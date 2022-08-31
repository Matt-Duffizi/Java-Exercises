package it.unikey;

public class Ex_9 {
    public static void main(String[] args) {
        int[] array = {3,6,9,12,9,15};
        int len = array.length;

        System.out.println("\n Stampa Originale");
        for (int num : array) {
            System.out.println(num);
        }

        int rep=0;
        int[] ref = array.clone();

        for (int i = 0;i<len;i++){
            for(int j = i+1;j<len;j++){
                if(array[i] == ref[j]){
                    rep = array[i];
                    break;
                }
            }
        }
        System.out.println("\nRisultato Primo valore a ripetersi\n" + rep);
    }
}
