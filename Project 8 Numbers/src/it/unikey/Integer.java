package it.unikey;

public class Integer implements NumberInterface{
    private int v;

    public Integer(int v) {
        this.v = v;
    }

    public boolean isdiv(int v2){
        return v % v2 == 0;
    }

    public int getV() {
        return v;
    }

    @Override
    public double value() {
        return v;
    }

    @Override
    public String printNum() {
        return String.valueOf(v);
    }
}
