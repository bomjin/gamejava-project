package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GameJava2_06_Hangman2 extends GameJava2_06_Hangman {
	
	String[] words = {
		"influenza","cancer","poison"	
	};
	String[] meaning = {"����","��","��"};
	
	
			



public GameJava2_06_Hangman2() {
	
	Random r = new Random();
	int randomNum = Math.abs(r.nextInt()%words.length); // �����߻�
	
	hiddenString=words[randomNum]; //������ ����� �迭 �� �ϳ��� ����
	
	System.out.println("\n�ǹ�:"+meaning[randomNum]);
	
}
public char readChar() throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String user;
	
	do {
		System.out.print("1���ڸ� �Է��ϼ���(��Ʈ�� ���ϸ�? �Է�):");
		user=in.readLine();
		
		if(user.charAt(0)=='?') {
			boolean givehint= false;
			int i=0;
			while(!givehint) {
				if(outputString.charAt(i)=='-') { //�� ���� ���ڸ� ��Ʈ�� ���
					System.out.println();
					System.out.println("��Ʈ:"+hiddenString.charAt(i));
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