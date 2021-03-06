import java.util.Scanner;
//Jonathan Ko
//Assignment 5 problem 1
public class divisors
{//start class
	public static void main(String[] args) 
	{//start main
		//declare variable
		int numb,div,count=1;
		//read inputs
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a number and I wil tell you its divisors: "); 
		numb=Integer.parseInt(input.nextLine());
		//check for valid data
		while (numb<=2)
		{
			System.out.print("Must be greater than 2, re-enter: ");
			numb=Integer.parseInt(input.nextLine());
		}
		System.out.println("The divisors of "+numb+" are");
		//math
		while(count<=numb)
		{
			div=numb%count;
			if(div==0)
			{
				System.out.println(count);
			}
			count++;
		}
		System.out.println("Programmed by Jonathan Ko");
	}//end main
}//end class

/*
 * test 1
 * Enter a number and I wil tell you its divisors: -7
 * Must be greater than 2, re-enter: 1
 * Must be greater than 2, re-enter: 77
 * The divisors of 77 are
 * 1
 * 7
 * 11
 * 77
 * Programmed by Jonathan Ko
 * 
 * test 2
 * Enter a number and I wil tell you its divisors: 11
 * The divisors of 11 are
 * 1
 * 11
 * Programmed by Jonathan Ko
 * 
 * test 3
 * Enter a number and I wil tell you its divisors: 100
 * The divisors of 100 are
 * 1
 * 2
 * 4
 * 5
 * 10
 * 20
 * 25
 * 50
 * 100
 * Programmed by Jonathan Ko
*/
