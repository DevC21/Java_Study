package JAVA.ch9;

import java.util.ArrayList;

public class BoxingTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(100)); // list에는 객체만 추가가능
        list.add(100); // JDK 1.5 이전에는 에러 컴파일러가 오토박싱으로 int를 Integer로 변환해준다.

//      Integer i = list.get(0); // list에 저장된 첫번째 객체를 꺼낸다.
//      int i = list.get(0).intValue(); // intValue()로 Integer를 int로 변환
        int i = list.get(0); // 컴파일러가 언박싱으로 Integer를 int로 변환해준다.

    }
}
