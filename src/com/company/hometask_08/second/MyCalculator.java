package com.company.hometask_08.second;

import com.company.hometask_08.first.Numerable;

public class MyCalculator implements Numerable {
        private double a;
        private double b;

        public MyCalculator(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        @Override
        public double addition() {
            return a+b;
        }

        @Override
        public double subtraction() {
            return a-b;
        }

        @Override
        public double multiplication() {
            return a*b;
        }

        @Override
        public double division() {
            return a/b;
        }
}
