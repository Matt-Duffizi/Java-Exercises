package it.unikey;

public class Ex_6 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6,0,8};
        int len_par = 0;
        int len_dis = 0;
        int len_tot = array.length;

        // stampa originale
        System.out.println("\n Stampa Originale");
        for (int num : array) {
            System.out.println(num);
        }

        for (int i = 0; i < len_tot; i++) {
            if (array[i] % 2 == 0) {
                len_par++;
            } else {
                len_dis++;
            }
        }
        System.out.println("\n Lunghezza pari " + len_par);
        System.out.println("\n Lunghezza dispari " + len_dis);

        int[] arr_par = new int[len_par];
        int[] arr_dis = new int[len_dis];
        int[] array_temp = new int[len_tot];

        int counter_par = 0;
        int counter_dis = 0;
        for(int i = 0; i < len_tot; i++){
            if(array[i]%2==0){
              arr_par[counter_par] =  array[i] ;
                counter_par++;
            }   else {
                 arr_dis[counter_dis]= array[i];
                counter_dis++;
            }
        }

        for(int i = 0 ;i<len_par;i++){
            array_temp[i]=arr_par[i];
        }

        int new_counter=0;
        for(int i = len_par ;i<len_tot;i++){
            array_temp[i]=arr_dis[new_counter];
            new_counter++;
        }
        // stampa originale
        System.out.println("\n Stampa Tot");
        for (int num : array_temp) {
            System.out.println(num);
        }
    }

}
