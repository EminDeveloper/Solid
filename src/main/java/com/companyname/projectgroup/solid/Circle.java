package com.companyname.projectgroup.solid;

/**
 *
 * @author Emin
 */
public class Circle implements Shape {

    private double radius;
    
    public double getRadius() {
        return radius;
    }

    // getters/setters …
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (radius * radius * Math.PI);
    }
}
