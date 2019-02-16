package step6;

public class GameJava2_06_Animal {
	String name;
	int age;


public GameJava2_06_Animal() {
        
	this("동물",0);
}
	public GameJava2_06_Animal(String name,int age){
		this.name=name;
		this.age=age;

}
public void print() {
	System.out.println("이름"+name);
	System.out.println("나이"+age+"세");
}
}