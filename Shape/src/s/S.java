/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s;

import java.util.Scanner;

interface Shape {

    final double PI = 3.14;

    default void description() {
        System.out.println("Day la 1 cai hinh");
    }

    double area(int a);

    double area(int a, int b);

    double perimeter(int a);

    double perimeter(int a, int b);
}

class Circle implements Shape {

    @Override
    public void description() {
        System.out.println("Day la hinh tron");
    }

    @Override
    public double area(int a) {
        return PI * a * a;
    }

    @Override
    public double perimeter(int a) {
        return 2 * PI * a;
    }

    @Override
    public double area(int a, int b) {
        return 0;
    }

    @Override
    public double perimeter(int a, int b) {
        return 0;
    }
}

class Rectangle implements Shape {

    @Override
    public void description() {
        System.out.println("Day la hinh chu nhat");
    }

    @Override
    public double area(int a) {
        return 0;
    }

    @Override
    public double perimeter(int a) {
        return 0;
    }

    @Override
    public double area(int a, int b) {
        return a * b;
    }

    @Override
    public double perimeter(int a, int b) {
        return (a + b) * 2;
    }
}

public class S {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape circle = new Circle();

        circle.description();
        System.out.print("Input r: ");
        int r = scanner.nextInt();
        System.out.println("Area of circle: " + circle.area(r));
        System.out.println("Perimeter of circle: " + circle.perimeter(r));

        int[] triangleSides = inputTriangleSides(scanner);
        int canh1 = triangleSides[0];
        int canh2 = triangleSides[1];

        Shape rectangle = new Rectangle();
        rectangle.description();
        System.out.println("Area of rectangle: " + rectangle.area(canh1, canh2));
        System.out.println("Perimeter of rectangle: " + rectangle.perimeter(canh1, canh2));
    }

    public static int[] inputTriangleSides(Scanner scanner) {
        int canh1, canh2;
        while (true) {
            System.out.print("Input chieu dai: ");
            canh1 = scanner.nextInt();
            System.out.print("Input chieu rong: ");
            canh2 = scanner.nextInt();

            if (canh2 > canh1) {
                System.out.println("Chieu dai khong the be hon chieu rong");
            } else if (canh2 == canh1) {
                System.out.println("Chieu dai bang chieu rong (hinh vuong)");
            } else {
                break;
            }
        }
        return new int[]{canh1, canh2};
    }
}
