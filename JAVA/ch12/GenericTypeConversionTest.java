package JAVA.ch12;

import java.util.ArrayList;

class Fruit implements Eatable {
	public String toString() { return "Fruit";}
}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy		          { public String toString() { return "Toy"  ;}}

interface Eatable {}

public class GenericTypeConversionTest {
	public static void main(String[] args) {
        // 에러는 안나지만 원시 타입과 제네릭 타입을 섞어쓰지 않는게 바람직하다.
		Box b = new Box<String>(); 

        Box<String> bStr = null;

        b = (Box)bStr;      // Box<String> -> Box 가능 but 경고
        bStr = (Box<String>)b;      // Box -> Box<String> 가능 but 경고

        FruitBox<? extends Fruit> fbox = (FruitBox<? extends Fruit>)new FruitBox<Fruit>();
        // FruitBox<Apple> -> FruitBox<? extends Fruit> 가능 형변환 생략
        FruitBox<? extends Fruit> abox = new FruitBox<Apple>();

        // FruitBox<? extends Fruit> -> FruitBox<Apple> 가능하다.
        FruitBox<Apple> appleBox = (FruitBox<Apple>)abox; // OK. 경고발생

	}  // main
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();     // item을 저장할 list
	void add(T item)  { list.add(item); }       // 박스에 item을 추가
	T get(int i)      { return list.get(i); }   // 박스에서 item을 꺼낼때
	int size() { return list.size(); }
	public String toString() { return list.toString();}
}