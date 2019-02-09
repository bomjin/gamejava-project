import java.util.Random;

public class gamejava2__06 {

	public static void main(String[] args) {
		
		Random r = new Random(); //랜덤클래스에는 nextInt라는 메소드를 포함// abs 메소드 절대값 양수 // 
	
		System.out.println("1~100 범위 난수:" + Math.abs(r.nextInt() % 100+1)); //?
	}

}
