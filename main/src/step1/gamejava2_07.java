package step1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class gamejava2_07 {

	public static void main(String[] args) {
	 
		Date today = new Date();
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy�� MM�� dd����"); //����
		System.out.print(dateForm.format(today));
		
		Random r = new Random();
		int randomNum = Math.abs(r.nextInt()%100); //Random Ŭ������ nextInt��� �޼ҵ� ���� abs �� ���밪 ���
 		System.out.println("������ �" + randomNum+"%"); // �������� ���� 
		

	}

}
/*1�ܿ����� ���� 
�⺻���� ����
�޼ҵ� ���� �޼ҵ� ������ ���������� ���� ���� ���ذ� �Ȱ��ϴ�.
Ŭ���� ����  �ڹٿ��� �������ִ� Ŭ�����̱⿡ import �ʿ� 
90%���� ���� �Ѱ� �����ϴ�. 
01.29 ������ 


*/