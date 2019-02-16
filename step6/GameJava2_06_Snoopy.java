package step6;

public class GameJava2_06_Snoopy extends Gamejava2_06_Dog {

	public GameJava2_06_Snoopy() {
		
	 super("스누피",3); //dog 클래스의 생성자에게  이름과 나이를 전달
	
	 
		
	}

	public void bite(String name, int age) { // 매개변수가 2개인 bite() 메소드
		
		System.out.println(dog_name+"를 문"+name+"는"+age+"살입니다.(메소드 오버로딩)");
		
		
		
	}
	
	
	public void bark() { //매개변수가 없는 bark () 메소드
		
		System.out.println("안녕하세요,"+dog_name+"입니다. (메소드 오버라이딩)");
	}

	

}
// 메소드 오버로딩  메소드 이름 동일 매개 변수 타입 다름 리턴 타입 상관없음
// 메소드 오버라이딩  메소드 이름 동일 매개 변수 타입 동일 리턴 타입 동일