package step2;

public class gamejava3_01 {

	public static void main(String[] args) {
		
		String str1= "Hello";
		String str2= "World!";
		String str3= str1+str2;
		
		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
		System.out.println("str3:"+str3);
		System.out.println("str1�� ũ���:"+str1.length()+"�Դϴ�.");
		System.out.println("str2�� �ҹ��ڷ� �ٲٸ�:"+str2.toLowerCase()+"�Դϴ�.");
		System.out.println("str3�� l��L�� �ٲٸ�:"+str3.replace('l', 'L')+"�Դϴ�.");
		System.out.println("str2�� 3���� ���ڴ�:"+str2.charAt(2)+"�Դϴ�."); //�迭 0 1 2 3��° ����
		
		
	}

}
