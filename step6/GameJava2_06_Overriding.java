package step6;

public class GameJava2_06_Overriding {

	public static void main(String[] args) {
		
		Gamejava2_06_Dog yourDog = new Gamejava2_06_Dog("������",4); //dog �� ��ü ����
		
		yourDog.bark();
		yourDog.bite("��ü��");
		
		GameJava2_06_Snoopy myDog = new GameJava2_06_Snoopy();
		
               myDog.bark(); //�޼ҵ� �������̵�
               myDog.bite("����",9); // �޼ҵ� �����ε�
	}

}
//�޼ҵ� �����ε�  �޼ҵ� �̸� ���� �Ű� ���� Ÿ�� �ٸ� ���� Ÿ�� �������
//�޼ҵ� �������̵�  �޼ҵ� �̸� ���� �Ű� ���� Ÿ�� ���� ���� Ÿ�� ����