package step4;

public class GameJava2_04_Continue {

	public static void main(String[] args) {
		int i=0;
		
		while(i<10)
		{
			i++;
			if(i%2!=0) continue; // Ȧ���� ��� �̵�
			System.out.println(i);	
		}

	}

}
