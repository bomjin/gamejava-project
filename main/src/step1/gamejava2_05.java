package step1;

import java.util.Calendar;

public class gamejava2_05 {

	public static void main(String[] args) {
	
		Calendar now = Calendar.getInstance();  //�޼ҵ���
		int year = now.get(Calendar.YEAR); //�߰� 
		int hour = now.get(Calendar.HOUR); //get �޼ҵ� ��� 
		int min = now.get(Calendar.MINUTE);
		
		System.out.println(year+"�� " + "���� �ð���"+ hour+"��"+min+"�� �Դϴ�.");
	}
}
