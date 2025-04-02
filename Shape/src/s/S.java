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

    double area(int a, int b, int c);

    double perimeter(int a);

    double perimeter(int a, int b, int c);
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
    public double area(int a, int b, int c) {
        return 0;
    }

    @Override
    public double perimeter(int a, int b, int c) {
        return 0;
    }
}

class Triangle implements Shape {

    @Override
    public void description() {
        System.out.println("Day la hinh tam giac");
    }

    @Override
    public double area(int a) {
        return 0;
    }

    @Override
    public double area(int a, int b, int c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter(int a) {
        return 0;
    }

    @Override
    public double perimeter(int a, int b, int c) {
        return a + b + c;
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
        int canh3 = triangleSides[2];

        Shape triangle = new Triangle();
        triangle.description();
        System.out.println("Area of triangle: " + triangle.area(canh1, canh2, canh3));
        System.out.println("Perimeter of triangle: " + triangle.perimeter(canh1, canh2, canh3));
    }

    public static int[] inputTriangleSides(Scanner scanner) {
        int canh1, canh2, canh3;
        while (true) {
            System.out.print("Input canh 1 cua tam giac: ");
            canh1 = scanner.nextInt();
            System.out.print("Input canh 2 cua tam giac: ");
            canh2 = scanner.nextInt();
            System.out.print("Input canh 3 cua tam giac: ");
            canh3 = scanner.nextInt();

            if ((canh1 + canh2 <= canh3) || (canh2 + canh3 <= canh1) || (canh1 + canh3 <= canh2)) {
                System.out.println("Wrong Input. Please input again.");
            } else {
                break;  
            }
        }
        return new int[] {canh1, canh2, canh3};  
    }
}

    


