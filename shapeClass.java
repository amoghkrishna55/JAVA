//Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create three subclasses: Circle, Square, and Triangle. Override the draw() method in each subclass to draw the respective shape, and override the calculateArea() method to calculate and return the area of each shape.

class Shape {
    void draw() {
        System.out.println("Default draw");
    }

    void calculateArea() {
        System.out.println("Default calculateArea");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle draw");
    }

    void calculateArea() {
        System.out.println("Circle calculateArea");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Square draw");
    }

    void calculateArea() {
        System.out.println("Square calculateArea");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Triangle draw");
    }

    void calculateArea() {
        System.out.println("Triangle calculateArea");
    }
}

public class shapeClass {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        circle.calculateArea();
        Shape square = new Square();
        square.draw();
        square.calculateArea();
        Shape triangle = new Triangle();
        triangle.draw();
        triangle.calculateArea();
    }
}