package step6;

public class GameJava2_06_Constructor {

	public static void main(String[] args) {
		GameJava2_06_Animal aAnimal = new GameJava2_06_Animal();
		aAnimal.print();
		
		GameJava2_06_Human aHuman = new GameJava2_06_Human();
		aHuman.print();

		GameJava2_06_Boy aBoy = new GameJava2_06_Boy();
		aBoy.print();
		
		System.out.println();
		
		
		GameJava2_06_Animal tiger =new GameJava2_06_Animal("ȣ����",8);
		tiger.print();
		GameJava2_06_Human mary =new GameJava2_06_Human("������",20);
		mary.print();
		GameJava2_06_Boy smin =new GameJava2_06_Boy("��¹�",14);
		smin.print();
		

	}

}
