package com.teachmeskills.lesson9.task_1.shape;

/**
 * Create the Circle class and inherit the BaseShape class
 * Create fields for the circle
 * Create constructor
 * Inherit methods getPerimeterShape, getFigureShape and info
 * Fill in the method
 */

public final class Circle extends BaseShape {
    double pi = 3.14, radius, p, s;

    public Circle(String nameShape, double radius) {
        super(nameShape);
        this.radius = radius;
    }

    @Override
    public double getPerimeterShape() {
        p = 2 * pi * radius;
        return p;
    }

    @Override
    public double getFigureShape() {
        s = pi * Math.pow(radius, 2);
        return s;
    }

    public void info() {
        System.out.println("Number of PI = " + pi + ", radius = " + radius +
                ", perimeter = " + getPerimeterShape() + ", figure = " + getFigureShape() + "\n");
    }

}
