package JAVA.ch9;

import java.util.ArrayList;

public class BoxingTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(100)); // list���� ��ü�� �߰�����
        list.add(100); // JDK 1.5 �������� ���� �����Ϸ��� ����ڽ����� int�� Integer�� ��ȯ���ش�.

//      Integer i = list.get(0); // list�� ����� ù��° ��ü�� ������.
//      int i = list.get(0).intValue(); // intValue()�� Integer�� int�� ��ȯ
        int i = list.get(0); // �����Ϸ��� ��ڽ����� Integer�� int�� ��ȯ���ش�.

    }
}
