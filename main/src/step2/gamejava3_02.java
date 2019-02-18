package step2;

public class gamejava3_02 {

	public static void main(String[] args) {

		String str1= "Hello";
		String str2= new String("Hello");
		String str3= str1;
		String str4= str2;
		
		System.out.println("����");
		System.out.println("str1==str1:"+(str1==str1)); //true ���� ���� 1 1
		System.out.println("str1==str2:"+(str1==str2)); // false  ���ڿ������� ������ �ٸ��⿡ false // true�� ����� ���ؼ��� equals �ʿ�;;
 		System.out.println("str1==str3:"+(str1==str3)); // true ���� ���� 1 3 
		System.out.println("str1==str4:"+(str1==str4)); // false ;;
		System.out.println();
		
		System.out.println("Equal ����");
		System.out.println("str1 equls str1:" +(str1.equals(str1)));
		System.out.println("str1 equls str2:" +(str1.equals(str2)));
		System.out.println("str1 equls str3:" +(str1.equals(str3)));
		System.out.println("str1 equls str4:" +(str1.equals(str4)));
		
		}

}



/*
String Ŭ���� 

str1 = "hello"
str2 = "hello"

���ڿ� string Ŭ���������� str1 �� str2�� �ٸ��� 
�������ٸ��� �׷��� ���ϰ� ���� ���� str1.equals(str2) ture
(str1==str2) false





*/