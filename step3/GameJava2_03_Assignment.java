package step3;

public class GameJava2_03_Assignment {
	public static void main(String[] args) {
		
		int x,y,z;
		
		x=y=z=1; 
		z+=x+y; //z=z+x+y;
		System.out.println("x="+x+",y="+y+",z="+z);
		
	 
		x+=y-=z=5; // z=5; y=y-z; x=x+y; 
		System.out.println("x="+x+",y="+y+",z="+z);
		
		
	}
}
