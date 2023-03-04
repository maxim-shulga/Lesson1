package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter length of first side");
        myRect.side1 = in.nextDouble();
        System.out.println("Enter length of second side");
        myRect.side2 = in.nextDouble();

        System.out.println("Area of the rectangle is " + myRect.areaCalculator());
        System.out.println("Perimeter of the rectangle is " + myRect.perimeterCalculator());
    }
}
