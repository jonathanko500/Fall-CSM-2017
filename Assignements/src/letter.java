import java.util.Scanner;
//Jonathan ko
//assignment 9 problem 1
public class letter
{//start class
	public static void main(String[] args)
	{//start main
		//declare variable
		String letter,phrase;
		int counter;
		//figure out letter
		letter=getKeyLetter();
		System.out.println("");
		//figure out phrase
		phrase=getString();
		System.out.println("");
		//counts number of letter occurs
		counter=countKey(letter,phrase);
		//makes phrase with -
		phrase=maskLetter(letter,phrase);
		//prints phrase with dash
		System.out.println(phrase);
		System.out.println("");
		//prints number of letter occurs
		System.out.println("Count of '"+letter+"': "+counter);
		System.out.println("");
		//prints phrase wo letter
		phrase=removeKey(letter,phrase);
		System.out.println(phrase);
		System.out.println("Programmed by Jonathan Ko");
	}//end main
	public static String getKeyLetter ()
	{//start main
		//declare variables
		String letter;
		//read input
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a SINGLE character to act as key: ");
		letter=input.nextLine();
		while(letter.length()!=1)
		{
			System.out.print("Only a SINGLE character, re-enter: ");
			letter=input.nextLine();
		}
		return letter;
	}//end main
	public static String getString ()
	{//start method
		//declare variable
		String phrase;
		//read input
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a phrase or sentence >= 4 characters: ");
		phrase=input.nextLine();
		while(phrase.length()<4)
		{
			System.out.println("Must be at least 4 characters, re-enter: ");
			phrase=input.nextLine();
		}
		return phrase;
	}//end method
	public static String maskLetter(String letter,String phrase)
	{//start method
		String newPhrase = "";
		System.out.println("String with '"+letter+"' masked:");
		for(int i=0;i<phrase.length();i++)
		{//start loop
			if(phrase.charAt(i)==letter.charAt(0))//compares if letter is the same
			{
				newPhrase+="-";
			}
			else
			{
				newPhrase+=phrase.charAt(i);
			}
		}//end loop
		return newPhrase;
	}//end method
	public static int countKey (String letter,String phrase)
	{//start method
		int counter=0;
		for(int i=0;i<phrase.length();i++)
		{//start loop
			if(phrase.charAt(i)==letter.charAt(0))//compares if letter is the same
			{
				counter++;
			}
		}//end loop
		return counter;
	}//end method
	public static String removeKey (String letter,String phrase)
	{//start method
		System.out.println("String with '"+letter+"' removed:");
		String newPhrase="";
		for(int i=0;i<phrase.length();i++)
		{//start loop
			if(phrase.charAt(i)!='-')//compares if letter is not the same
			{
				newPhrase+=phrase.charAt(i);
			}
		}//end loop
		return newPhrase;
	}//end method
}// class
/*
test 1
Enter a SINGLE character to act as key: ic
Only a SINGLE character, re-enter: 
Only a SINGLE character, re-enter: c

Enter a phrase or sentence >= 4 characters: 
Ice
Must be at least 4 characters, re-enter: 
I scream, you scream, we all SCREAM for ice cream!

String with 'c' masked:
I s-ream, you s-ream, we all SCREAM for i-e -ream!

Count of 'c': 4

String with 'c' removed:
I sream, you sream, we all SCREAM for ie ream!
Programmed by Jonathan Ko

test 2
Enter a SINGLE character to act as key: n

Enter a phrase or sentence >= 4 characters: 
Violin is fun

String with 'n' masked:
Violi- is fu-

Count of 'n': 2

String with 'n' removed:
Violi is fu
Programmed by Jonathan Ko

test 3
Enter a SINGLE character to act as key: j

Enter a phrase or sentence >= 4 characters: 
jonathan is lzy

String with 'j' masked:
-onathan is lzy

Count of 'j': 1

String with 'j' removed:
onathan is lzy
Programmed by Jonathan Ko

*/