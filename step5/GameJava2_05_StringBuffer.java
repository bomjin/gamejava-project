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
// StringBuffer 클래스는 현재의 문자열 뒤에 문자를 추가하거나, 
// 문자열 중간에 다른 문자열을 삽입할 수 있고 특정 위치의 문자를 바꿀 수도 있기 때문에 매우 편리합니다.