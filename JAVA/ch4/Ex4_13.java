package JAVA.ch4;

public class Ex4_13 {
    public static void main(String[] args){
        int sum = 0;
		int i = 0;

		while(sum <= 100) { // i�� 1�� �������Ѽ� sum�� ��� ���س�����.
			System.out.printf("%d - %d%n", i, sum);
            sum += ++i;
		}
    }
}
