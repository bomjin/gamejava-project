package step6;	

public class GameJava2_06_SubClass extends GameJava2_06_SuperClass  {

	public void print() {
		
		System.out.println("���� Ŭ����");
		
	}
	
	public void callSuperThis() {
		
		super.print(); //SuperClass Ŭ������ print() �޼ҵ�  ����Ŭ������ �޼ҵ峪 �ɸӺ����� ��Ÿ���� ���� ���� super 
		this.print(); //SubClass Ŭ������ print() �޼ҵ� �ڽ��� �޼ҵ峪 �ɹ������� ��Ÿ����  ���� ���� this
	}
}
