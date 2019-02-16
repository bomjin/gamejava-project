package step6;

public class Gamejava2_06_Dog {

	String dog_name;;
	int dog_age;
	

public Gamejava2_06_Dog(String name, int age) { //생성자에게 super 이름과 나이를 줄 수 이싿.
	
	dog_name = name; // 매개변수 
    dog_age = age;
}

public void bite() // 매개변수가 없는 bite 메소드
{
	System.out.println(dog_name+"가 아무도 물지 않았습닌다");
	
}

public void bite(String name) //매개변수가 1개인 bite() 메소드 
{
	System.out.println(dog_name+"가"+name+"을 물었습니다.");
}
public void bark() {
	System.out.println("멍멍"); //메게 변수가 없는 bark가()메소드
}
}























/*
 메소드 오버라이딩
 다형성 클래스로 객첼를 생성할 때 호출될 메소드가 결정된다 
                 Dog myDog1=new Dog(); // Dog 클래스로 my Dog1 생성
                 myDog1.bark(); // Dog 클래스의 bark() 메소드 호출
                 
 
 


*/