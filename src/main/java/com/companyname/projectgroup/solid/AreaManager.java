package com.companyname.projectgroup.solid;

import java.util.List;

/**
 *
 * @author Emin
 */
public class AreaManager {

    public double calculateArea(List<Shape> shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.getArea();
        }
        return area;
    }
}
