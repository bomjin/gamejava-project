package step6;	

public class GameJava2_06_SubClass extends GameJava2_06_SuperClass  {

	public void print() {
		
		System.out.println("서브 클래스");
		
	}
	
	public void callSuperThis() {
		
		super.print(); //SuperClass 클래스의 print() 메소드  수퍼클래스의 메소드나 맴머변수를 나타내고 싶을 때는 super 
		this.print(); //SubClass 클래스의 print() 메소드 자신의 메소드나 맴버변수를 나타내고  싶을 떄는 this
	}
}
