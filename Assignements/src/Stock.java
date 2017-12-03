import java.util.Scanner;
//Jonathan Ko
//assignment 11
public class Stock 
{//start class
	public static void main(String[] args)
	{//start main
		//declare variables
		StockMod[] company = new StockMod[20];
		int count=0;
		printPortfolio(company,count);
		System.out.println("Programmed by Jonathan Ko");
	}//end main
	public static StockMod createStock ()
	{//start method
		//declare
		int count=0;
		StockMod[] data = null;
		Scanner input = new Scanner(System.in);
		String name;
		int share;
		double purch,curr;
		System.out.print("Enter company: ");
		name=input.nextLine();
		System.out.print("Number of shares: ");
		share=Integer.parseInt(input.nextLine());
		System.out.print("Purchase Price: ");
		purch=Double.parseDouble(input.nextLine());
		System.out.print("Current Price: ");
		curr=Double.parseDouble(input.nextLine());
		data[count]=new StockMod(name,share,purch,curr);
		count++;
		return data[count-1];
	}//end method
	public static void printPortfolio(StockMod[] list, int count)
	{//start method
		int choice;
		double total=0;
		Scanner input = new Scanner(System.in);
		do
		{
			System.out.println("Portfolio Calculator");
			System.out.println("1 - Add stock");
			System.out.println("2 - Show portfolio");
			System.out.println("3 - Quit");
			System.out.print("Enter your choice: ");
			choice=Integer.parseInt(input.nextLine());
			System.out.println("");
			switch(choice)
			{
			case 1:
				for(int i=0;i<list.length;i++)
				{
					list[i]=createStock();
				}
				System.out.println("");
				break;
			case 2:
				System.out.println("Portfolio Reort");
				for(int i=0;i<list.length;i++)
				{
					System.out.print(list[i].toString());
					System.out.printf("%.2f%n", list[i].getValue());
					System.out.println("");
					total+=list[i].getValue();
					System.out.printf("Total     $%8.2f%n",total);
				}
			}
		}while(choice!=3);
		
	}//end method
}//end class
