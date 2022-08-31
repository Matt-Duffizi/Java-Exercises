package it.unikey;

public class Ex_2 {
    public static void main(String[] args) {
        try {
            String s=null;
            int l = s.length();
        } catch (Exception e) {
            System.out.println("Null strings don't have any length");
            System.out.println("Return" + e.getMessage());
        }
    }
}
