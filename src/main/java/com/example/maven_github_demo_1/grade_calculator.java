package com.example.maven_github_demo_1;

public class grade_calculator {
	public static int calculatetotal(int m1,int m2,int m3)
	{
		return m1+m2+m3;
	}
	public static double calculateaverage(int m1,int m2,int m3)
	{
		return calculatetotal(m1,m2,m3)/3.0;
	}
	public static boolean ispass(double average)
	{
		return average >=40.0;
	}
	public static void main(String[] args) 
	{
		int m1=75, m2=68, m3=82;
		int total=calculatetotal(m1,m2,m3);
		double average = calculateaverage(m1,m2,m3);
		System.out.println("Total : "+total);
		System.out.println("Average : "+average);
		System.out.println("Result : "+(ispass(average)? "PASS" : "FAIL"));
	}

}
