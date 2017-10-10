import java.util.Scanner;

public class companies
{//start class
	public static void main(String[] args)
	{//start class
		//declare input
			String name,again;
			int numbPpl,rate,totalPpl=0;
			int pass;
			double price,totalPrice=0;
			//read input
			Scanner input = new Scanner(System.in);
			System.out.print("Enter company name: ");
			name=input.nextLine();
			System.out.print("How many registrants? ");
			numbPpl=Integer.parseInt(input.nextLine());
			totalPpl+=numbPpl;
			System.out.println("");
			//figure out rate
			if(numbPpl>9)
			{
				rate=90;
			}
			else if(numbPpl>0&&numbPpl<4)
			{
				rate=150;
			}
			else
			{
				rate=100;
			}
			//calculate price per person
			price=numbPpl*rate;
			totalPrice+=price;
			//print output of loop
			System.out.println("INVOICE");
			System.out.println("Company name: "+name);
			System.out.println("Cost per registrant: "+(double)rate);
			System.out.printf("Total for "+numbPpl+" people is $%.2f%n",price);
			System.out.println("");
			//ask again
			System.out.print("Another registration? (Y/N)");
			again=input.nextLine();
		
		
	}//end main
}//end class
