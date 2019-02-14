package step5;

public class Gamejava2_05_Static {

	public static void main(String[] args) {
		
		MyClass[] mc = new MyClass[10]; //10���� MyClass�� ��ü�� ���� �迭�� ����
		
		
		for(int i=0;i<10;i++) {
			mc[i]=new MyClass(); //MyClass Ŭ������ ��ü�� ����
			System.out.println("MYClass Instance�� ��:"+mc[0].getObjectNum()+"��");
		}
		
	}

}
class MyClass
{
	static int object_num=0;
	
	public MyClass()
	{
		object_num++;
	}
	
	public static int getObjectNum() {
		return object_num;
	}
	  
}

/*
 static ����Ʈ�� �����̸�;
 
 static���� ����� �ɹ������� �޼ҵ�� ��ü�� ������� ȣ���� �� �ִٴ� �ǹ��Դϴ�. ���� ��ü�� ������ �ʿ���� Ŭ���� �̸������ε� ����� �� �ֽ��ϴ�. 
 
 int abs_x= Math.abs(x);
 
 Math m =Math();
 int abs_x=m.abs(x);
 
 static �޼ҵ�� ���� static �ɹ������� ����� �� �ֽ��ϴ�.
 static �޼ҵ�� ���� ���� Ŭ���� ���� static �޼ҵ常 ȣ���� �� �ֽ��ϴ�.
 static �޼ҵ�� this�� ����� �� �����ϴ�.
 static �޼ҵ�� �Ϲ� �޼ҵ�� �����ε� �� �� �ִ�.
 
 




*/