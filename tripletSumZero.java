package com.bridgelabz;
import java.util.*;

class tripletSumZero{

static void findTriplets(int[] arr, int n)
{
    boolean found = false;
    int count=0;
    for (int i=0; i<n-2; i++)
    {
        for (int j=i+1; j<n-1; j++)
        {
            for (int k=j+1; k<n; k++)
            {
                if (arr[i]+arr[j]+arr[k] == 0)
                {
                	System.out.println("triplet whose addition is zero");
                    System.out.print(arr[i]);
                    System.out.print(" ");
                    System.out.print(arr[j]);
                    System.out.print(" ");
                    System.out.print(arr[k]);
                    System.out.print("\n");
                    found = true;
                    if(found==true)
                    {
                    	count++;
                    }
                }
                
            }
        }
      
    }
  
   System.out.println(count+" distinct triplets are found whose addition is zero " );
    if (found == false)
        System.out.println(" not exist ");
 
}
 

public static void main(String[] args)
{
	
    int[] arr = new int[7];  
    Scanner sc = new Scanner(System.in); 
   
    for (int i =0;i<7;i++)  
    {  
        
            System.out.print("Enter Element");  
            arr[i]=sc.nextInt();  
            System.out.println();  
        }  
    findTriplets(arr, 7);
    }  
}


