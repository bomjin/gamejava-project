package gamejava3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class gamejava3_03 {

	public static void main(String[] args) throws IOException {
	
	InputStreamReader isr= new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(isr);
	
	String str;
	System.out.println("글씨를 입력하시면 따라합니다.");
	str= in.readLine(); //키보드로부터 한 줄을 입력받음
	System.out.println(str);

	}

}


/*
  
  
  에외처리 ;;
 
 
 
 
 
 */
