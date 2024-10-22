package com.google.Calculation;

import tools.Calc;
import tools.AdvCalc;
import other.A;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        Calc obj = new Calc();
        AdvCalc obj1 = new AdvCalc();
        A obj2 = new A();

        System.out.println("Addition: " + obj.add(10, 5));
        System.out.println("Multiplication: " + obj1.multi(10, 5));
    }
}
