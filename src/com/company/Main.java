package com.company;


public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction(6,10);
        Fraction fraction3 = new Fraction(2,4);

        fraction1 = fraction2.shareFraction(fraction3);
        System.out.println(fraction1 + " Деление");
        fraction1 = fraction2.sumFraction(fraction3);
        System.out.println(fraction1 + " Сумма");
        fraction1 = fraction2.substractFraction(fraction3);
        System.out.println(fraction1 + " Вычитание");

        Point a = new Point();
        a.inputPoint();
        a.printPoint();
    }

}


