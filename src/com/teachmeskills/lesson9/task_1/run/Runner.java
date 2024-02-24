package com.teachmeskills.lesson9.task_1.run;

import com.teachmeskills.lesson9.task_1.shape.*;

/**
 * Runner class
 * Creates 5 shape objects
 * Creates an array with these shapes
 * Activate a Foreach loop for our array of shapes
 * In the loop :
 * Sum the values of all perimeters into the variable sum.
 * Output the parameters of the shapes.
 * The loop has completed its work.
 * Print the sum of perimeters of all figures
 */
public class Runner {
    public static void main(String[] args) {
        double sum = 0.0;

        BaseShape circle = new Circle("Circle", 22.0);
        BaseShape hexagon = new Hexagon("Hexagon", 5.0);
        BaseShape rectangle = new Rectangle("Rectangle", 3.4, 6.0);
        BaseShape square = new Square("Square", 5.0);
        BaseShape triangle = new Triangle("Triangle", 7.0, 9.0, 2.5);

        BaseShape[] shapes = {circle, hexagon, rectangle, square, triangle};
        for (BaseShape shape : shapes) {
            sum += shape.getPerimeterShape();
            System.out.print("Shape parameters " + shape.nameShape + ": ");
            shape.info();
        }
        System.out.println("sum of the perimeters of all shapes: " + sum);
    }
}
