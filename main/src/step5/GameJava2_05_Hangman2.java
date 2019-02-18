package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GameJava2_05_Hangman2 extends GameJava2_05_Hangman {

	
	
		String[] words = {"influeza" , "fever", "cancer", "poison"};
		String[] meaning= {"독감", "열", "암", "독"};
		
		

		public GameJava2_05_Hangman2() throws IOException
		{
			Random r = new Random();
			int randomNum=Math.abs(r.nextInt()%words.length);
			
			hiddenString=words[randomNum];
			
			System.out.println("\n의미:"+meaning[randomNum]);
		}
			public char readCher() throws IOException
			{
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				
			String user;
			
			do {
				System.out.print("문자를 입력하세 : 힌트는 ?입력");
				user=in.readLine();
				
				if(user.charAt(0)=='?') {
					boolean givehint= false;
					int i =0;
					while(!givehint) {
						if(outputString.charAt(i)=='-') {
							System.out.println();
							System.out.println("힌트:"+hiddenString.charAt(i));
							System.out.println();
							failed++;
							givehint=true;
						}
						i++;
						}
					}
				}while(user.charAt(0)=='?');
			
			return user.charAt(0);	
			}
			
		
	}

		