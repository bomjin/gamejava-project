package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class gamejava3_06 {

	public static void main(String[] args) throws IOException {
	// 0~2 ������ ������ ���Ѵ�
	Random r = new Random();  
	int computer = Math.abs(r.nextInt()%3);
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	String user;
    System.out.println("���� ���� �� �� �ϳ��� �����ϼ���. (���� =a ����=b ��=c)");
    user=in.readLine();
    
    if(user.equals("a")) {
    	if(computer==0) System.out.println("���º� (��ǻ�� :����, ���: ����)");
    	if(computer==1) System.out.println("��ǻ�ͽ� (��ǻ�� :����, ���: ����)");
    	if(computer==2) System.out.println("����� (��ǻ�� :��, ���: ����)");
    }
    else if(user.equals("b")) {
    	if(computer==0) System.out.println("���º� (��ǻ�� :����, ���: ����)");
    	if(computer==1) System.out.println("��ǻ�ͽ� (��ǻ�� :��, ���: ����)");
    	if(computer==2) System.out.println("����� (��ǻ�� :����, ���: ����)");
    }
    else if(user.equals("c")) {
    	if(computer==0) System.out.println("���º� (��ǻ�� :��, ���: ��)");
    	if(computer==1) System.out.println("��ǻ�ͽ� (��ǻ�� :����, ���: ��)");
    	if(computer==2) System.out.println("����� (��ǻ�� :��, ���: ��)");
    }
    
}
}

