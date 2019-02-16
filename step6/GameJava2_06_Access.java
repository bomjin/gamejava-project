package step6;

public class GameJava2_06_Access {

	public static void main(String[] args) {
		
		GameJava2_06_D d = new GameJava2_06_D();
		GameJava2_06_E e = new GameJava2_06_E();
		GameJava2_06_F f = new GameJava2_06_F();
		
		d.a=500;
		// e.b=500;			
        // f.c=500;
		
		d.methoud_A(); // 외부 클래스에서 접근가능
		//e.method_B(); private 외부 클래스에서 접근 불가능
		//f.method_C(); protected는 외부 쿨래스에서 접근 불가능
		
		d.method_D(); //외부 클래스에서 접근 가능
		e.method_E(); //외부 클래스에서 접근 가능
		f.method_F(); // 외부 클래스에서 접근가능 
		
		System.out.println("a="+d.a); // 외부클래스에서 접근가능
		//System.out.println("b="+e.b); // private는 외부클래스에서 접근 불가능
		//System.out.println("c="+f.c); // protected는 외부클래스에서 접근 불가능
	}

}
