import java.util.Scanner;
//Jonathan Ko
//assignment 8 problem 2
public class payrollV2
{//start class
	public static void main(String[] args)
	{//start main
		//declare variables
		String [] name= new String [1];
		double [] pay= new double[1];
		int numb;
		//input data
		Scanner input = new Scanner(System.in);
		System.out.print("How many employees? ");
		numb=Integer.parseInt(input.nextLine());
		while(numb<1)
		{
			System.out.print("Invalid, must be at least 1, re-enter: ");
			numb=Integer.parseInt(input.nextLine());
		}
		name= new String [numb];
		pay= new double[numb];
		getData(name,pay);
		printPayroll(name,pay);
		System.out.println("Programmed by Jonathan Ko");
	}//end main
	public static void getData(String[] list,double[] group)
	{//start method
		//declare variables
		double rate,hours;
		//read input
		Scanner input = new Scanner(System.in);
		for(int i=0;i<list.length;i++)
		{//start loop
			//puts name in array
			System.out.print("Employee name? ");
			list[i]=input.nextLine();
			System.out.print("Hours worked? ");
			hours=Double.parseDouble(input.nextLine());
			System.out.print("Hourly rate? ");
			rate=Double.parseDouble(input.nextLine());
			//puts pay in array
			group[i]=calcPay(hours,rate);
		}//end loop
	}//end method
	public static double calcPay(double time,double often)
	{//start method
		//declare variable
		double pay,newRate;
		//math
		if(time>40)
		{
			newRate=often*1.5;
			pay=time*newRate;
			return pay;
		}
		else
		{
			pay=time*often;
			return pay;
		}
		
	}//end method
	public static void printPayroll(String[] list, double[] group)
	{//start method
		double total=0;
		System.out.println("");
		System.out.println("PAYROLL REPORT");
		System.out.println("Employee            Pay");
		for(int i=0;i<list.length;i++)
		{
			System.out.printf(list[i]+"                "+"%.2f%n", group[i]);
			total+=group[i];
		}
		System.out.println("");
		System.out.printf("Total payroll    $%.2f%n", total);
	}//end method
}//end class
/*
test 1
How many employees? -2
Invalid, must be at least 1, re-enter: 3
Employee name? a
Hours worked? 50
Hourly rate? 22.50
Employee name? b
Hours worked? 35
Hourly rate? 20
Employee name? c
Hours worked? 40
Hourly rate? 32.75

PAYROLL REPORT
Employee            Pay
a                1687.50
b                700.00
c                1310.00

Total payroll    $3697.50
Programmed by Jonathan Ko

test 2
How many employees? 5
Employee name? a
Hours worked? 45
Hourly rate? 15.50
Employee name? b
Hours worked? 25.50
Hourly rate? 12.00
Employee name? c
Hours worked? 47.50
Hourly rate? 18.75
Employee name? d
Hours worked? 55
Hourly rate? 42.50
Employee name? e
Hours worked? 20
Hourly rate? 32.25

PAYROLL REPORT
Employee            Pay
a                1046.25
b                306.00
c                1335.94
d                3506.25
e                645.00

Total payroll    $6839.44
Programmed by Jonathan Ko
*/