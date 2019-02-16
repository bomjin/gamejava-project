package step6;

public class GameJava2_06_Human extends GameJava2_06_Animal {
	
	public GameJava2_06_Human() {
		
		this("인간",0);
		
	}
	public GameJava2_06_Human(String name, int age) {
		
		super(name, age); // animal 클래스의 생성자에게 이름과 나이를 전달 
	}

}
