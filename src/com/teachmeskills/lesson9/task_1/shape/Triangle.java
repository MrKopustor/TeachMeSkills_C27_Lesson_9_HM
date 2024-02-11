package com.teachmeskills.lesson9.task_1.shape;

import java.text.DecimalFormat;

/**
 * Create the Triangle class and inherit the BaseShape class
 * Create fields for the Triangle
 * Create constructor
 * Inherit methods getPerimeterShape, getFigureShape and info
 * Fill in the method
 */

public final class Triangle extends BaseShape {
    double s, p, sideA, sideB, sideC;

    public Triangle(String nameShape, double sideA, double sideB, double sideC) {
        super(nameShape);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getPerimeterShape() {
        p = sideA + sideB + sideC;
        return p;
    }

    @Override
    public double getFigureShape() {
        double pp = p / 2;
        s = Math.sqrt(pp * (pp - sideA) * (pp - sideB) * (pp - sideC));
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return Double.parseDouble(decimalFormat.format(s));
    }

    public void info() {
        System.out.println("side length A = " + sideA + ", side length b = " + sideB +
                ", side length C = " + sideC + ", perimeter = " + getPerimeterShape() +
                ", figure = " + getFigureShape() + "\n");
    }
}
