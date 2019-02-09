import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class gamejava2_07 {

	public static void main(String[] args) {
	 
		Date today = new Date();
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy년 MM월 dd일의"); //형식
		System.out.print(dateForm.format(today));
		
		Random r = new Random();
		int randomNum = Math.abs(r.nextInt()%100); //Random 클래스는 nextInt라는 메소드 제공 abs 는 절대값 양수
 		System.out.println("오늘의 운세" + randomNum+"%"); // 랜덤으로 나옴 
		

	}

}
/*1단원에서 배운것 
기본적인 구조
메소드 종류 메소드 사용법은 구조적으로 아직 조금 이해가 안갑니다.
클래스 사용법  자바에서 제공해주는 클래스이기에 import 필요 
90%정도 이해 한거 같습니다. 
01.29 마무리 


*/