package com.kitcenter.app.classwork.lesson12;

public class Bicycle {
    private int wheelSize;
    private String color;
    private int maxSpeed;
    private String modelName;

    public Bicycle (int wheelSize, String color, int maxSpeed, String modelName) {
        this(wheelSize,color, modelName);
        this.maxSpeed = maxSpeed;
    }
    public Bicycle (int wheelSize, String color, String modelName) {
        this();
        this.modelName = modelName;
    }
    private Bicycle () {
        this.wheelSize = wheelSize;
        this.color = color;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
