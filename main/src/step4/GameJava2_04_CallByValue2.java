package step4;

public class GameJava2_04_CallByValue2 {

	static int a;
	static int b;//�������� � ������������ ���� �� �� �ִ� ���� ;
	public static void swap() {
		int temp = a;
		a=b; //��������?
		b= temp;
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		a=10;
		b=20;
		
		System.out.println("swap()�޼ҵ� ȣ�� ��:"+a+","+b);
		swap(); //swap ��� �ؼ� �ٲ���
		System.out.println("swap()�޼ҵ� ȣ�� ��:"+a+","+b);
		
		
		
	}

}
/*
 * temp ���� ���� 
int temp = a;     // a : 10 |  b : 20 |  temp : 10
a = b;            // a : 20 |  b : 20 |  temp : 10 
b = temp;         // a : 20 |  b : 10 |  temp : 10  
*/
