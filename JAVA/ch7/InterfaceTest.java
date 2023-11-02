package JAVA.ch7;

class A {
//  public void method(B b or C c){ // ����Ϸ��� Ŭ���� ���� �����ؾ� �ϱ⶧���� ����������.
    public void method(I i){ // �������̽� I�� ������ Ŭ������ ���� �� �ִ�.
        i.method();
    }
}

interface I {
    public abstract void method();
}

class B implements I {
    public void method() {
        System.out.println("BŬ������ �޼���");
    }
}

class C implements I {
    public void method() {
        System.out.println("CŬ������ �޼���");
    }
}
public class InterfaceTest {
    
    public static void main(String[] args){
        A a = new A();
        a.method(new B());
        a.method(new C());
    }
}
