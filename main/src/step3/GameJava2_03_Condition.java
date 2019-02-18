package step3;

public class GameJava2_03_Condition {

	public static void main(String[] args) {
	
	int hour, min, sec;
	
	hour=13;
	min=30;
	sec=25;
	
	String ampm; //문자열 
	ampm=(hour>=12)?"PM":"AM"; //변수= 조건? 값1:값2   거짓이면 값2 참이면 값1 
	hour=(hour>=12)?(hour-12):hour; 
	
	System.out.println(ampm+" "+hour+":"+min+":"+sec);

	}

}
