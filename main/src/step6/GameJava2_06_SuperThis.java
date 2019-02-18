package step6;

public class GameJava2_06_SuperThis {

	public static void main(String[] args) {
		
		GameJava2_06_SuperClass superclass = new GameJava2_06_SuperClass();
		
		System.out.print("SuperClass의 print() 메소드:"); //super Class 형 객체 생성,
		superclass.print();
		
		GameJava2_06_SubClass subclass = new GameJava2_06_SubClass(); //subClass형 객체 생성 
		
		System.out.print("SubClass의  print() 메소드:");
		subclass.print();
		
		System.out.println("SubClass에서  super, this로 호출 :");
		subclass.callSuperThis();
	}

}
