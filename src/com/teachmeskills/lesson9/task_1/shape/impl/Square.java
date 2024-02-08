package com.teachmeskills.lesson9.task_1.shape.impl;

/**
 * Create the Square class and inherit the BaseShape class
 * Create fields for the Square
 * Create constructor
 * Inherit methods getPerimeterShape, getFigureShape and info
 * Fill in the method
 */

public final class Square extends BaseShape {
    double s, p, side;

    public Square(String nameShape, double side) {
        super(nameShape);
        this.side = side;
    }

    @Override
    public double getPerimeterShape() {
        p = 4 * side;
        return p;
    }

    @Override
    public double getFigureShape() {
        s = Math.pow(side, 2);
        return s;
    }

    public void info() {
        System.out.println("side length = " + side + ", perimeter = " + getPerimeterShape() +
                ", figure = " + getFigureShape() + "\n");
    }
}
