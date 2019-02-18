package step1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class gamejava2_04 {
	public static void main(String[] args) {
		
Date today = new Date();

SimpleDateFormat dateForm = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� MM�� ss��"); // ������� ���� 

System.out.println(dateForm.format(today)); //�޼ҵ� �����  myClass.myMethod(x); Ŭ�����̸� �� �޼ҵ��̸� �μ� ; dateForm Ŭ�����̸� . format �޼ҵ��̸�

	}
}
