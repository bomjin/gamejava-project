package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Gmaejava2_03 {

	public static void main(String[] args) throws IOException {

		int x,y;   
		Random r= new Random(); 
		
		if(args.length==1) { // 인수가 있으면 인수로 준 값으로 문제 출제
			x=Integer.valueOf(args[0]).intValue(); //인수는 String 형이므로 랩퍼 클래스를 써서 int 형으로 변환 
		}else {
			x=Math.abs(r.nextInt()%9)+1; //1 2 3 4 5 6 7 8 9
			
		}
		
		y= Math.abs(r.nextInt()%9)+1; // 1 2 3 4 5 6 7 8 9
		
		int num = x*y; // x*y
		
		System.out.println();
		System.out.println("구구단"+x+"단어 문제 입니다.");
		System.out.println();
		
		System.out.println(x+"*"+y+"=");
		
// 입력
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // input
		String user; //문자열 
		user=in.readLine();  // 입력 
		
		int inputNum=new Integer(user).intValue(); // user는 문자열이니까. 형변환
		if(num==inputNum) { // num 값과 입력한 값이 맞으면 맞습니다 아니면 틀립니다. 
			System.out.println("맞았습니다!");
		}else{
		System.out.println("틀렸습니다. 정당은 "+num+"입니다.");
		
		
		
}
}

}
/*  구구단 게임






*/