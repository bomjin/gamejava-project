package step5;



public class GameJava2_05_point {

	public static void main(String[] args) {
	Point p = new Point();
	p.x=10;
	p.y=20;
	p.printXY();
		}

}

class Point 
{
	int x;
	int y;
	
	public void printXY()
	{
		System.out.println("x="+x+", y="+y);
	}
}// point Ŭ������ ��ü�� p���� �����ϰ� p�� �ɹ����� x, y�� 10,20�� ���� �Ѵ��� 
// p�� printXY( �޼ҵ带 ȣ���ϸ� ����� x,y ���� ��µ˴ϴ�.


/* class Ŭ���� �̸� [extends �θ�Ŭ���� �̸�] Ŭ���� ���
 * {
 *    //�ɹ�����
 *    //�޼ҵ�
 *    //������
 *    }
 *    
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
