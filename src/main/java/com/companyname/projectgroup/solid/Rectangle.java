package com.companyname.projectgroup.solid;

public class Rectangle implements Shape {

    private double length;
    private double height;
    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    // getters/setters …
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (length * height);
    }
}
