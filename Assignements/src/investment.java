import java.util.Scanner;
//Jonathan Ko
//assignment 5 problem 3
public class investment 
{//start class
	public static void main(String[] args) 
	{//start main
		//declare variables
		int years;
		double deposit,rate,ratePrice,rateDec,origin,interest;
		//read input + check for valid data
		Scanner input=new Scanner(System.in);
		System.out.print("What is inital deposit? ");
		deposit=Double.parseDouble(input.nextLine());
		origin=deposit;
		while (deposit<1)
		{
			System.out.print("Invalid, must be greater than 0. Re-enter: ");
			deposit=Double.parseDouble(input.nextLine());
			origin=deposit;
		}
		System.out.print("Annual interest rate (as percent)? ");
		rate=Double.parseDouble(input.nextLine());
		while (rate<1)
		{
			System.out.print("Invalid, must be greater than 0. Re-enter: ");
			rate=Double.parseDouble(input.nextLine());
		}
		System.out.print("Number of years on deposit? ");
		years=Integer.parseInt(input.nextLine());
		while (years<1)
		{
			System.out.print("Invalid, must be greater than 0. Re-enter: ");
			years=Integer.parseInt(input.nextLine());
		}
		System.out.println("");
		System.out.println("Let's see how your money grows!");
		System.out.println("Year\tBalance");
		//math
		for(int i=1;i<=years;i++)
		{
			rateDec=rate/100.0;
			ratePrice=deposit*rateDec;
			deposit=deposit+ratePrice;
			//print balance
			System.out.printf(" "+i+"       "+"%.2f%n",deposit);
		}
		//print interest gained
		System.out.println("");
		interest=deposit-origin;
		System.out.printf("Total interest earned is $ %.2f%n",interest);
		System.out.println("Programmed by Jonathan Ko");
	}//end main
}//end class
/*
 * 
 * test 1
What is inital deposit? -1000
Invalid, must be greater than 0. Re-enter: 1000
Annual interest rate (as percent)? 0
Invalid, must be greater than 0. Re-enter: 10
Number of years on deposit? -3
Invalid, must be greater than 0. Re-enter: 3

Let's see how your money grows!
Year	Balance
 1       1100.00
 2       1210.00
 3       1331.00

Total interest earned is $ 331.00
Programmed by Jonathan Ko
 *
 *test 2
What is inital deposit? 5000
Annual interest rate (as percent)? 7
Number of years on deposit? 10

Let's see how your money grows!
Year	Balance
 1       5350.00
 2       5724.50
 3       6125.22
 4       6553.98
 5       7012.76
 6       7503.65
 7       8028.91
 8       8590.93
 9       9192.30
 10       9835.76

Total interest earned is $ 4835.76
Programmed by Jonathan Ko
 *
 * test 3
What is inital deposit? 10000
Annual interest rate (as percent)? 5
Number of years on deposit? 20

Let's see how your money grows!
Year	Balance
 1       10500.00
 2       11025.00
 3       11576.25
 4       12155.06
 5       12762.82
 6       13400.96
 7       14071.00
 8       14774.55
 9       15513.28
 10       16288.95
 11       17103.39
 12       17958.56
 13       18856.49
 14       19799.32
 15       20789.28
 16       21828.75
 17       22920.18
 18       24066.19
 19       25269.50
 20       26532.98

Total interest earned is $ 16532.98
Programmed by Jonathan Ko
*/