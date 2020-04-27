package PigLatin;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {

		boolean shouldContinue = true;

		while(shouldContinue) {
		
		Scanner scnr = new Scanner(System.in);

		/*Pig latin takes the first Consonant and adds it to the end of the word and then adds -ay afterwards
		 * so if a word was a string for example of Garage the piglatin would take G0a1r2a3g4e5 and make it a1r2a3g4e5G0 then add -ay
		 * So it would move Char at position 0 to last position and then add or concontinate ay to the end. 
		 * 
		 * 
		 * Step 1 Prompt user for word 
		 * System.out with Scnr and String storage
		 * 
		 * Step 2 Convert word to lower case then Translate the word to PigLatin
		 * String is broken into an array. Array is rearranged then turned into a new string. -ay is then concantinated onto the end. Unless it is a vowel then we do move the letter. So it will require a loop statement testing for Vowels
		 *
		 *Step 3  
		 *The application asks if the user would like to translate another word
		 *
		 */

		System.out.println("Welcome to the Pig Latin Translator!");


			System.out.println("Enter a line to be translated:");
            //scnr.reset();  
			String word=scnr.nextLine();
			word=word.toLowerCase();

			PigLatinMethods.pigLatinConverter(word);
		
			System.out.println("Translate another line? (yes/no):");
			//returns the next token from the scanner
			scnr.reset();
			
			String response = scnr.nextLine();

			shouldContinue = response.equals("yes");// if response. equals true by "yes" this makes shouldContinue true and continues while loop use equalsIgnoreCase to accept "YES"	
		    }

		System.out.println("Ok cool, bye!");
		
		//scnr.close();
		
		}
	

	}

