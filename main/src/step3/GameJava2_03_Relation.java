package step3;

public class GameJava2_03_Relation {
	public static void main(String[] args) {
		
		int x,y,z;
		boolean b;
		
		x=y=z=1;
		b=((x--> 0)||(++y !=0)&&(--z==0));  // true or true and true   //증감연산자 + 앞에 뒤에 차이 
		System.out.println("x="+x+",y="+y+",z="+z+",b="+b);
		
		
	}
}
