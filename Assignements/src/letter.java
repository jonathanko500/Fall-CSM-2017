import java.util.Scanner;
//Jonathan ko
//assignment 9 problem 1
public class letter
{//start class
	public static void main(String[] args)
	{//start main
		//declare variable
		String letter,phrase;
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a SINGLE character to act as key: ");
		letter=input.nextLine();
		letter=getKeyLetter(letter);
		System.out.println("");
		System.out.println("Enter a phrase or sentence >= 4 characters: ");
		phrase=input.nextLine();
		phrase=getString(phrase);
		System.out.println("");
		phrase=maskLetter(letter,phrase);
		System.out.println(phrase);
	}//end main
	public static String getKeyLetter (String letter)
	{//start main
		Scanner input = new Scanner (System.in);
		while(letter.length()!=1)
		{
			System.out.print("Only a SINGLE character, re-enter: ");
			letter=input.nextLine();
		}
		return letter;
	}//end main
	public static String getString (String phrase)
	{//start method
		Scanner input = new Scanner (System.in);
		while(phrase.length()<4)
		{
			System.out.println("Must be at least 4 characters, re-enter: ");
			phrase=input.nextLine();
		}
		return phrase;
	}//end method
	public static String maskLetter(String letter,String phrase)
	{//start method
		phrase.toLowerCase();
		letter.toLowerCase();
		System.out.println("String with '"+letter+"' masked:");
		for(int i=0;i<phrase.length();i++)
		{//start loop
			if(phrase.charAt(i)==letter.charAt(0))//compares if letter is the same
			{
				
			}
		}//end loop
		return phrase;
	}//end method
	
}// class