import java.util.ArrayList;
import java.util.Scanner;
//Jonathan ko
//assignment 12
public class weaponStore
{//start class
	public static void main(String[] args)
	{//start main
		//declare variable/arraylist
		ArrayList<InvoiceItem> cart= new ArrayList<InvoiceItem>();
		String letter;
		Scanner input = new Scanner(System.in);
		do
		{
			addItems(cart);
			showProducts(cart);
			editCart(cart);
			checkout(cart);
			System.out.println("");
			//asks to do another "purchase"
			System.out.print("Another order (y/n) ? ");
			letter=input.nextLine();
			if(letter.equalsIgnoreCase("y"))
			{//clear entire arrayList
				cart.clear();
			}
		}while(letter.equalsIgnoreCase("y"));
		System.out.println("Goodbye");
		System.out.println("Programmed by Jonathan Ko");
		
	}//end main
	public static void addItems(ArrayList<InvoiceItem> list)
	{//start method
		//declare variables
		Scanner input = new Scanner(System.in);
		String[] weapons={"","common sword","jumping potion","chain shirt","breastplate","steel shield","wooden shield"};
		int[] price={0,50,85,115,230,100,250,};
		int choice,cost,num;
		String tool;
		//menu
		System.out.println("PRODUCT LIST");
		System.out.println("Item\tDescription\tPrice");
		//print options
		for(int i=1;i<price.length;i++)
		{
			System.out.println(i+"\t"+weapons[i]+"\t"+price[i]);
		}
		//ask user for choice of weapon
		System.out.print("Enter item to buy or 0 to quit: ");
		choice=Integer.parseInt(input.nextLine());
		//checks for valid data
		while(choice<0||choice>6)
		{
			System.out.print("Invalid, re-enter: ");
			choice=Integer.parseInt(input.nextLine());
		}
		while(choice!=0)
		{//start loop to add more weapons
			if(choice!=0)
			{
				//print user choice of weapon and price
				System.out.println("Ordering "+weapons[choice]+", price is "+price[choice]);
				tool=weapons[choice];
				cost=price[choice];
				//asks for quantity
				System.out.print("How Many? ");
				num=Integer.parseInt(input.nextLine());
				//checks for valid data
				while(num<=0)
				{
					System.out.print("Invalid, re-enter: ");
					num=Integer.parseInt(input.nextLine());
				}
				//adds info to array
				list.add(new InvoiceItem(tool,cost,num));
				System.out.println("");
				System.out.print("Enter item to buy or 0 to quit: ");
				choice=Integer.parseInt(input.nextLine());
				//checks for valid data
				while(choice<0||choice>7)
				{
					System.out.print("Invalid, re-enter: ");
					choice=Integer.parseInt(input.nextLine());
				}
			}
			
		}//end loop
	}//end method
	public static void showProducts(ArrayList<InvoiceItem> list)
	{//start method
		System.out.println("Your cart");
		System.out.println("Item\tDescription\tQty\tPrice");
		//prints cart
		for(int i=0;i<list.size();i++)
		{
			System.out.println((i+1)+"\t"+list.get(i).getDescription()+"\t"+list.get(i).getQuantity()+"\t"+list.get(i).getPrice());
		}
	}//end method
	public static void checkout(ArrayList<InvoiceItem> list)
	{//start method
		int total=0;
		System.out.println("INVOICE");
		System.out.println("Qty\tDescription\tEach\ttotal");
		//loop to print arrayList
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i).getQuantity()+"\t");
			System.out.print(list.get(i).getDescription()+"\t");
			System.out.print(list.get(i).getPrice()+"\t");
			System.out.println(list.get(i).getItemTotal());
			total+=list.get(i).getItemTotal();
		}
		//print total purchase
		System.out.println("Total Due: "+total);
		System.out.println("Thank you for your order!");
	}//end method
	public static void editCart(ArrayList<InvoiceItem> list)
	{//start method
		int choice,num;
		String letter;
		Scanner input = new Scanner(System.in);
		System.out.print("Select item to remove or change, or 0 if no change: ");
		choice=Integer.parseInt(input.nextLine());
		//check for valid data
		while(choice>list.size()||choice<0)
		{
			System.out.print("Invalid, re-enter: ");
			choice=Integer.parseInt(input.nextLine());
		}
		while(choice!=0)
		{//loop to change or remove
			System.out.print("Enter r to remove item, c to change quantity: ");
			letter=input.nextLine();
			//to change or remove
			switch(letter)
			{//start switch
			case "c":
			case "C":
				//change quantity
				choice-=1;
				list.remove(choice).getQuantity();
				System.out.print("Enter new quantity: ");
				num=Integer.parseInt(input.nextLine());
				list.get(choice).setQuantity(num);
				System.out.println("");
				System.out.println("Quantity changed");
				break;
			case "r":
			case "R":
				//remove
				list.remove(choice-1);
				System.out.println("");
				System.out.println("Item Removed");
				break;
			}//end switch
			System.out.println("Item\tDescription\tQty\tPrice");
			//prints cart
			for(int i=0;i<list.size();i++)
			{
				System.out.println((i+1)+"\t"+list.get(i).getDescription()+"\t"+list.get(i).getQuantity()+"\t"+list.get(i).getPrice());
				
			}
			//ask to change or remove again
			System.out.print("Select item to remove or change, or 0 if no change: ");
			choice=Integer.parseInt(input.nextLine());
			//check for valid data
			while(choice>list.size()||choice<0)
			{
				System.out.print("Invalid, re-enter: ");
				choice=Integer.parseInt(input.nextLine());
			}
		}//end loop to change or remove	
	}//end method
}//end class
