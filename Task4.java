
package com.EpamPEP.Task4;
/*for Java version less than 1.8 can run program by replacing public static void main(String[] args) with static*/

import java.util.*;
public class App
{

	public static void main(String[] args)
	{
         	try
         		{ 
			float p, r, t, sinterest,cinterest;
         	        Scanner scan = new Scanner(System.in);
         	        System.out.print("Enter the Principal(Amount) : ");
         	        p = scan.nextFloat();
         	        System.out.print("Enter the Rate of interest : ");
         	        r = scan.nextFloat();
         	        System.out.print("Enter the Time period in years: ");
         	        t = scan.nextFloat();
         	        scan.close();
         	        sinterest = (p * r * t) / 100;
         	       cinterest=(float) (p * Math.pow(1.0+r/100.0,t) - p);
         	        System.out.format("Simple Interest is: ");
         	       System.out.format("%f",sinterest);
         	        System.out.print("\nCompound Interest is: ");
         	       System.out.format("%f",cinterest);
         		}
         	catch(Exception e)
         	{
         		System.out.println("Please Enter Crct Option");
         	}
	}
