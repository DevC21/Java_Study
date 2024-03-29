package JAVA.ch14;

public class Ex14_0_1 {
    public static void main(String[] args) {
        // Object obj = (a, b) -> a > b ? a : b; // 람다식. 익명개체
        // Object obj = new Object() {
        //     int max(int a, int b) {
        //         return a > b ? a : b;
        //     }
        // };

        // MyFunction2 f = new MyFunction2() {
        //     public int max(int a, int b) { // 오버라이딩 - 접근제어자는 좁게 못바꾼다.
        //         return a > b ? a : b;
        //     }
        // };

        // 람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
        MyFunction2 f = (a, b) -> a > b ? a : b; // 람다식. 익명 객체

        // Object에는 max라는 메서드가 없기때문에 사용할 수 없음.
        // 따라서 함수형 인터페이스가 필요함.
        // int value = obj.max(3, 5);

        int value = f.max(3, 5);
        System.out.println("value = " + value);
    }
}

@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함.
interface MyFunction2 {
//  public abstract int max(int a, int b);
    int max(int a, int b);
}