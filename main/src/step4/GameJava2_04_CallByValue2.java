package step4;

public class GameJava2_04_CallByValue2 {

	static int a;
	static int b;//전역변수 어떤 변수내에서도 접근 할 수 있는 변수 ;
	public static void swap() {
		int temp = a;
		a=b; //전역변수?
		b= temp;
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		a=10;
		b=20;
		
		System.out.println("swap()메소드 호출 전:"+a+","+b);
		swap(); //swap 사용 해서 바꿔줌
		System.out.println("swap()메소드 호출 후:"+a+","+b);
		
		
		
	}

}
/*
 * temp 값을 보관 
int temp = a;     // a : 10 |  b : 20 |  temp : 10
a = b;            // a : 20 |  b : 20 |  temp : 10 
b = temp;         // a : 20 |  b : 10 |  temp : 10  
*/
