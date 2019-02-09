package gamejava3;

public class gamejava3_02 {

	public static void main(String[] args) {

		String str1= "Hello";
		String str2= new String("Hello");
		String str3= str1;
		String str4= str2;
		
		System.out.println("관계");
		System.out.println("str1==str1:"+(str1==str1)); //true 번지 같다 1 1
		System.out.println("str1==str2:"+(str1==str2)); // false  문자열에서는 번지가 다르기에 false // true로 만들기 위해서는 equals 필요;;
 		System.out.println("str1==str3:"+(str1==str3)); // true 번지 같다 1 3 
		System.out.println("str1==str4:"+(str1==str4)); // false ;;
		System.out.println();
		
		System.out.println("Equal 관계");
		System.out.println("str1 equls str1:" +(str1.equals(str1)));
		System.out.println("str1 equls str2:" +(str1.equals(str2)));
		System.out.println("str1 equls str3:" +(str1.equals(str3)));
		System.out.println("str1 equls str4:" +(str1.equals(str4)));
		
		}

}



/*
String 클래스 

str1 = "hello"
str2 = "hello"

문자열 string 클래스에서는 str1 과 str2는 다르다 
번지가다르다 그래서 비교하고 싶을 떄는 str1.equals(str2) ture
(str1==str2) false





*/