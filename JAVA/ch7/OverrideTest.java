package JAVA.ch7;

// �������̵� ����
// 1. ����ΰ� ���� Ŭ������ �޼���� ��ġ�ؾ� �Ѵ�
// -> ��ȯŸ��, �޼��� �̸�, �Ű����� ��� ��ġ
// 2. ���� �����ڸ� ���� Ŭ������ �޼��庸�� ���� ������ ������ �� ����.
// -> public protected default private �� ��ġ�ؾ���
// 3. ���ܴ� ���� Ŭ������ �޼��庸�� ���� ������ �� ����.
// -> Exception ������ ���ų� �������

class MyPoint3 extends Object{
    int x;
    int y;

    MyPoint3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Object Ŭ������ toString()�� �������̵�
    public String toString() {
        return "x : " + x + ", y : " + y;
    }
}


public class OverrideTest {
    public static void main(String[] args){
        MyPoint3 p = new MyPoint3(3, 5);
        System.out.println(p);

        // System.out.println(p.toString());
        // System.out.println("p.x = " + p.x);
        // System.out.println("p.y = " + p.y);
    }
}
