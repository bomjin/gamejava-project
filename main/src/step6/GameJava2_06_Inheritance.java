package step6;

public class GameJava2_06_Inheritance {

	public static void main(String[] args) {
		
		Gamejava2_06_Manager mng=new Gamejava2_06_Manager("김시내",800000,"전산실"); 
		// manager 클래스의 객체를 생성하거,이름 월급 부서를 인수로 전달
		
		mng.getInformation(); //manage 클래스의 getInformation 메소드를 호출

	}

}
