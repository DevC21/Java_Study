package JAVA.ch7;

// 오버라이딩 조건
// 1. 선언부가 조상 클래스의 메서드와 일치해야 한다
// -> 반환타입, 메서드 이름, 매개변수 목록 일치
// 2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
// -> public protected default private 이 일치해야함
// 3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
// -> Exception 갯수가 같거나 적어야함

class MyPoint3 extends Object{
    int x;
    int y;

    MyPoint3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Object 클래스의 toString()을 오버라이딩
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
