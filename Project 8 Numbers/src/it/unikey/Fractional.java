package it.unikey;

public class Fractional implements NumberInterface{
    private int n = 1;
    private int d = 1;


    public Fractional(int n, int d) {
        this.n = n;
        this.d = d;
        if (this.d == 0) {
            this.d = 1;
            System.out.println("Non puoi avere 0 come denominatore è stato quindi automaticamente messo a 1");
        }
    }

    public boolean properDivision(){
        return Math.abs(n) < Math.abs(d);
    }

    public void inverse(){
        if (n == 0) System.out.println("Non puoi dividere per 0");
        else {
            double x =  (double) d/ (double) n;
            System.out.println(x);
        }
    }

    public int getN() {
        return n;
    }

    public int getD() {
        return d;
    }

    @Override
    public double value() {
        double x = (double) n/ (double) d;
        return x;
    }

    @Override
    public String printNum() {
        double x = (double) n/ (double) d;
        return String.valueOf(x);
    }
}
