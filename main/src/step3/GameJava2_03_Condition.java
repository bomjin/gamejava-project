package step3;

public class GameJava2_03_Condition {

	public static void main(String[] args) {
	
	int hour, min, sec;
	
	hour=13;
	min=30;
	sec=25;
	
	String ampm; //���ڿ� 
	ampm=(hour>=12)?"PM":"AM"; //����= ����? ��1:��2   �����̸� ��2 ���̸� ��1 
	hour=(hour>=12)?(hour-12):hour; 
	
	System.out.println(ampm+" "+hour+":"+min+":"+sec);

	}

}
