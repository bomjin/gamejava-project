package step3;

public class GameJava2_03_Wrapper {

	public static void main(String[] args) {
		
		int myInt=5316;
		System.out.println("myInt="+myInt);
		
		// int형 > interger형 객체 > Strin 형 객체 랩퍼 클래스
		// int interger  int 형에서 string 문자열로 바꾸끼   
		String myString = new Integer(myInt).toString(); 
		System.out.println("myString="+myString);
		
		myString = myString.replace("6","4");
		
		//String  형 객체 > float 형 객체 > float 형
		float myFloat = Float.valueOf(myString).floatValue();
		//valueOf(myString) String 형 값을 해당 랩퍼 클래스의 객체로 변환
		System.out.println("myFloat=" + myFloat);
		

	}

}
