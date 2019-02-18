package step6;

public class Gamejava2_06_Manager extends GameJava2_06_Emplyee {

	String department;
	
	public Gamejava2_06_Manager(String n, int s, String d)
	{
		super(n,s); //employee 클래스의 생성자에게 이름과 월급 전달
		department=d; //부서저장
	}
	public void getInformation()
	{
		System.out.println("이름:"+name+"',부서:"+department+",연봉"+salary); // employee 클래스에 있는 변수 사용 
	}
	
		

	}


