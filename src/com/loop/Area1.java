package com.loop;
import java.util.Scanner;
public class Area1 {
	 public Area1 (int a,int b, int c)
	 {
		 double d =(Math.addExact(a, b)/2)*c;
		System.out.println("Area of the Trapezoid is  :" +d);
		System.out.println();
	 }
	 public Area1 (int e, int f)
	 {
		 int g=e*f;
		System.out.println("Area of the Rectangle is  :" +g);
		System.out.println();
	 }
	 public  Area1 (int h)
	 {
		 double i = Math.PI *h*h;
		 System.out.println("Area of the circle       :" +i);
	 }
	 public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in); 
	   System.out.println("Enter the base1, base2 and height of the trapezoid");
	   int A = sc.nextInt();
	   System.out.println();
	   int B = sc.nextInt();
	  System.out.println();
	   int C = sc.nextInt();
	   Area1 D = new Area1(A, B, C);
	   System.out.println("Enter the breadth and height of the rectangle");
	   int e = sc.nextInt();
	   System.out.println();
	   int f = sc.nextInt();
	   Area1 G = new Area1(e, f);
	   System.out.println("Enter the radius of the circle");
	   int h = sc.nextInt();
	   Area1 I = new Area1(h);
	 }
}
