import java.util.Scanner;
//Jonathan Ko
//assignment 5 problem 2
public class notation 
{//start class
	public static void main(String[] args)
	{//start main
		//declare input
		int numb,total=0;
		//read input
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		numb=Integer.parseInt(input.nextLine());
		while (numb<2)
		{
			System.out.print("Must be greater than 2, re-enter: ");
			numb=Integer.parseInt(input.nextLine());
		}
		System.out.println("");
		for(int i=1;i<=numb;i++)
		{
			total+=i;
		}
		System.out.println("The sum of the integers from 1 to "+numb+" is "+total);
		System.out.println("Programmed by Jonathan Ko");
	}//end main
}//end class

/*
 *
 *test 1
 * Enter a positive integer: -4
 * Must be greater than 2, re-enter: 1
 * Must be greater than 2, re-enter: 4
 * 
 * The sum of the integers from 1 to 4 is 10
 * Programmed by Jonathan Ko
 * 
 * test 2
 * Enter a positive integer: 22
 * 
 * The sum of the integers from 1 to 22 is 253
 * Programmed by Jonathan Ko
 * 
 * test 3
 * Enter a positive integer: 50
 * The sum of the integers from 1 to 50 is 1275
 * Programmed by Jonathan Ko
 * 
 */
