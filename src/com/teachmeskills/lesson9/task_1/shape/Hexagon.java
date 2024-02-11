package com.teachmeskills.lesson9.task_1.shape;

import java.text.DecimalFormat;

import static java.lang.Math.sqrt;

/**
 * Create the Hexagon class and inherit the BaseShape class
 * Create fields for the Hexagon
 * Create constructor
 * Inherit methods getPerimeterShape, getFigureShape and info
 * Fill in the method
 */

public final class Hexagon extends BaseShape {
    double p, s, side;

    public Hexagon(String nameShape, double side) {
        super(nameShape);
        this.side = side;
    }

    @Override
    public double getPerimeterShape() {
        p = 6 * side;
        return p;
    }

    @Override
    public double getFigureShape() {
        s = (((3 * sqrt(3) / 2) * Math.pow(side, 2)));
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return Double.parseDouble(decimalFormat.format(s));
    }

    public void info() {
        System.out.println("side length = " + side + ", perimeter = " + getPerimeterShape() +
                ", figure = " + getFigureShape() + "\n");
    }
}
