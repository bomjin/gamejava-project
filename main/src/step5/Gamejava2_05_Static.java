package step5;

public class Gamejava2_05_Static {

	public static void main(String[] args) {
		
		MyClass[] mc = new MyClass[10]; //10개의 MyClass형 객체를 갖는 배열을 선언
		
		
		for(int i=0;i<10;i++) {
			mc[i]=new MyClass(); //MyClass 클래스의 객체를 생성
			System.out.println("MYClass Instance의 수:"+mc[0].getObjectNum()+"개");
		}
		
	}

}
class MyClass
{
	static int object_num=0;
	
	public MyClass()
	{
		object_num++;
	}
	
	public static int getObjectNum() {
		return object_num;
	}
	  
}

/*
 static 데이트형 변수이름;
 
 static으로 선언된 맴버변수나 메소드는 객체와 상관없이 호출할 수 있다는 의미입니다. 따라서 객체를 생성할 필요없이 클래스 이름만으로도 상요할 수 있습니다. 
 
 int abs_x= Math.abs(x);
 
 Math m =Math();
 int abs_x=m.abs(x);
 
 static 메소드는 오직 static 맴버변수만 사용할 수 있습니다.
 static 메소드는 오직 같은 클래스 내의 static 메소드만 호출할 수 있습니다.
 static 메소드는 this를 사용할 수 없습니다.
 static 메소드와 일반 메소드는 오버로딩 될 수 있다.
 
 




*/