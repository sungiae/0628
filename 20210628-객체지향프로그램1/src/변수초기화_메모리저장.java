/*
 * 클래스 영역에 변수를 선언 => 자동 초기화
 * int => 0
 * int a; // a=0
 * double => 0.0
 * float => 0.0f
 * byte, short => 0
 * String => null (주소가 없는 경우) => 모든 클래스는 주소값을 저장하고 있다 => 주소값 배정 (new 사용)
 * boolean => false
 */
public class 변수초기화_메모리저장 {
	int a;
	double d;
	String name;
	float f;
	byte b;
	short s;
	boolean boo;
	// 메소드는 초기값이 필요하지만 얘네들은 자동 지정
	
	// 5개의 정수가 필요
//	int[] arr=new int[5]; // 0,0,0,0,0
	public static void main(String[] args) {
	변수초기화_메모리저장 a=new 변수초기화_메모리저장(); // 저장 a라는 메모리 공간에 클래스에 선언된 모든 변수 저장
	System.out.println(a.a);
	System.out.println(a.d);
	System.out.println(a.name);
	System.out.println(a.f);
	System.out.println(a.b);
	System.out.println(a.s);
	System.out.println(a.boo);
	
	}

}
