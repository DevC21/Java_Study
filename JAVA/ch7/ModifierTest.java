package JAVA.ch7;

public class ModifierTest {
    public static final int WIDTH = 200;

    public static void main(String[] args){
        System.out.println("WIDTH = " + WIDTH);
    }
}

class StaticTest{
    static int width = 200;     // 클래스 변수(static변수) 간단한 초기화
    static int height = 120;    // 클래스 변수(static변수) 간단한 초기화

    static { // 클래스 초기화 블럭
        // static변수의 복잡한 초기화
    }

    static int max(int a, int b) { // 클래스 메서드(static메서드)
        return a > b ? a : b;
    }
}

final class FinalTest {         // 조상이 될 수 없는 클래스
    final int MAX_SIZE = 10;    // 값을 변경할 수 없는 멤버변수(상수)

    final int getMaxSize(){     // 오버라이딩할 수 없는 메서드(변경불가)
        final int LV = MAX_SIZE;// 값을 변경할 수 없는 지역변수(상수)
        return MAX_SIZE;
    }
}

// 추상 클래스를 상속받은 자식 클래스 통해서 메서드를 완성시켜야 사용가능
abstract class AbstractTest {   // 추상 클래스(추상 메서드를 포함한 클래스)
    abstract void move();       // 추상 메서드(선언부만 존재하고 구현부가 존재하지 않음)
}