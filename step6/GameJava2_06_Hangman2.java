package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GameJava2_06_Hangman2 extends GameJava2_06_Hangman {
	
	String[] words = {
		"influenza","cancer","poison"	
	};
	String[] meaning = {"독감","열","암"};
	
	
			



public GameJava2_06_Hangman2() {
	
	Random r = new Random();
	int randomNum = Math.abs(r.nextInt()%words.length); // 난수발생
	
	hiddenString=words[randomNum]; //문제가 저장된 배열 중 하나를 선택
	
	System.out.println("\n의미:"+meaning[randomNum]);
	
}
public char readChar() throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String user;
	
	do {
		System.out.print("1문자를 입력하세요(힌트를 원하면? 입력):");
		user=in.readLine();
		
		if(user.charAt(0)=='?') {
			boolean givehint= false;
			int i=0;
			while(!givehint) {
				if(outputString.charAt(i)=='-') { //못 맞춘 문자를 힌트로 출력
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