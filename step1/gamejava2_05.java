import java.util.Calendar;

public class gamejava2_05 {

	public static void main(String[] args) {
	
		Calendar now = Calendar.getInstance();  //메소드사용
		int year = now.get(Calendar.YEAR); //추가 
		int hour = now.get(Calendar.HOUR); //get 메소드 사용 
		int min = now.get(Calendar.MINUTE);
		
		System.out.println(year+"년 " + "현재 시각은"+ hour+"시"+min+"분 입니다.");
	}
}
