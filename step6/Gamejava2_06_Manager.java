package step6;

public class Gamejava2_06_Manager extends GameJava2_06_Emplyee {

	String department;
	
	public Gamejava2_06_Manager(String n, int s, String d)
	{
		super(n,s); //employee Ŭ������ �����ڿ��� �̸��� ���� ����
		department=d; //�μ�����
	}
	public void getInformation()
	{
		System.out.println("�̸�:"+name+"',�μ�:"+department+",����"+salary); // employee Ŭ������ �ִ� ���� ��� 
	}
	
		

	}


