package step4;

public class GameJava2_04_Break {

	public static void main(String[] args) {
		
		int i,j;
		
	
		i=10;
		OUT_WHILE: while(true)
		{
			j=0;
			while(true)
			{
				System.out.print("*");
				j++;
				if(j>=i) break;
			}
			System.out.println();
			i--;
			if(i<=0) break OUT_WHILE;
			}
		}
	
		
		

	}


