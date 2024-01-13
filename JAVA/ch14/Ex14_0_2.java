package JAVA.ch14;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_0_2 {
    public static void main(String[] args) {
        // Function<String, Integer> f = (String s) -> Integer.parseInt(s);
        // Function<String, Integer> f = Ŭ�����̸�::�޼����̸�;
        Function<String, Integer> f1 = Integer::parseInt; // �޼��� ����
        System.out.println(f1.apply("100") + 200);

        // Supplier�� �Է�X, ��� O
        // Supplier<MyClass> s = () -> new MyClass();
        // Supplier<MyClass> s = MyClass::new; // �޼��� ����

        // Function<Integer, MyClass> f2 = (i) -> new MyClass(i);
        Function<Integer, MyClass> f2 = MyClass::new; // �޼��� ����

        MyClass mc = f2.apply(100);
        System.out.println(mc.iv);
        System.out.println(f2.apply(200).iv);

        // Function<Integer, int[]> f3 = (i) -> new int[i];
        Function<Integer, int[]> f3 = int[]::new; // �޼��� ����
        int[] arr = f3.apply(100);

        System.out.println("arr.length = " + arr.length);
    }
}

class MyClass {
    int iv;

    MyClass(int iv) {
        this.iv = iv;
    }
}