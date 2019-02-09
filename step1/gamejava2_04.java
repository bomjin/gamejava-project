
import java.text.SimpleDateFormat;
import java.util.Date;

public class gamejava2_04 {
	public static void main(String[] args) {
		
Date today = new Date();

SimpleDateFormat dateForm = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 MM분 ss초"); // 출력형식 지정 

System.out.println(dateForm.format(today)); //메소드 사용방법  myClass.myMethod(x); 클래스이름 점 메소드이름 인수 ; dateForm 클래스이름 . format 메소드이름

	}
}
