import java.security.SecureRandom;

public class hangman
{//start class
	public static void main(String[] args)
	{//start main
		//declare variables
		String word,cover;
		int numbLetter;
		//gets word
		word=pickWord();
		//gets numb of letter
		numbLetter=numbLetters(word);
		//get covered word
		cover=coverWord(word);
		
	}//end main
	public static String pickWord()
	{//start method
		SecureRandom rand = new SecureRandom();
		//declare variable
		String[] box = {"legend", "violin", "villian", "paranthesis", "die", "competitive", "destiny", "two", "nine", "finish"};
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
}//end class