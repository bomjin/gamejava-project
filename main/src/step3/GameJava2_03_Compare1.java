package step3;

public class GameJava2_03_Compare1 {

	public static void main(String[] args) {
		
		
		
		Integer x = new Integer(100); //배정된 주소가 다르기 떄문에 결과는 else 값  해결방법 equals 메소드 사용 
		Integer y = new Integer(100);
		
		if(x==y) {
			System.out.println(x+"=="+y);
		}else {
			System.out.println(x+"!="+y);
			
			
		}

	}

}
