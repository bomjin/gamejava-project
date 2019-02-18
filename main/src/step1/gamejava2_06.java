package step1;

import java.util.Random;

public class gamejava2_06 {

	public static void main(String[] args) {
		
		Random r = new Random(); //����Ŭ�������� nextInt��� �޼ҵ带 ����// abs �޼ҵ� ���밪 ��� // 
	
		System.out.println("1~100 ���� ����:" + Math.abs(r.nextInt() % 100+1)); //?
	}

}
