package step4;

public class GameJava2_04_CallByReference {

    public static void swap(Number z) {
    	int temp=z.x;
    	z.x=z.y;
    	z.y=temp;
    	
    	
    }
  
	public static void main(String[] args) {
	
		Number n=new Number();
		n.x=10;
		n.y=20;
		
		System.out.println("swap()메소드 호출 전 : "+n.x+","+n.y);
		swap(n);
		System.out.println("swap() 메소드 호출 후:"+n.x+","+n.y);
		
		
	}

}
class Number
{
	public int x;
	public int y;
}

/*
Number 클래스의 객체를 생서아여 값을 전달하게 되면 객체가 저장한 값이 주소값이기 때문에, 
swap() 메소드에서 객체에 저장한 결과가 main() 메소드로 돌려지게 됩니다.
*/