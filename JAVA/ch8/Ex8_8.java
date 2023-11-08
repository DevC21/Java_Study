package JAVA.ch8;

public class Ex8_8 {
    public static void main(String[] args){
        // unchecked 예외이기때문에 예외 처리를 하지않아도 컴파일 되지만 실행시 에러가 발생한다.
        throw new RuntimeException(); // RuntimeException을 고의로 발생시킨다.
    }
}
