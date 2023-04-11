package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeList = new ArrayList<>();


    public void addShape(Shape shape) {
        shapeList.add(shape);
    }

    public void removeShape(Shape shape) {
        shapeList.remove(shape);
    }

    public Shape getShape(int index) {
        return shapeList.get(index);
    }

    public String getAllShapes() {
        String result = "";


        for (Shape name : shapeList) {
            if (name.equals(shapeList.get(shapeList.size() - 1))) {
                result += name.getShapeName();
            } else {
                result += name.getShapeName() + ", ";
            }
        }
        return result;
    }

    public boolean isListEmpty() {
        if (shapeList.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}



