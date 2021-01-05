package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double radius;// = input.nextDouble();

        do {
            System.out.println("Enter radius of circle as a positive number:");
            while (!input.hasNextDouble()) {
                System.out.println("You did not enter a number.");
                input.next(); // this is important!
            }
            radius = input.nextDouble();

        } while (radius <= 0);
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
    }
}
