import java.util.Scanner;
//problem 3
public class hawaii
{//start class
	public static void main(String[] args)
	{//start class
		// declare variable
		String island;
		int valid=1;
		double cost=0,discount,total,night,discountTotal;
		//read input
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Hawaiian Vacations!");
		System.out.println("Packages are available for Kauai, Maui, or Oahu");
		System.out.print("Which island do you choose? ");
		island=input.nextLine();
		island=island.toUpperCase();
		//determine cost
		switch(island)
		{
		case "KAUAI":cost=179;
		break;
		case "MAUI":cost=199;
		break;
		case "OAHU":cost=149;
		break;
		default: System.out.println("Unknown island");
		valid=0;
		}
		//correct island
		if (valid==1)
		{
			System.out.printf("Cost is $%.2f per night%n",cost);
			//figure out # of nights
			System.out.print("How many nights (10% discount for 7 or more nights)? ");
			night=Double.parseDouble(input.nextLine());
			System.out.println("");
			System.out.printf((int)night+" nights at $%.2f per night%n",cost);
			//calculate total
			total=night*cost;
			//calculate discount
			if(night>=7)
			{
				//calculate discount
				discount=total*.1;
				discountTotal=total-discount;
				//display output
				System.out.printf("Total is $%.2f%n", total);
				System.out.println("You qualify for 10% discount");
				System.out.printf("Your discounted total is $%.2f%n", discountTotal);
			}
			else
			{
				System.out.printf("Total is $%.2f%n", total);
			}
		}
		System.out.println("Programmed by Jonathan Ko");
	}//end class
}//end main

/*
 * test 1
 * Welcome to Hawaiian Vacations!
 * Packages are available for Kauai, Maui, or Oahu
 * Which island do you choose? oahu
 * Cost is $149.00 per night
 * How many nights (10% discount for 7 or more nights)? 10
 * 
 * 10 nights at $149.00 per night
 * Total is $1490.00
 * You qualify for 10% discount
 * Your discounted total is $1341.00
 * Programmed by Jonathan Ko
 * 
 * test 2
 * Welcome to Hawaiian Vacations!
 * Packages are available for Kauai, Maui, or Oahu
 * Which island do you choose? kauai
 * Cost is $179.00 per night
 * How many nights (10% discount for 7 or more nights)? 3
 * 
 * 3 nights at $179.00 per night
 * Total is $537.00
 * Programmed by Jonathan Ko
 * 
 * test 3
 * Welcome to Hawaiian Vacations!
 * Packages are available for Kauai, Maui, or Oahu
 * Which island do you choose? maui
 * Cost is $199.00 per night
 * How many nights (10% discount for 7 or more nights)? 7
 * 
 * 7 nights at $199.00 per night
 * Total is $1393.00
 * You qualify for 10% discount
 * Your discounted total is $1253.70
 * Programmed by Jonathan Ko
 * 
 *  test 4
 *  Welcome to Hawaiian Vacations!
 *  Packages are available for Kauai, Maui, or Oahu
 *  Which island do you choose? cali
 *  Unknown island
 *  Programmed by Jonathan Ko
 */