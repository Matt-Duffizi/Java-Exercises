package it.unikey;

public class Operation implements NumberInterface{

    private double op1;
    private double op2;
    private char sign;

    public Operation(double op1, double op2, char sign) {
        this.op1 = op1;
        this.op2 = op2;
        this.sign = sign;
    }

    public double getOp1() {
        return op1;
    }

    public double getOp2() {
        return op2;
    }

    public char getSign() {
        return sign;
    }

    @Override
    public double value() {
        switch (sign){
            case '+':
                return op1+op2;
            case '-':
                return op1-op2;
            case '*':
                return op1*op2;
            case '/':
                return op1/op2;}
        return 0;
    }

    @Override
    public String printNum() {
        return String.valueOf(op1) + this.sign + String.valueOf(op2);
    }
}
