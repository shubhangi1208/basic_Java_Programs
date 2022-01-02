package com.bridgelabz;

import java.util.*;

public class distance {

	public static void main(String[] args) {
	       double Distance;
	       Scanner sc = new Scanner(System.in);  
	       System.out.print("Enter x1 : ");  
	       int x1 = sc.nextInt();  
	       
	       System.out.print("Enter x2 : ");  
	       int x2 = sc.nextInt();
	       
	       System.out.print("Enter y1 : ");  
	       int y1 = sc.nextInt();
	       
	       System.out.print("Enter y2 : ");  
	       int y2 = sc.nextInt();
	       
	     Distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	     System.out.println("Distance is "+ Distance );

	}

}
