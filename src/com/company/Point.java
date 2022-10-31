package com.company;

import java.util.Scanner;

public class Point {

    private double x;
    private double y;


    void Point() {
        x = 0;
        y = 0;
    }

    void Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //constructor with parameters
    void setPoint(double a, double b) {
        this.x = a;
        this.y = b;
    }
    void inputPoint() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Введите абсциссу: ");
        double a = inp.nextDouble();
        System.out.print("Введите ординату: ");
        double b = inp.nextDouble();
        setPoint(a,b);
    }
    void printPoint() {
        System.out.print("("+x+";"+y+")");
    }

}
