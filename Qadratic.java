package com.bridgelabz;
import java.util.Scanner;

public class Qadratic {

	public static void main(String[] args) {
	       //Variable Declaration
	        int a, b, c;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Value Of A :");
	        a = sc.nextInt();

	        System.out.println("Enter the Value Of B :");
	        b = sc.nextInt();

	        System.out.println("Enter the Value Of C :");
	        c = sc.nextInt();

	        //Calculating Delta Value
	        int delta = ((b*b) - 4 * (a*c));
	        System.out.println("Delta ="+delta);

	        //Calulating Root1 of X
	        double root1X = ((-b + Math.sqrt(delta)) / (2*a));
	        System.out.println("Root 1 Of X ="+root1X);

	        //Calculating Root2 of X
	        double root2X = ((-b - Math.sqrt(delta)) / (2*a));
	        System.out.println("Root 2 Of X ="+root2X);
	    }
	}
