import java.util.Scanner;

public class exponential
{//start class
	public static void main(String[] args)
	{//start main
		//declare variables
		String operation,again;
		int num,pass=0,ans;
		//read variables
		Scanner input = new Scanner(System.in);
		System.out.print("Enter S for sum, P for prod:");
		operation=input.nextLine();
		operation=operation.toUpperCase();
		while(pass==0)
		{
			switch(operation)
			{
			case "S":
				num=getNum();
				ans=calcSum(num);
				System.out.println("The sum of the numbers from 1 to "+num+" is "+ans);
				break;
			case "P":
				num=getNum();
				ans=calcProd(num);
				System.out.println("The product of the numbers from 1 to "+num+" is "+ans);
				break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.print("Again (y/n)? ");
			again=input.nextLine();
			again=again.toUpperCase();
			switch(again)
			{
			case "N":
				pass=1;
				break;
			case "Y":
				System.out.println("");
				System.out.print("Enter S for sum, P for prod:");
				operation=input.nextLine();
				operation=operation.toUpperCase();
			}
		}
		System.out.println("Programmed by Jonathan Ko");
	}//end main
	public static int getNum()
	{//start method
		//declare variables
		int numb;
		//read variables
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer greater than 1: ");
		numb=Integer.parseInt(input.nextLine());
		while(numb<=1)
		{
			System.out.print("Must be greater than 1, re-enter: ");
			numb=Integer.parseInt(input.nextLine());
		}
		return numb;
	}//end method
	public static int calcSum(int choice)
	{//start method
		//declare variable
		int total=0;
		for(int i=1;i<=choice;i++)
		{
			total+=i;
		}
		return total;
	}//end method
	public static int calcProd(int choice)
	{
		//declare variable
		int total=1,num=1;
		for(int i=1;i<=choice;i++)
		{
			
			total*=i;
		}
		return total;
	}
}//end class
/*
test 
Enter S for sum, P for prod:z
Invalid choice
Again (y/n)? y

Enter S for sum, P for prod:s
Enter an integer greater than 1: 1
Must be greater than 1, re-enter: -3
Must be greater than 1, re-enter: 3
The sum of the numbers from 1 to 3 is 6
Again (y/n)? y

Enter S for sum, P for prod:p
Enter an integer greater than 1: 4
The product of the numbers from 1 to 4 is 24
Again (y/n)? y

Enter S for sum, P for prod:s
Enter an integer greater than 1: 15
The sum of the numbers from 1 to 15 is 120
Again (y/n)? y

Enter S for sum, P for prod:P
Enter an integer greater than 1: 8
The product of the numbers from 1 to 8 is 40320
Again (y/n)? y

Enter S for sum, P for prod:S
Enter an integer greater than 1: 25
The sum of the numbers from 1 to 25 is 325
Again (y/n)? y

Enter S for sum, P for prod:P
Enter an integer greater than 1: 12
The product of the numbers from 1 to 12 is 479001600
Again (y/n)? n
Programmed by Jonathan Ko
*/