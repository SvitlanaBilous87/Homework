package com.company.hometask_20;

import java.io.Serializable;

public class Salary <K extends Number> implements Serializable {

    private K sum;

    public Salary(K sum) {
        this.sum = sum;
    }

    public Salary() {
    }

    public K getSum() {
        return sum;
    }

    public void setSum(K sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "sum=" + sum +
                '}';
    }
}
