package com.company;

public class Fraction {
    private int num;
    private int denom;
    public Fraction() {
        num = 1;
        denom = 1;
    }
    public Fraction(int num,int denom){
        this.num = num;
        if(denom!=0)
            this.denom = denom;
    }

    @Override
    public String toString() {
        return num + "/" + denom;
    }

    public void printFraction(){
        System.out.println(num + "/" + denom);
    }

    public Fraction substractFraction( Fraction secondFactor) {
        Fraction result = new Fraction();
        result.num = num - secondFactor.num;
        result.denom = denom - secondFactor.denom;
        return result;
    }
    public Fraction sumFraction( Fraction secondFactor) {
        Fraction result = new Fraction();
        result.num = num + secondFactor.num;
        result.denom = denom + secondFactor.denom;
        return result;
    }
    public Fraction shareFraction(Fraction secondFactor){
        Fraction result = new Fraction();
        result.num = num * secondFactor.denom;
        result.denom = denom * secondFactor.num;
        return result;
    }

}
