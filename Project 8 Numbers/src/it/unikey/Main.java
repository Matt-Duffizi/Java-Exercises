package it.unikey;

public class Main {
    public static void main(String[] args) {

//        Integer int_1 = new Integer(4);
//        System.out.println(int_1.getV());
//        System.out.println(int_1.printNum());
//        System.out.println(int_1.isdiv(2));
//        System.out.println(int_1.isdiv(3));
//        System.out.println(int_1.value());


//        Fractional fra_1 = new Fractional(5,8);
//        System.out.println(fra_1.printNum());
//        System.out.println(fra_1.properDivision());
//        fra_1.inverse();
//        System.out.println(fra_1.value());
//
//
//        System.out.println(fra_1.getD());
//        System.out.println(fra_1.getN());;


        Operation op_1 = new Operation(4,5.5,'+');
        System.out.println(op_1.getSign());
        System.out.println(op_1.printNum());
        System.out.println(op_1.value());
    }
}
