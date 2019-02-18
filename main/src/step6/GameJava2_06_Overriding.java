package step6;

public class GameJava2_06_Overriding {

	public static void main(String[] args) {
		
		Gamejava2_06_Dog yourDog = new Gamejava2_06_Dog("돌돌이",4); //dog 형 객체 생성
		
		yourDog.bark();
		yourDog.bite("우체부");
		
		GameJava2_06_Snoopy myDog = new GameJava2_06_Snoopy();
		
               myDog.bark(); //메소드 오버라이딩
               myDog.bite("낸시",9); // 메소드 오버로딩
	}

}
//메소드 오버로딩  메소드 이름 동일 매개 변수 타입 다름 리턴 타입 상관없음
//메소드 오버라이딩  메소드 이름 동일 매개 변수 타입 동일 리턴 타입 동일