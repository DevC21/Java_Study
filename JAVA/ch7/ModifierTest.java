package JAVA.ch7;

public class ModifierTest {
    public static final int WIDTH = 200;

    public static void main(String[] args){
        System.out.println("WIDTH = " + WIDTH);
    }
}

class StaticTest{
    static int width = 200;     // Ŭ���� ����(static����) ������ �ʱ�ȭ
    static int height = 120;    // Ŭ���� ����(static����) ������ �ʱ�ȭ

    static { // Ŭ���� �ʱ�ȭ ��
        // static������ ������ �ʱ�ȭ
    }

    static int max(int a, int b) { // Ŭ���� �޼���(static�޼���)
        return a > b ? a : b;
    }
}

final class FinalTest {         // ������ �� �� ���� Ŭ����
    final int MAX_SIZE = 10;    // ���� ������ �� ���� �������(���)

    final int getMaxSize(){     // �������̵��� �� ���� �޼���(����Ұ�)
        final int LV = MAX_SIZE;// ���� ������ �� ���� ��������(���)
        return MAX_SIZE;
    }
}

// �߻� Ŭ������ ��ӹ��� �ڽ� Ŭ���� ���ؼ� �޼��带 �ϼ����Ѿ� ��밡��
abstract class AbstractTest {   // �߻� Ŭ����(�߻� �޼��带 ������ Ŭ����)
    abstract void move();       // �߻� �޼���(����θ� �����ϰ� �����ΰ� �������� ����)
}