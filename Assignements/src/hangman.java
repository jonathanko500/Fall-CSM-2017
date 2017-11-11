import java.security.SecureRandom;
import java.util.Scanner;

public class hangman
{//start class
	public static void main(String[] args)
	{//start main
		//declare variables
		String word,letter,cover;
		int counter;
		//gets word
		word=pickWord();
		//read variable
		counter=numbLetters(word);
		System.out.println("I am thinking of a word with "+counter+" letters");
		System.out.println("");
		cover=coverWord(word);
		System.out.println(cover);
		System.out.println(word);
		Scanner input = new Scanner (System.in);
		while(cover!=word)
		{
			System.out.print("Guess a letter: ");
			letter=input.nextLine();
			cover=maskWord(word,letter);
			System.out.println(cover);
		}
		System.out.println(word);
		
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
	public static int numbLetters(String word)
	{//start method
		int counter=0;
		for(int i=0;i<word.length();i++)
		{
			counter++;
		}
		return counter;
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
		int place=0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)==letter.charAt(0))
			{
				place=word.indexOf(i);
			}
		}
		return newWord;
	}//end method
}//end class
