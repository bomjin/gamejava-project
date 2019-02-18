package step6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class GameJava2_06_Hangman {
	
	String hiddenString; //숨겨진 문자열
	StringBuffer outputString; // 플레이어의 입력에 따른 결과로 보여줄 문자열
	StringBuffer inputString; // 플레이어가 입력한 문자들의 모임
	int remainder; //맞출 문자수
	int failed; // 실패한 횟수

	public GameJava2_06_Hangman() {
		
		hiddenString= "hello"; // 문제는 hello
		
	}

	public int playGame() throws IOException {
		
		outputString= new StringBuffer(); // 입력에 따른 결과로 보여줄 문자열
		
		for(int i=0; i<hiddenString.length(); i++) { // hiddenString의 문자수만큼 - 출력
			outputString.append('-');
		}
		inputString= new StringBuffer();  //플레이어가 입력한 문자 
		
		remainder=hiddenString.length(); //hiddenString의 문자수가 맞출 문제의 문자수 맞출문자수= 숨긴문자열의 길이 (메소드)
		failed=0; //실패한 횟수 0 ??? .. 
		
		System.out.println("\n단어("+hiddenString.length()+"글자"+");"+outputString); // 숨겨진 단어길이  입력에 따른 결과 
		drawMan(); // 교수대 그리기 
		
		do {
			
			checkChar(readChar()); //한문자를 입력받아 정답인지 확인
			System.out.println("\n 단어("+hiddenString.length()+"글자"+");"+outputString);
			drawMan(); // 입력한 문자에 따른 교수대 출력
		}while((remainder>0)&&(failed<6));  // 문제를 완전히 맞추거나 6번이상 틀릴 때까지 반복
		
		 return failed;
		
		
	}
	
	public void checkChar(char guess)
	{
		boolean already = false; // 
		for(int i=0; i<inputString.length(); i++) { // 플레이가 입력한 문자들의 모임
			if(inputString.charAt(i)==guess) { // 이미 입력했던 문자인지 조사
				System.out.println("\n 이미 입력한 문자입니다! 다시 입력해주세요.");
				already=true;
			}
		}
		if(!already) {
			inputString.append(guess); //입력한 문자들의 모임에 추가 
			
			boolean success=false;
			for(int i=0;i<hiddenString.length();i++) {
				if(hiddenString.charAt(i)==guess) { //문제에 해당 문자가 있는지 조사
					outputString.setCharAt(i, guess); //문제에 문자가 있으면 -를 문자로 변경
					remainder--; //맞출 문자수가 1감소
					success=true; //입력한  문자가 문제에 있었음을 표시
					
				}
			}
		if(!success) failed++; //입력한 문자가 문제에 엇으면 실패횟수 1증가
		}
		
		
	}
	
	
		  public void drawMan()
		  {
			  System.out.println("┌ㅡㅡㅡ┐");
			  System.out.println("ㅣ        ㅣ ");
			  switch(failed){   //실패 횟수에 따라 교수 사람 그림
			  case 0:
				  System.out.println(" ㅣ");
				  System.out.println(" ㅣ");
				  System.out.println(" ㅣ");
				  System.out.println(" ㅣ");
				  System.out.println(" ㅣ");
				  System.out.println(" ㅣ");
				  break;
			  case 1:
				  System.out.println("◑ ㅣ");
				  System.out.println(" ㅣ");
				  System.out.println(" ㅣ");
				  System.out.println(" ㅣ");
				  System.out.println(" ㅣ");
				  System.out.println(" ㅣ");
				  break;
			  case 2:
				  System.out.println(" ◑ ㅣ");
				  System.out.println("--- ㅣ");
				  System.out.println(" ㅣ");
				  System.out.println(" ㅣ");
				  System.out.println(" ㅣ");
				  System.out.println(" ㅣ");
				  break;
			  case 3:
				  System.out.println(" ◑ ㅣ");
				  System.out.println("---ㅣ");
				  System.out.println(" ㅣ  ㅣ");
				  System.out.println("   ㅣ");
				  System.out.println("   ㅣ");
				  System.out.println("   ㅣ");
				  break;
			  case 4:
				  System.out.println(" ◑ ㅣ");
				  System.out.println("---ㅣ");
				  System.out.println(" ㅣ  ㅣ");
				  System.out.println(" ㅣ  ㅣ");
				  System.out.println("---ㅣ");
				  System.out.println("   ㅣ");
				  break;
			  case 5:
				  System.out.println(" ◑ ㅣ");
				  System.out.println("---ㅣ");
				  System.out.println(" ㅣ  ㅣ");
				  System.out.println(" ㅣ  ㅣ");
				  System.out.println("---ㅣ");
				  System.out.println("ㅣ    ㅣ");
				  System.out.println("ㅣ    ㅣ");
				  break;
			  case 6:
				  System.out.println(" ◑ ㅣ");
				  System.out.println("---ㅣ");
				  System.out.println(" ㅣ  ㅣ");
				  System.out.println(" ㅣ  ㅣ");
				  System.out.println("---ㅣ");
				  System.out.println("ㅣ ㅣㅣ");
				  System.out.println("ㅣ ㅣㅣ ");
				  break;
		    		}
		    	}
		  public char readChar() throws IOException {
			  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			  String user;
			  
			  System.out.println("문자를 입력하세요:");
			  user=in.readLine(); //키보드로부터 한줄을 입력
			  return user.charAt(0); // 입력받은 문자열 중 첫번째 문자를 반환
			  
			  
			  
		  }
	
}

