package JAVA.ch12;

import java.util.HashMap;

public class Ex12_2 {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>(); // JDK1.7부터 생성자에 타입지정 생략가능
        map.put("자바왕", new Student("자바왕", 1, 1, 100, 100, 100));

        Student s = map.get("자바왕"); // 제네릭타입으로 타입을 명시해줬기때문에 형변환이 필요 없음

        System.out.println(s);
    }
}

class Student {
    String name = "";
    int ban; // 반
    int no; // 번호
    int kor;
    int eng;
    int math;

    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}