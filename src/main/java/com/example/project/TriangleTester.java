package com.example.project;

public class TriangleTester {
    public static void main(String[] args) {
        Triangle myTriangle= new Triangle(0,0,5,0,5,5);
        System.out.println("The area of your triangle is:  ");
        System.out.println(myTriangle.area());
        System.out.println("Expected: 12.5");

        System.out.println("The length of the side between points 0 and 1 is:");
        System.out.println(myTriangle.length(0,1));
        System.out.println("Expected: 5");

        System.out.println("The perimeter of your triangle is: ");
        System.out.println(myTriangle.perimeter());
        System.out.println("Expected: 17.071");

        myTriangle.translateX(5);
        myTriangle.translateY(5);
        System.out.println("After translating 5 units in the x direction and 5 units in the y directionthese are the new coordinates of your triangle:");
        System.out.println(myTriangle.getx0());
        System.out.println("Expected: 5");
        System.out.println(myTriangle.gety0());
        System.out.println("Expected: 5");
        System.out.println(myTriangle.getx1());
        System.out.println("Expected: 10");
        System.out.println(myTriangle.gety1());
        System.out.println("Expected: 5");
        System.out.println(myTriangle.getx2());
        System.out.println("Expected: 10");
        System.out.println(myTriangle.gety2());
        System.out.println("Expected: 10");



















    }
}