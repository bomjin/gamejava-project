package step6;

public class GameJava2_06_Access {

	public static void main(String[] args) {
		
		GameJava2_06_D d = new GameJava2_06_D();
		GameJava2_06_E e = new GameJava2_06_E();
		GameJava2_06_F f = new GameJava2_06_F();
		
		d.a=500;
		// e.b=500;			
        // f.c=500;
		
		d.methoud_A(); // �ܺ� Ŭ�������� ���ٰ���
		//e.method_B(); private �ܺ� Ŭ�������� ���� �Ұ���
		//f.method_C(); protected�� �ܺ� �𷡽����� ���� �Ұ���
		
		d.method_D(); //�ܺ� Ŭ�������� ���� ����
		e.method_E(); //�ܺ� Ŭ�������� ���� ����
		f.method_F(); // �ܺ� Ŭ�������� ���ٰ��� 
		
		System.out.println("a="+d.a); // �ܺ�Ŭ�������� ���ٰ���
		//System.out.println("b="+e.b); // private�� �ܺ�Ŭ�������� ���� �Ұ���
		//System.out.println("c="+f.c); // protected�� �ܺ�Ŭ�������� ���� �Ұ���
	}

}
