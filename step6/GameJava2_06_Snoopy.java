package step6;

public class GameJava2_06_Snoopy extends Gamejava2_06_Dog {

	public GameJava2_06_Snoopy() {
		
	 super("������",3); //dog Ŭ������ �����ڿ���  �̸��� ���̸� ����
	
	 
		
	}

	public void bite(String name, int age) { // �Ű������� 2���� bite() �޼ҵ�
		
		System.out.println(dog_name+"�� ��"+name+"��"+age+"���Դϴ�.(�޼ҵ� �����ε�)");
		
		
		
	}
	
	
	public void bark() { //�Ű������� ���� bark () �޼ҵ�
		
		System.out.println("�ȳ��ϼ���,"+dog_name+"�Դϴ�. (�޼ҵ� �������̵�)");
	}

	

}
// �޼ҵ� �����ε�  �޼ҵ� �̸� ���� �Ű� ���� Ÿ�� �ٸ� ���� Ÿ�� �������
// �޼ҵ� �������̵�  �޼ҵ� �̸� ���� �Ű� ���� Ÿ�� ���� ���� Ÿ�� ����