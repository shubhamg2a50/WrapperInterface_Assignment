package oop.assignment;

//Rectangle.java
public class RectangleImp implements Shape {
private double length;
private double width;

// Constructor to initialize length and width
public RectangleImp(double length, double width) {
   this.length = length;
   this.width = width;
}

// Implement calculateArea() from Shape
@Override
public double calculateArea() {
   return length * width;
}

// Implement calculatePerimeter() from Shape
@Override
public double calculatePerimeter() {
   return 2 * (length + width);
}

public static void main(String[] args) {
   // Create a Rectangle object
   RectangleImp rectangle = new RectangleImp(5, 3);

   // Calculate and display area and perimeter
   System.out.println("Area: " + rectangle.calculateArea());
   System.out.println("Perimeter: " + rectangle.calculatePerimeter());
}
}