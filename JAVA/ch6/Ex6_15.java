package JAVA.ch6;

public class Ex6_15 {
    public static void main(String[] args){
        InitTest t = new InitTest();

        System.out.println("t.cv : " + t.cv); // Ŭ���� ������ InitTest.cv�� ���°��� �ٶ���
        System.out.println("t.iv : " + t.iv);
    }
}

// Ŭ���� ���� �ʱ�ȭ ���� : Ŭ������ ó�� �ε��� �� �ѹ�
// �ν��Ͻ� ���� �ʱ�ȭ ���� : �ν��Ͻ��� ������ �� ����
class InitTest {
    // ���� ����
    static int cv = 1; // 1
    int iv = 1; // 3

    static { cv = 2; } // 2
    { iv = 2; } // 4

    InitTest() { // 5
        iv = 3;
    }
}