package JAVA.ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_10 {
    	public static void main(String[] args) {
		Set set = new HashSet();

        // set의 크기가 6보다 작은 동안 1 ~ 45사이의 난수를 저장
		for(int i=0; i < set.size(); i++) {
            int num = (int)(Math.random() * 45);
			set.add(num);
		}
        
		System.out.println(set);
        List list = new LinkedList(set); // LinkedList(Collection c)
        Collections.sort(list); // Collections.sort(List list)
        System.out.println(list);
	}
}
