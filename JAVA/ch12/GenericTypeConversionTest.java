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
        // ������ �ȳ����� ���� Ÿ�԰� ���׸� Ÿ���� ����� �ʴ°� �ٶ����ϴ�.
		Box b = new Box<String>(); 

        Box<String> bStr = null;

        b = (Box)bStr;      // Box<String> -> Box ���� but ���
        bStr = (Box<String>)b;      // Box -> Box<String> ���� but ���

        FruitBox<? extends Fruit> fbox = (FruitBox<? extends Fruit>)new FruitBox<Fruit>();
        // FruitBox<Apple> -> FruitBox<? extends Fruit> ���� ����ȯ ����
        FruitBox<? extends Fruit> abox = new FruitBox<Apple>();

        // FruitBox<? extends Fruit> -> FruitBox<Apple> �����ϴ�.
        FruitBox<Apple> appleBox = (FruitBox<Apple>)abox; // OK. ���߻�

	}  // main
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();     // item�� ������ list
	void add(T item)  { list.add(item); }       // �ڽ��� item�� �߰�
	T get(int i)      { return list.get(i); }   // �ڽ����� item�� ������
	int size() { return list.size(); }
	public String toString() { return list.toString();}
}