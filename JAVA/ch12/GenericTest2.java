package JAVA.ch12;

import java.util.ArrayList;

class Tv {}
class Audio {}

public class GenericTest2 {
    public static void main(String[] args) {
        ArrayList<Tv> list = new ArrayList<Tv>(); // TvŸ���� ��ü�� ���尡��
        list.add(new Tv());
//      list.add(new Audio()); // ���� �Ұ�
        
        Tv t = list.get(0); // list�� ù��° ��Ҹ� ������.

    }
}
