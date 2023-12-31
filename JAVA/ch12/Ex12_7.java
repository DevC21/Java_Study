package JAVA.ch12;

class Parent {
    void parentMethod() { }
}

class Child extends Parent {
    @Override
    @Deprecated
    void parentMethod() { } // 조상 메서드의 이름을 잘못 적으면 경고한다.
}

@FunctionalInterface // 함수형 인터페이스는 하나의 추상메서드만 가능
interface Testable {
    void test(); // 추상메서드
//  void check(); // 추상메서드
}

public class Ex12_7 {
    @SuppressWarnings("deprecation") // deprecation 경고 무시
    public static void main(String[] args) {
        Child c = new Child();
        c.parentMethod(); // deprecated된 메서드 사용
    }
}
