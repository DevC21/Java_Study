package JAVA.ch12;

import java.util.HashMap;

public class Ex12_2 {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>(); // JDK1.7���� �����ڿ� Ÿ������ ��������
        map.put("�ڹٿ�", new Student("�ڹٿ�", 1, 1, 100, 100, 100));

        Student s = map.get("�ڹٿ�"); // ���׸�Ÿ������ Ÿ���� �������⶧���� ����ȯ�� �ʿ� ����

        System.out.println(s);
    }
}

class Student {
    String name = "";
    int ban; // ��
    int no; // ��ȣ
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