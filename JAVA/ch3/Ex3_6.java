package JAVA.ch3;

public class Ex3_6 {
    public static void main(String args[]) { 
		int a = 10;
		int b = 4;

		System.out.printf("%d + %d = %d\n",  a, b, a + b); // 10 + 4 = 14
		System.out.printf("%d - %d = %d\n",  a, b, a - b); // 10 - 4 = 6
		System.out.printf("%d * %d = %d\n",  a, b, a * b); // 10 * 4 = 40
		System.out.printf("%d / %d = %d\n",  a, b, a / b); // 10 / 4 = 2 -> ���������� �������� �Ҽ����� ������
		System.out.printf("%d / %f = %f\n",  a, (float)b, a / (float)b); // 10 / 4.0 = 2.5
        // �� �ǿ������� Ÿ���� ���� ��ġ��Ų��. (���� ū Ÿ������ ��ġ)

	}
}
