import java.util.Scanner;
//Jonathan Ko
//assignement 2
//problem 1

public class taxRate 
{//start class

	public static void main(String[] args) 
	{//start main
		//declare variables
		double price1,price2, price3;
		double taxRate, tax,total,subtotal;
		//read inputs
		Scanner input = new Scanner(System.in);
		System.out.print("Enter tax rate as percentage: ");
		taxRate = Double.parseDouble(input.nextLine());
		System.out.print("Enter price of first item: ");
		price1 = Double.parseDouble(input.nextLine());
		System.out.print("Enter price of second item: ");
		price2 = Double.parseDouble(input.nextLine());
		System.out.print("Enter price of third item: ");
		price3 = Double.parseDouble(input.nextLine());
		//calculate subtotal
		subtotal=price1+price2+price3;
		//calculate tax
		taxRate=taxRate/100;
		tax=subtotal*taxRate;
		//calculate total
		total=subtotal+tax;
		//display
		System.out.println("Subtotal: "+subtotal);
		System.out.println("Tax: "+tax);
		System.out.println("Total: "+total);
		System.out.println("Programmed by Jonathan Ko");

	}//end main

}//end main
/*
 * test case 1
 * Enter tax rate as percentage: 7
 * Enter price of first item: 22
 * Enter price of second item: 10
 * Enter price of third item: 15
 * Subtotal: 47.0
 * Tax: 3.2900000000000005
 * Total: 50.29
 * Programmed by Jonathan Ko
 * 
 * test case 2
 * Enter tax rate as percentage: 5
 * Enter price of first item: 10
 * Enter price of second item: 20
 * Enter price of third item: 30
 * Subtotal: 60.0
 * Tax: 3.0
 * Programmed by Jonathan Ko
 *
 * test case 3
 * Enter tax rate as percentage: 8
 * Enter price of first item: 19.5
 * Enter price of second item: 22.95
 * Enter price of third item: 32.75
 * Subtotal: 75.2
 * Tax: 6.016
 * Total: 81.21600000000001
 * Programmed by Jonathan Ko
 */