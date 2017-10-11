import java.util.Scanner;
//Jonathan Ko
//assignment 6 problem 3
public class salesRep
{//start class
	public static void main(String[] args) 
	{//start main
		//declare input
		int numbRep;
		String name;
		double sales,totalSales=0,avg=0,everybodySales=0,everybodyAvgTotal=0,everybodyAvg=0;
		//read input
		Scanner input = new Scanner(System.in);
		System.out.print("How many sales rep? ");
		numbRep=Integer.parseInt(input.nextLine());
		while(numbRep<=0)
		{
			System.out.print("Must be at least one sales rep, reenter: ");
			numbRep=Integer.parseInt(input.nextLine());
		}
		for(int i=1;i<=numbRep;i++)
		{
			System.out.print("Enter sales rep name: ");
			name=input.nextLine();
			for(int j=1;j<=4;j++)
			{
				System.out.print("Month "+j+" sales for "+name+": ");
				sales=Double.parseDouble(input.nextLine());
				totalSales+=sales;
				avg=totalSales/(double)j;
				everybodySales+=sales;
				everybodyAvgTotal+=totalSales;
			}
			System.out.printf("Total sales for "+name+": $%.2f%n", totalSales);
			System.out.printf("Monthly average %.2f%n", avg);
			totalSales=0;
			System.out.println("");
			
		}
		everybodyAvg=everybodySales/(double)numbRep;
		System.out.printf("Total Sales from all reps: $%.2f%n",everybodySales);
		System.out.printf("Average sales per rep: $%.2f%n",everybodyAvg);
		System.out.println("Programmed by Jonathan Ko");
	}//end main
}//end class
/*

test 1
How many sales rep? -2
Must be at least one sales rep, reenter: 2
Enter sales rep name: John Smith
Month 1 sales for John Smith: 510.50
Month 2 sales for John Smith: 325.10
Month 3 sales for John Smith: 775
Month 4 sales for John Smith: 1000
Total sales for John Smith: $2610.60
Monthly average 652.65

Enter sales rep name: Ann Jones
Month 1 sales for Ann Jones: 665.25
Month 2 sales for Ann Jones: 850
Month 3 sales for Ann Jones: 1225.50
Month 4 sales for Ann Jones: 585.10
Total sales for Ann Jones: $3325.85
Monthly average 831.46

Total Sales from all reps: $5936.45
Average sales per rep: $2968.23
Programmed by Jonathan Ko

test 2
How many sales rep? 3
Enter sales rep name: kjshdfkjasdhvjkh
Month 1 sales for kjshdfkjasdhvjkh: 1250.10
Month 2 sales for kjshdfkjasdhvjkh: 780.50
Month 3 sales for kjshdfkjasdhvjkh: 375
Month 4 sales for kjshdfkjasdhvjkh: 925
Total sales for kjshdfkjasdhvjkh: $3330.60
Monthly average 832.65

Enter sales rep name: ajlsdhflaksdhfa
Month 1 sales for ajlsdhflaksdhfa: 790.10
Month 2 sales for ajlsdhflaksdhfa: 890
Month 3 sales for ajlsdhflaksdhfa: 1550.25
Month 4 sales for ajlsdhflaksdhfa: 1225
Total sales for ajlsdhflaksdhfa: $4455.35
Monthly average 1113.84

Enter sales rep name: yaohgjvahvahvbaoivb
Month 1 sales for yaohgjvahvahvbaoivb: 1500
Month 2 sales for yaohgjvahvahvbaoivb: 1200
Month 3 sales for yaohgjvahvahvbaoivb: 775
Month 4 sales for yaohgjvahvahvbaoivb: 400
Total sales for yaohgjvahvahvbaoivb: $3875.00
Monthly average 968.75

Total Sales from all reps: $11660.95
Average sales per rep: $3886.98
Programmed by Jonathan Ko
*/