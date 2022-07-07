package com.loop;

import java.util.Scanner;

public class IF_ELSE {
	int b[] = new int[7];
	int f,p;

	public IF_ELSE (int b[])
	{
	float sum=0;
		for (int i=0;i<3;i++)
		{
			 sum = sum + b[i];
		}
		for (int i=0;i<3;i++)
		{
			if (b[i]<50)
			{
				f=1;
				
			}
			else if(b[i]>50)
			{
			p=2;
			
			}
		}
		if ( f==1)
		{
			System.out.println();
			System.out.println("The result is fail");
			System.out.println();
			System.out.println("Total Marks Obtained :  " +sum);
		}
		else 
		{
			System.out.println();
			System.out.println("The result is pass");
			System.out.println();
			System.out.println("Total Marks obtained : " +sum);
				}
		double g = (sum /300)*10;
			if (g>=9.0)
				System.out.println("Grade Obtained       : S");
			else if(g>=8.0)
				System.out.println("Grade Obtained       : A");
			else if(g>=7.0)
				System.out.println("Grade Obtained       : B");
			else if(g>=6.0)
				System.out.println("Grade Obtained       : C");
			else if(g>=5.0)
				System.out.println("Grade Obtained        :D");
			else if (g>=4.0)
				System.out.println("Grade Obtained        :E");
		
		 
	}
	
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	int a[] = new int[7];
	int i;
	System.out.println("Enter the marks");
	
	for(i=0;i<3;i++)
	{
		if (i==0)
		{
			System.out.print("English : "  );
			a[i] = S.nextInt();
		}
		else if (i==1)
		{
			System.out.print("Tamil   : ");
			a[1]=S.nextInt();
		}
		else if (i==2)
		{
			System.out.print("Maths   : ");
			a[i]=S.nextInt();
		}
			
	}
	
	IF_ELSE ie = new IF_ELSE(a);	
	
}

}
