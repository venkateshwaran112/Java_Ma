package com.loop;

public class Area {
		
		 public int area (int a,int b, int c)
		 {
			 int d = ((a+b)/2)*c;
			 return d;
		 }
		 public int area (int e, int f)
		 {
			 int g=e*f;
			 return g;
		 }
		 public int area (int h)
		 {
			 double i = Math.PI *h*h;
			 return (int) i;
		 }
		 public static void main(String[] args) {
			
	       Area Ar = new Area();
	       int B = Ar.area(2, 4, 8);
	       System.out.println("Area of Trapezoid" +"   " +B);
	       int C = Ar.area(2);
	       System.out.println("Area of Circle" +"   " +C);
	       int D = Ar.area(2, 4);
	       System.out.println("Area of Rectangle"+"    " +D);
	       
		}
	
}
