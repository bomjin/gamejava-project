package step3;

public class GameJava2_03_Wrapper {

	public static void main(String[] args) {
		
		int myInt=5316;
		System.out.println("myInt="+myInt);
		
		// int�� > interger�� ��ü > Strin �� ��ü ���� Ŭ����
		// int interger  int ������ string ���ڿ��� �ٲٳ�   
		String myString = new Integer(myInt).toString(); 
		System.out.println("myString="+myString);
		
		myString = myString.replace("6","4");
		
		//String  �� ��ü > float �� ��ü > float ��
		float myFloat = Float.valueOf(myString).floatValue();
		//valueOf(myString) String �� ���� �ش� ���� Ŭ������ ��ü�� ��ȯ
		System.out.println("myFloat=" + myFloat);
		

	}

}
