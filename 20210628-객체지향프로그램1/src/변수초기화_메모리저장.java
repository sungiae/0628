/*
 * Ŭ���� ������ ������ ���� => �ڵ� �ʱ�ȭ
 * int => 0
 * int a; // a=0
 * double => 0.0
 * float => 0.0f
 * byte, short => 0
 * String => null (�ּҰ� ���� ���) => ��� Ŭ������ �ּҰ��� �����ϰ� �ִ� => �ּҰ� ���� (new ���)
 * boolean => false
 */
public class �����ʱ�ȭ_�޸����� {
	int a;
	double d;
	String name;
	float f;
	byte b;
	short s;
	boolean boo;
	// �޼ҵ�� �ʱⰪ�� �ʿ������� ��׵��� �ڵ� ����
	
	// 5���� ������ �ʿ�
//	int[] arr=new int[5]; // 0,0,0,0,0
	public static void main(String[] args) {
	�����ʱ�ȭ_�޸����� a=new �����ʱ�ȭ_�޸�����(); // ���� a��� �޸� ������ Ŭ������ ����� ��� ���� ����
	System.out.println(a.a);
	System.out.println(a.d);
	System.out.println(a.name);
	System.out.println(a.f);
	System.out.println(a.b);
	System.out.println(a.s);
	System.out.println(a.boo);
	
	}

}
