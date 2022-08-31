package it.unikey;

public class Ex_3 {
    public static void main(String[] args) {
        int[] arr1 = {0,1,2};
        int[] arr2 = {10,11,12,13};

        int len1 = arr1.length;
        int len2 = arr2.length;
        int len3 = len1+len2;
        System.out.println("il primo array");
        for (int num: arr1) {
            System.out.println(num);
        }

        System.out.println("\nil secondo array");
        for (int num: arr2) {
            System.out.println(num);
        }

        int[] arr3 = new int[len3];

        for (int i = 0; i < len1; i++){
            arr3[i] = arr1[i];
        }

        for (int i = len1; i <len3; i++){
            arr3[i] = arr2[i-len1];
        }

        System.out.println("\nL'array concatenato");
        for (int num: arr3) {
            System.out.println(num);
        }

    }
}
