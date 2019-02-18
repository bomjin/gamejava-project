package step5;



public class GameJava2_05_point {

	public static void main(String[] args) {
	Point p = new Point();
	p.x=10;
	p.y=20;
	p.printXY();
		}

}

class Point 
{
	int x;
	int y;
	
	public void printXY()
	{
		System.out.println("x="+x+", y="+y);
	}
}// point 클래스의 객체로 p를ㄹ 생성하고 p의 맴버변수 x, y에 10,20을 저장 한다음 
// p의 printXY( 메소드를 호출하면 저장된 x,y 값이 출력됩니다.


/* class 클래스 이름 [extends 부모클래스 이름] 클래스 헤더
 * {
 *    //맴버변수
 *    //메소드
 *    //생성자
 *    }
 *    
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
