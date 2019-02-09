package step4;

public class GameJava2_04_CallByValue {

	public static void swap(int x , int y) { 
	
		int temp = x; // x갑을 보관
		
		x=y;
		y=temp;
		
		
	}
	public static void main(String[] args)
	{
		
		int a=10;
		int b=20;
		
		System.out.println("swap() 메소드 호출 전:"+a+","+b);
		swap(a,b); // x에는 a y에는 b값이 전달
		System.out.println("swap() 메소드 호출 후:"+a+","+b);
	}

}
/*
모듈(module)
서브루틴(subroutine)



*/