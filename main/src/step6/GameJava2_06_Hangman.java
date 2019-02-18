package step6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class GameJava2_06_Hangman {
	
	String hiddenString; //������ ���ڿ�
	StringBuffer outputString; // �÷��̾��� �Է¿� ���� ����� ������ ���ڿ�
	StringBuffer inputString; // �÷��̾ �Է��� ���ڵ��� ����
	int remainder; //���� ���ڼ�
	int failed; // ������ Ƚ��

	public GameJava2_06_Hangman() {
		
		hiddenString= "hello"; // ������ hello
		
	}

	public int playGame() throws IOException {
		
		outputString= new StringBuffer(); // �Է¿� ���� ����� ������ ���ڿ�
		
		for(int i=0; i<hiddenString.length(); i++) { // hiddenString�� ���ڼ���ŭ - ���
			outputString.append('-');
		}
		inputString= new StringBuffer();  //�÷��̾ �Է��� ���� 
		
		remainder=hiddenString.length(); //hiddenString�� ���ڼ��� ���� ������ ���ڼ� ���⹮�ڼ�= ���乮�ڿ��� ���� (�޼ҵ�)
		failed=0; //������ Ƚ�� 0 ??? .. 
		
		System.out.println("\n�ܾ�("+hiddenString.length()+"����"+");"+outputString); // ������ �ܾ����  �Է¿� ���� ��� 
		drawMan(); // ������ �׸��� 
		
		do {
			
			checkChar(readChar()); //�ѹ��ڸ� �Է¹޾� �������� Ȯ��
			System.out.println("\n �ܾ�("+hiddenString.length()+"����"+");"+outputString);
			drawMan(); // �Է��� ���ڿ� ���� ������ ���
		}while((remainder>0)&&(failed<6));  // ������ ������ ���߰ų� 6���̻� Ʋ�� ������ �ݺ�
		
		 return failed;
		
		
	}
	
	public void checkChar(char guess)
	{
		boolean already = false; // 
		for(int i=0; i<inputString.length(); i++) { // �÷��̰� �Է��� ���ڵ��� ����
			if(inputString.charAt(i)==guess) { // �̹� �Է��ߴ� �������� ����
				System.out.println("\n �̹� �Է��� �����Դϴ�! �ٽ� �Է����ּ���.");
				already=true;
			}
		}
		if(!already) {
			inputString.append(guess); //�Է��� ���ڵ��� ���ӿ� �߰� 
			
			boolean success=false;
			for(int i=0;i<hiddenString.length();i++) {
				if(hiddenString.charAt(i)==guess) { //������ �ش� ���ڰ� �ִ��� ����
					outputString.setCharAt(i, guess); //������ ���ڰ� ������ -�� ���ڷ� ����
					remainder--; //���� ���ڼ��� 1����
					success=true; //�Է���  ���ڰ� ������ �־����� ǥ��
					
				}
			}
		if(!success) failed++; //�Է��� ���ڰ� ������ ������ ����Ƚ�� 1����
		}
		
		
	}
	
	
		  public void drawMan()
		  {
			  System.out.println("���ѤѤѦ�");
			  System.out.println("��        �� ");
			  switch(failed){   //���� Ƚ���� ���� ���� ��� �׸�
			  case 0:
				  System.out.println(" ��");
				  System.out.println(" ��");
				  System.out.println(" ��");
				  System.out.println(" ��");
				  System.out.println(" ��");
				  System.out.println(" ��");
				  break;
			  case 1:
				  System.out.println("�� ��");
				  System.out.println(" ��");
				  System.out.println(" ��");
				  System.out.println(" ��");
				  System.out.println(" ��");
				  System.out.println(" ��");
				  break;
			  case 2:
				  System.out.println(" �� ��");
				  System.out.println("--- ��");
				  System.out.println(" ��");
				  System.out.println(" ��");
				  System.out.println(" ��");
				  System.out.println(" ��");
				  break;
			  case 3:
				  System.out.println(" �� ��");
				  System.out.println("---��");
				  System.out.println(" ��  ��");
				  System.out.println("   ��");
				  System.out.println("   ��");
				  System.out.println("   ��");
				  break;
			  case 4:
				  System.out.println(" �� ��");
				  System.out.println("---��");
				  System.out.println(" ��  ��");
				  System.out.println(" ��  ��");
				  System.out.println("---��");
				  System.out.println("   ��");
				  break;
			  case 5:
				  System.out.println(" �� ��");
				  System.out.println("---��");
				  System.out.println(" ��  ��");
				  System.out.println(" ��  ��");
				  System.out.println("---��");
				  System.out.println("��    ��");
				  System.out.println("��    ��");
				  break;
			  case 6:
				  System.out.println(" �� ��");
				  System.out.println("---��");
				  System.out.println(" ��  ��");
				  System.out.println(" ��  ��");
				  System.out.println("---��");
				  System.out.println("�� �Ӥ�");
				  System.out.println("�� �Ӥ� ");
				  break;
		    		}
		    	}
		  public char readChar() throws IOException {
			  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			  String user;
			  
			  System.out.println("���ڸ� �Է��ϼ���:");
			  user=in.readLine(); //Ű����κ��� ������ �Է�
			  return user.charAt(0); // �Է¹��� ���ڿ� �� ù��° ���ڸ� ��ȯ
			  
			  
			  
		  }
	
}
