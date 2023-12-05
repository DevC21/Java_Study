package JAVA.ch11;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {
    public static void main(String[] args){
        Set set = new TreeSet(); // 범위 검색, 정렬. 정렬 필요없음
//      Set set = new TreeSet(new TestComp); // 정렬 기준을 인자로 넣어줌

        for(int i = 0; set.size() < 6; i++){
            int num = (int)(Math.random() * 45) + 1;
            set.add(num); // set.add(new Integer(num));
        }

        System.out.println(set);
    }
}

// TreeSet은 비교를 하며 원소를 집어넣기 때문에
// 클래스에 Comparable을 구현하거나
class Test implements Comparable {
    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return -1;
    }
}

// Comparator를 구현한 정렬 기준을 넣어줘야한다.
class TestComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        return 1;
    }
    
}