package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Gmaejava2_03 {

	public static void main(String[] args) throws IOException {

		int x,y;   
		Random r= new Random(); 
		
		if(args.length==1) { // �μ��� ������ �μ��� �� ������ ���� ����
			x=Integer.valueOf(args[0]).intValue(); //�μ��� String ���̹Ƿ� ���� Ŭ������ �Ἥ int ������ ��ȯ 
		}else {
			x=Math.abs(r.nextInt()%9)+1; //1 2 3 4 5 6 7 8 9
			
		}
		
		y= Math.abs(r.nextInt()%9)+1; // 1 2 3 4 5 6 7 8 9
		
		int num = x*y; // x*y
		
		System.out.println();
		System.out.println("������"+x+"�ܾ� ���� �Դϴ�.");
		System.out.println();
		
		System.out.println(x+"*"+y+"=");
		
// �Է�
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // input
		String user; //���ڿ� 
		user=in.readLine();  // �Է� 
		
		int inputNum=new Integer(user).intValue(); // user�� ���ڿ��̴ϱ�. ����ȯ
		if(num==inputNum) { // num ���� �Է��� ���� ������ �½��ϴ� �ƴϸ� Ʋ���ϴ�. 
			System.out.println("�¾ҽ��ϴ�!");
		}else{
		System.out.println("Ʋ�Ƚ��ϴ�. ������ "+num+"�Դϴ�.");
		
		
		
}
}

}
/*  ������ ����






*/