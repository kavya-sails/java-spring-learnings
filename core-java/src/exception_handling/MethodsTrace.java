package exception_handling;

import generics.Shape;

import java.awt.*;
import java.time.format.TextStyle;

public class MethodsTrace {
    public static void main(String[] args) {
        print();
        Shape shape = new Shape() {
            @Override
            public int getArea() {
                return 0;
            }

            @Override
            public int getPerimeter() {
                return 0;
            }
        };
    }
    private static int print() {
        return print2();
    }
    private static int print2() throws NullPointerException{
        String str= null;
        return str.length();
    }
    private static void print3() {
    }
    private static void print4() {
    }
}
