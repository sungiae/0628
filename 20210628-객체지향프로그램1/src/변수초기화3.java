// ���� �ʱ�ȭ
/*
 * class A
 * {
 * 		===============
 * 		���� => �ʱ�ȭ (���۰��� ����)
 * 		= �����
 * 		= �����Ŀ� �� �ʱ�ȭ
 * 		  = ������
 * 		  = �ʱ�ȭ ���
 * 		===============
 * }
 * 
 * 
 * �������
 * ======
 * ������� : ������ ����
 * �޼ҵ� : ����� ������ ����
 * ������ : �޸� �Ҵ� => �����ͺ��̽� ���� (�ڹ� <===> ����Ŭ)
 */
import java.util.Scanner;

	public class �����ʱ�ȭ3 {
	
		String[] data=new String[10];
//		data[0]="ȫ�浿" => ����
//		int a=10;
//		a=30; =>  ���� // �޸� ��ġ�� �ϴ� ��ġ �̱� ������ (���� o) �� �ٲٴ� �� �Ұ��� (���� x) 
		int d;
		// ������� �ʱ�ȭ ��� => �ڵ�ȣ�� (����� �ʱ�ȭ => �ʱ�ȭ ��� => ������ (Ư���� ��찡 �ƴϸ� ������ �̿�))
		{
			data[0]="ȫ�浿";
			data[1]="��û��";
			data[2]="������";
			data[3]="�ڹ���";
			data[4]="�̼���";
			data[5]="�����";
			data[6]="��������";
			data[7]="������";
			data[8]="�̻�";
			data[9]="�Ҽ���";
		}
	

	public static void main(String[] args) {
		// ��� => �ݵ�� �޸𸮿� ����
		�����ʱ�ȭ3 a=new �����ʱ�ȭ3();
		
		// ���
		
		for (String name:a.data) {
			System.out.println(name);
		}
		System.out.println("==========");
		Scanner scan=new Scanner(System.in);
		System.out.println("�̸� �Է�:");
		String n=scan.next();
		// �̸��� �ִ� ��쿡�� �̸��� ���, ���� ���� �̸��� ����
		boolean bCheck=false;
		for(String name:a.data) {
			if(n.equals(name)) {
				System.out.println("ã�� �̸�: "+name);
				bCheck=true;
				break;
			}
//			else {
//				System.out.println("ã�� �̸��� �����ϴ�");
//				break;
//			}
		}
		if(bCheck==false) {
			System.out.println("ã�� �̸��� �����ϴ�");
		}
	}

}
