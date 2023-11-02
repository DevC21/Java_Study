package JAVA.ch7;

class A {
//  public void method(B b or C c){ // 사용하려는 클래스 마다 구현해야 하기때문에 복잡해진다.
    public void method(I i){ // 인터페이스 I를 구현한 클래스만 들어올 수 있다.
        i.method();
    }
}

interface I {
    public abstract void method();
}

class B implements I {
    public void method() {
        System.out.println("B클래스의 메서드");
    }
}

class C implements I {
    public void method() {
        System.out.println("C클래스의 메서드");
    }
}
public class InterfaceTest {
    
    public static void main(String[] args){
        A a = new A();
        a.method(new B());
        a.method(new C());
    }
}
