package step5;

public class GameJava2_05_StringBuffer {
	public static void main(String[] args) {
		
		 StringBuffer sb= new StringBuffer();
		 sb.append('I');
		 sb.append("nternet");
		 sb.append(2002);
		 sb.append("");
		 sb.append(0.1);
		 System.out.println(sb);
		 sb.insert(8,",B");
		 sb.insert(11, 'C');
		 System.out.println(sb);
		 
		 
	}
}
// StringBuffer Ŭ������ ������ ���ڿ� �ڿ� ���ڸ� �߰��ϰų�, 
// ���ڿ� �߰��� �ٸ� ���ڿ��� ������ �� �ְ� Ư�� ��ġ�� ���ڸ� �ٲ� ���� �ֱ� ������ �ſ� ���մϴ�.