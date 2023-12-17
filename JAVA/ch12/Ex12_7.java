package JAVA.ch12;

class Parent {
    void parentMethod() { }
}

class Child extends Parent {
    @Override
    @Deprecated
    void parentMethod() { } // ���� �޼����� �̸��� �߸� ������ ����Ѵ�.
}

@FunctionalInterface // �Լ��� �������̽��� �ϳ��� �߻�޼��常 ����
interface Testable {
    void test(); // �߻�޼���
//  void check(); // �߻�޼���
}

public class Ex12_7 {
    @SuppressWarnings("deprecation") // deprecation ��� ����
    public static void main(String[] args) {
        Child c = new Child();
        c.parentMethod(); // deprecated�� �޼��� ���
    }
}
