package JAVA.ch8;

public class Ex8_9 {
    public static void main(String[] args) throws Exception{
        method1(); // ���� Ŭ�������� static ����̹Ƿ� ��ü�������� ���� ȣ�Ⱑ��
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}
