import java.security.SecureRandom;
import java.util.Scanner;

public class hangman
{//start class
	public static void main(String[] args)
	{//start main
		//declare variables
		String word,letter,cover;
		//gets word
		word=pickWord();
		//read variable
		System.out.println("I am thinking of a word with "+word.length()+" letters");
		System.out.println("");
		cover=coverWord(word);
		System.out.println(cover);
		System.out.println(word);
		Scanner input = new Scanner (System.in);
		System.out.print("Guess a letter: ");
		letter=input.nextLine();
		while(cover!=word)
		{
			cover=maskWord(word,letter);
			if(cover!=word)
			{
				System.out.print("Guess a letter: ");
				letter=input.nextLine();
			}
			
		}
	}//end main
	public static String pickWord()
	{//start method
		SecureRandom rand = new SecureRandom();
		//declare variable
		String[] box = {"a", "be", "can", "dish", "lied", "comp", "destiny", "two", "ten", "four"};
		int wordNumb;
		//gets random numb
		wordNumb=rand.nextInt(9);
		//returns random word
		return box[wordNumb];
	}//end method
	public static String coverWord(String word)
	{
		//declare variable
		String newWord="";
		for(int i=0;i<word.length();i++)
		{
			newWord+="-";
		}
		return newWord;
	}
	public static String maskWord(String word,String letter)
	{//start method
		String newWord="";
		String totalWord="";	
		for(int i=0;i<word.length();i++)
		{//start loop
			int j=0;
			if(word.charAt(i)==letter.charAt(j))
			{
				newWord+=letter.charAt(j);
				j++;
			}
			else
			{
				newWord+="-";
				System.out.println("Bad Guess");
				System.out.println("");
			}
			totalWord=newWord;
		}//end loop
		System.out.println(newWord);
		return totalWord;
	}//end method
}//end class
