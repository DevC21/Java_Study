package JAVA.ch12;

import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10); // list.add(new Integer(10));
        list.add(20);
//      list.add("30"); // String을 추가시 에러
        list.add(30); // 제네릭스 덕분에 타입 체크가 강화됨. 

//      Integer i = (Integer)list.get(2); // 컴파일 OK, 실행시 에러
        Integer i = list.get(2); // 형변환 생략 가능

        System.out.println(list);
    }
}
