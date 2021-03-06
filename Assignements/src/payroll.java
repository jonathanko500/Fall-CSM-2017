import java.util.Scanner;
//problem 3
public class payroll 
{//start class
	public static void main(String[] args) 
	{//start main
		// declare variables
		String name;
		double hours,rate,grossPay,deduction,netPay;
		//read input
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the employee's name: ");
		name=input.nextLine();
		System.out.print("Enter the number of hours worked this week: ");
		hours=Double.parseDouble(input.nextLine());
		System.out.print("Enter the hourly rate: ");
		rate=Double.parseDouble(input.nextLine());
		//calculate grosspay
		if(hours<=40)
		{
			grossPay=hours*rate;
		}
		else
		{
			grossPay=(40*rate)+(1.5*rate*(hours-40));
		}
		//calculate deduction
		deduction=grossPay*0.15;
		//calculate netPay
		netPay=grossPay-deduction;
		//display outputs
		System.out.println("");
		System.out.println("Payroll Report for " +name);
		System.out.println("==============");
		System.out.printf("Gross Pay:     $   %.2f%n", grossPay);
		System.out.printf("Deductions:    $   %.2f%n", deduction);
		System.out.printf("Net Pay:       $   %.2f%n", netPay);
	}//end main
}//end class
/*
 * test 1
 * Enter the employee's name: John Smith
 * Enter the number of hours worked this week: 45
 * Enter the hourly rate: 15.5
 * 
 * Payroll Report for John Smith
 * ==============
 * Gross Pay:     $   736.25
 * Deductions:    $   110.44
 * Net Pay:       $   625.81
 *
 * test 2
 * Enter the employee's name: bob
 * Enter the number of hours worked this week: 25.5
 * Enter the hourly rate: 10.25
 * 
 * Payroll Report for bob
 * ==============
 * Gross Pay:     $   261.38
 * Deductions:    $   39.21
 * Net Pay:       $   222.17
 * 
 * 
 * test 3
 * Enter the employee's name: joe
 * Enter the number of hours worked this week: 40
 * Enter the hourly rate: 20.75
 * 
 * Payroll Report for joe
 * ==============
 * Gross Pay:     $   830.00
 * Deductions:    $   124.50
 * Net Pay:       $   705.50 
*/