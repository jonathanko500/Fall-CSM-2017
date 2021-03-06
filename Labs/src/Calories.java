import java.util.Scanner;

//Jonathan Ko
//lab 4 problem 2
public class Calories 
{//start of class
	public static void main (String []args)
	{//start of main
		//Declare all variables
		String foodName;
		double carbCalories, protienCalories, fatCalories;
		double gramCarb, gramProtien, gramFat;
		double totalCalories, fatPct,fatPctDec;
		//read inputs
		Scanner input = new Scanner(System.in);
		System.out.print("Enter food name: ");
		foodName = input.nextLine();
		System.out.print("Enter carb grams: ");
		gramCarb = Double.parseDouble(input.nextLine());
		System.out.print("Enter protien grams: ");
		gramProtien = Double.parseDouble(input.nextLine());
		System.out.print("Enter fat grams: ");
		gramFat = Double.parseDouble(input.nextLine());
		//calculate calories
		carbCalories=gramCarb*4;
		protienCalories=gramProtien*4;
		fatCalories=gramFat*9;
		//calculate total
		totalCalories=carbCalories+protienCalories+fatCalories;
		//calculate fat%
		fatPctDec=fatCalories/totalCalories;
		fatPct= fatPctDec*100;
		//display
		System.out.println("Calories in "+foodName+": "+totalCalories);
		System.out.println("Fat percentage: "+ fatPct);
	}//end of main
	
	/*
	 * test case 1
	 * Enter food name: bagel
		Enter carb grams: 56.1
		Enter protien grams: 11
		Enter fat grams: 1.7
		Calories in bagel: 283.7
		Fat percentage: 5.393020796616144
		
		test case 2
		Enter food name: nuts
		Enter carb grams: 2
		Enter protien grams: 12
		Enter fat grams: 10
		Calories in nuts: 146.0
		Fat percentage: 61.64383561643836
		
		
		test case 3
		Enter food name: brownie
		Enter carb grams: 38.9
		Enter protien grams: 12.7
		Enter fat grams: 0.1
		Calories in brownie: 207.29999999999998
		Fat percentage: 0.43415340086830684

		
	 */

}//end of class
