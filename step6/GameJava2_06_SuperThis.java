package step6;

public class GameJava2_06_SuperThis {

	public static void main(String[] args) {
		
		GameJava2_06_SuperClass superclass = new GameJava2_06_SuperClass();
		
		System.out.print("SuperClass�� print() �޼ҵ�:"); //super Class �� ��ü ����,
		superclass.print();
		
		GameJava2_06_SubClass subclass = new GameJava2_06_SubClass(); //subClass�� ��ü ���� 
		
		System.out.print("SubClass��  print() �޼ҵ�:");
		subclass.print();
		
		System.out.println("SubClass����  super, this�� ȣ�� :");
		subclass.callSuperThis();
	}

}
