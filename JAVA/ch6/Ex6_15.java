package JAVA.ch6;

public class Ex6_15 {
    public static void main(String[] args){
        InitTest t = new InitTest();

        System.out.println("t.cv : " + t.cv); // 클래스 변수는 InitTest.cv로 쓰는것이 바람직
        System.out.println("t.iv : " + t.iv);
    }
}

// 클래스 변수 초기화 시점 : 클래스가 처음 로딩될 때 한번
// 인스턴스 변수 초기화 시점 : 인스턴스가 생성될 때 마다
class InitTest {
    // 실행 순서
    static int cv = 1; // 1
    int iv = 1; // 3

    static { cv = 2; } // 2
    { iv = 2; } // 4

    InitTest() { // 5
        iv = 3;
    }
}