package JAVA.ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_5 {
    	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator it = list.iterator();

		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

        //iterator는 1회용이라 다쓰고나면 다시 얻어와야 한다.
        it = list.iterator(); // 새로운 iterator객체를 얻는다.
        
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

        // ArrayList에서 HashSet으로 변경하면 get() 메서드가 없기때문에 작동하지 않지만
        // iterator는 공통이기때문에 그대로 사용이 가능하다.
        // for(int i = 0; i < list.size(); i++) {
        //     Object obj = list.get(i);
        //     System.out.println(obj);
        // }
	} // main
}
