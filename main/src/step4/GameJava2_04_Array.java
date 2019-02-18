package step4;

public class GameJava2_04_Array {

	public static void main(String[] args) {
		
		int[] array1= {1,3,5,7,9}; //배열의 초기화 
		int[] array2;
		
		array2 = new int[array1.length];
		for(int i=0; i<array1.length;i++) //array1 만큼 반복
		{
			array2[i]=array1[i];
			
		}
		//array 1 출력
		for(int i=0; i<array1.length; i++) {
			System.out.println("array1["+i+"]="+array1[i]);
		}
			System.out.println();
			
			//array 2 출력
			for(int i=0; i<array2.length; i++) {
				System.out.println("array2["+i+"]="+array2[i]);
			}

	}

}
/*
 * int[] arrray;
 * int araay[];
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */


