package step4;

public class GameJava2_04_While {

	public static void main(String[] args) {
		int i,j;
		i=10;
		while(i>0) { // i>0
			j=0;
			while(j<i) { //j ���� i ������ ������ �ݺ�
				System.out.print("*");
				  //j=j+1
				
			}
			System.out.println();
			i--; //i=i-1
		}
	}

}
