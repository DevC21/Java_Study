package JAVA.ch11;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {
    public static void main(String[] args){
        Set set = new TreeSet(); // ���� �˻�, ����. ���� �ʿ����
//      Set set = new TreeSet(new TestComp); // ���� ������ ���ڷ� �־���

        for(int i = 0; set.size() < 6; i++){
            int num = (int)(Math.random() * 45) + 1;
            set.add(num); // set.add(new Integer(num));
        }

        System.out.println(set);
    }
}

// TreeSet�� �񱳸� �ϸ� ���Ҹ� ����ֱ� ������
// Ŭ������ Comparable�� �����ϰų�
class Test implements Comparable {
    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return -1;
    }
}

// Comparator�� ������ ���� ������ �־�����Ѵ�.
class TestComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        return 1;
    }
    
}