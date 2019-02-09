
public class gamejava2_02 {
	
	public static void main(String[] args) {
		
	char myChar='\u0041'; //유니코드로 표현    유니코드는 사용중인 운영체제. 언어와 상관없이 모든 문자를 16비트로 표현하므로 최대 65,536자를 표현할 수 있다.

	System.out.println("myChar="+myChar);
	
	int myInt = 0x15; //변수는 사용하기 전에만 선언하면 어느 곳에서나 가능   15는 10진수 0x15는 16진수를 의미 015 8진수  
	System.out.println("myInt="+ myInt );
	
	float myFloat =15.1F;
	System.out.println("myFloat=" +myFloat);

	System.out.println("Single Quote(\')tBackslash(\\)");
	
			
		
	}
}