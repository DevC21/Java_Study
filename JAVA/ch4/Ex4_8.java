package JAVA.ch4;

public class Ex4_8 {
    public static void main(String[] args){

        for(int i = 1, j = 10; i <= 10; i++, j--)
            System.out.printf("%d \t %d%n", i, j);

        int i = 1; // scope(����) - ������ġ���� ����� ���� ������
        // ���ǽ��� �����ϸ�, true�� ���ֵǾ ���ѹݺ����� �ȴ�
        for(;;)
            System.out.println("i=" + i);
        
    }

}
