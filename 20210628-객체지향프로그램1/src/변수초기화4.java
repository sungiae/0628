
public class �����ʱ�ȭ4 {
	int a=10; // 1
	{
		a=100; // 2
	}
	�����ʱ�ȭ4()
	{
		a=1000; // 3
	}
	public static void main(String[] args) {
		�����ʱ�ȭ4 a=new �����ʱ�ȭ4();
		System.out.println(a.a);
	}

}
