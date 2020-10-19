package com.example.project;
import java.lang.Math;

public class Triangle {
    private double a; //declares instance variable a that we will use later in the code
    private double b; //declares instance variable b that we will use later in the code
    private double c; //declares instance variable c that we will use later in the code
    private double d; //declares instance variable d that we will use later in the code
    private double e; //declares instance variable e that we will use later in the code
    private double f; //declares instance variable f that we will use later in the code

    public Triangle() { //method signature for a triangle with no parameters
        a = 0; // this and following 'identical' lines initialize the instance variables to 0 so that we can change them later
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;

    }

    public Triangle(double x0, double y0, double x1, double y1, double x2, double y2) { //method signature for a triangle with 6 parameters (x and y coordinates of each point)
        a = x0; // this and subsequent lines sets the parameters equal to the parameters of the empty triangle (changing those values to what we specify)
        b = y0;
        c = x1;
        d = y1;
        e = x2;
        f = y2;
    }

    // your code goes here: good luck =)


    // DO NOT DELETE THESE!
    public double getx0() {//method signature for accessor method getx0 (gets coordinate of x0 point)
        return a;
    }

    public double gety0() {// same as above but for y0 which is y coordinate of first point
        return b;
    }

    public double getx1() {//''
        return c;
    }

    public double gety1() {//''
        return d;
    }

    public double getx2() {//''
        return e;
    }

    public double gety2() {//''
        return f;
    }

    public double perimeter() {//method signature for perimeter method which calculates the perimeter of the triangle, no parameters
        double edge1 = Math.sqrt((c - a) * (c - a) + (d - b) * (d - b));//this and following two lines calculate edge length between two points
        double edge2 = Math.sqrt((e - c) * (e - c) + (f - d) * (f - d));
        double edge3 = Math.sqrt((e - a) * (e - a) + (f - b) * (f - b));
        return edge1 + edge2 + edge3; //returns the sum of the length of the edges we calculated (perimeter is the sum of the edge lengths)

    }

    public double area() { //method signature for area method which calculates the area of the triangle, no parameters
        double edge1 = Math.sqrt((c - a) * (c - a) + (d - b) * (d - b)); //this and following two lines calculate edge length between two points
        double edge2 = Math.sqrt((e - c) * (e - c) + (f - d) * (f - d));
        double edge3 = Math.sqrt((e - a) * (e - a) + (f - b) * (f - b));
        double s = ((edge1 + edge2 + edge3) / 2); //using herons formula, specifying the s term
        double area1 = Math.sqrt((s * (s - edge1) * (s - edge2) * (s - edge3)));//calculating the area
        return area1; //returning the calculated area value
    }

    public void translateX(double translatorBYx) { //method signature for translateX mutator, one parameter(translatorBYx) specifying how much to translate the triangle in the x direction
        a = a + translatorBYx; //setting x coordinates to be shifted from the initial ones
        c = c + translatorBYx;//''
        e = e + translatorBYx;//''

    }

    public void translateY(double translatorBYy) {//method signature for translateY mutator, one parameter(translatorBYy) specifying how much to translate the triangle in the y direction
        b = b + translatorBYy; //setting y coordinates to be shifted from the initial ones
        d = d + translatorBYy;
        f = f + translatorBYy;

    }

    public double length(double h, double i) { //method signature for the Hard test, given two parameters (h and i) calculate the length between the associated points and uses if statements
        double length1=0; // setting instance variable (which we will mutate throughout this method) initially equal to 0
        if (h == 0) {
            if(i==1){ //if h=0 and i=1, do following line calculating length 1
            length1=Math.sqrt((c - a) * (c - a) + (d - b) * (d - b));

            }
            else{
               length1=Math.sqrt((e - a) * (e - a) + (f - b) * (f - b)); //if i =2, do this line
//we don't have to worry about the distance between a point and itself because that is just 0
            }

        }
        if (h == 1) {
            if(i==0){ //if h-1 and i=0, do following lines calculating length1
                length1=Math.sqrt((c - a) * (c - a) + (d - b) * (d - b));

            }
            else{
                length1=Math.sqrt((e - c) * (e - c) + (f - d) * (f - d)); //if i=2 do this line to calculate the length between the associated points

            }


    }
        if (h == 2) {
            if(i==0){ //if h =2 and i =0, do following lines calculating length 1
                length1=Math.sqrt((c - a) * (c - a) + (d - b) * (d - b));

            }
            else{
                length1=Math.sqrt((e - c) * (e - c) + (f - d) * (f - d)); //if i equals 1 do this line calculating length

            }

}
    return length1;}} //at the end of all these if statements, return the appropriate calculated length1 value for the distance between the two associated points



