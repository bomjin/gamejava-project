package step5;



public class Gamejava2_05_Constructor {

	public static void main(String[] args) {
		Clock c = new Clock(10,55,16);
		c.printTime();
	}
}
class Clock
{ 
	int hour;
	int min;
	int sec;
	
		public Clock(int h, int m, int s)
		{
			hour=h;
			min=m;
			sec=s;
		}
			public void printTime() {
				System.out.println(hour+","+min+":"+sec);
				
			}

	}

/* Ŭ�����̸� ���� Ŭ���� �̸� �μ�
 * Stack s = new Stack( 5 );
 * s.printTime() 
 * 
 * 
 * 
 * 
 * 
 */
