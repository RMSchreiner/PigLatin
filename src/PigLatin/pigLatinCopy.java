package PigLatin;

import java.util.*; 
import java.util.Scanner;

public class pigLatinCopy {

	public static void main(String[] args) {
		
		
		
		boolean shouldContinue = true;

		while(shouldContinue) {
		        Scanner ob=new Scanner(System.in);
		        Scanner scnr = new Scanner(System.in);
		        System.out.println("Welcome to the Pig Latin Translator!");
		        System.out.println("");
		        System.out.println("Enter a line to be translated.");
		        String word=ob.next();
		        word=word.toLowerCase();
		        String piglatin="";
		        int flag=0;
		        for(int i=0;i<word.length();i++)
		        {
		            char x=word.charAt(i);
		            if(x=='a' || x=='e' || x=='i' || x=='o' ||x=='u')
		            {
		                piglatin=word.substring(i)+word.substring(0,i)+"way";
		                flag=1;
		                break;
		            }
		        }
		        if(flag==0)
		        {
		            piglatin=word+"ay";
		        }
		        System.out.println(word+" in Piglatin format is "+piglatin);
		        
				System.out.println("Translate another line? (yes/no):");
				//returns the next token from the scanner
				String response = scnr.nextLine();

				shouldContinue = response.equals("yes");// if response. equals true by "yes" this makes shouldContinue true and continues while loop use equalsIgnoreCase to accept "YES"	
			    }

			System.out.println("Ok cool, bye!");

		        
		        
		}        
	}	
	


