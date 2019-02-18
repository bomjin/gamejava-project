package step4;

public class GameJava2_04_DoWhile {

	public static void main(String[] args) {
		
		int i,j;
		
		i=10;
		do {
			j=0;
		
		do {
			j=0;
			System.out.print("*");
			j++;
			
		}while(j<i);
		System.out.println();
		i--;

	}while(i>0);
}
	}

/* do{
 * 명령어;
 * }while(조건);
 * 
 * 
 * 
 * 
 */


