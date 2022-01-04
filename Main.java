package com.bridgelabz;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Variable Declaration
        int t,v;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Value Of temperature :");
        t = sc.nextInt();

        System.out.println("Enter The Value Of speed :");
        v = sc.nextInt();

        //Apllying formula of Wind Chill Temperature
        double w = (35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v,0.16));

        System.out.println("Wind Chill Temperature :"+w);
    }
}
