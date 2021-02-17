package com.company.hometask_06;

public class Rectangle {
    int length;
    int width;

    Rectangle() {
        length = 10;
        width = 5;
    }

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int perimeter() {
        return (length + width) * 2;
    }

    public int square() {
        return length * width;
    }
}
