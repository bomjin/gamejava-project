package step6;

public class Gamejava2_06_Dog {

	String dog_name;;
	int dog_age;
	

public Gamejava2_06_Dog(String name, int age) { //�����ڿ��� super �̸��� ���̸� �� �� �̚�.
	
	dog_name = name; // �Ű����� 
    dog_age = age;
}

public void bite() // �Ű������� ���� bite �޼ҵ�
{
	System.out.println(dog_name+"�� �ƹ��� ���� �ʾҽ��Ѵ�");
	
}

public void bite(String name) //�Ű������� 1���� bite() �޼ҵ� 
{
	System.out.println(dog_name+"��"+name+"�� �������ϴ�.");
}
public void bark() {
	System.out.println("�۸�"); //�ް� ������ ���� bark��()�޼ҵ�
}
}























/*
 �޼ҵ� �������̵�
 ������ Ŭ������ ��ÿ�� ������ �� ȣ��� �޼ҵ尡 �����ȴ� 
                 Dog myDog1=new Dog(); // Dog Ŭ������ my Dog1 ����
                 myDog1.bark(); // Dog Ŭ������ bark() �޼ҵ� ȣ��
                 
 
 


*/