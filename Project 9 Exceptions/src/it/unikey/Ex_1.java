package it.unikey;

public class Ex_1 {
    public static void main(String[] args) {
        try {
            int[]  t = null;
            t[0] = 7;
        } catch (Exception e) {
            System.out.println("Null arrays can't contain any elements");
        }

    }
}
