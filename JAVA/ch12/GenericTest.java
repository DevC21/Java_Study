package JAVA.ch12;

import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10); // list.add(new Integer(10));
        list.add(20);
//      list.add("30"); // String�� �߰��� ����
        list.add(30); // ���׸��� ���п� Ÿ�� üũ�� ��ȭ��. 

//      Integer i = (Integer)list.get(2); // ������ OK, ����� ����
        Integer i = list.get(2); // ����ȯ ���� ����

        System.out.println(list);
    }
}
