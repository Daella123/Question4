package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate area:");
        System.out.println("1 = Circle");
        System.out.println("2 = Rectangle");
        System.out.println("3 = Triangle");
        int choice = scanner.nextInt();

        Shape shape = null;

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                shape = new Rectangle(length, width);
                break;
            case 3:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                shape = new Triangle(base, height);
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }


        System.out.println("The area is: " + shape.calculateArea());

    }
}