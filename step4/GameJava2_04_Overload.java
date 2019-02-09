package step4;

public class GameJava2_04_Overload {
	
	public static int max(int x ,int y) { // max 메소드에 x 와 y값 저장
		if(x>y) { //x>y 보다 크면 x값 반환 else y값 반환
			return x;
		}else {
			return y;
			}
	}
	
	public static double max(double x, double y) {
		if(x>y) {
			return x;
			
		}
		else {
			return y;
		}
	}

	public static void main(String[] args) {
		
		int a=30;
		int b=20;
		System.out.println(max(a,b));
		
		double c=30.5;
		double d=20.5;
		System.out.println(max(c,d));

	}

}

/* int add(int x, int y)
{
	return x+y;
}
 int add(int a, int b)
 {
 return a+b;
 }
*/
