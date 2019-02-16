package step6;

public class GameJava2_06_Emplyee {

	String name; //
	int salary;
	
	public GameJava2_06_Emplyee(String n, int s) { // 생성자 가 이름과 울급을 인수로 받음
		
		name=n; //이름과 월급을 저장
		salary=s;
		
		
	}
 public void getInformation() { // getInformation 메소드를 호출하면  manger클래스에 정의되어있지 않은 name과 salary도 출력할수있다
	 
	 System.out.println("이름:"+name+",연봉:"+salary);
	
	 }		

}



















/* class 서브클래스이름 extends 수퍼 클래스이름 
 * {
 *맴버변수
 * 메소드
 * 생성자
 *   
 *    
 *   class Sonata extends Car
 *   
 *   int airbag; //추가되는 멤버변수
 *   
 *   public void abs() // 추가되거나 수정되는 메소드 
 *   {
 *
 * 
 * 
 * 
 */




