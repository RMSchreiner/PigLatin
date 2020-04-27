package PigLatin;

public class PigLatinMethods {


	public static void pigLatinConverter(String word){ 
		String pigWord = "";
		int flag=0;
		for(int i=0;i<word.length();i++){
			char x=word.charAt(i);
			if(x=='a' || x=='e' || x=='i' || x=='o' ||x=='u')
			{
			    pigWord=word.substring(i)+word.substring(0,i)+"way";
				flag=1;
				break;
			  }
		}
		if(flag==0)
		{
				pigWord=word+"ay";
		}
			System.out.println(pigWord);
		}
	}    	  


