package JAVA.ch14;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_0_2 {
    public static void main(String[] args) {
        // Function<String, Integer> f = (String s) -> Integer.parseInt(s);
        // Function<String, Integer> f = 클래스이름::메서드이름;
        Function<String, Integer> f1 = Integer::parseInt; // 메서드 참조
        System.out.println(f1.apply("100") + 200);

        // Supplier는 입력X, 출력 O
        // Supplier<MyClass> s = () -> new MyClass();
        // Supplier<MyClass> s = MyClass::new; // 메서드 참조

        // Function<Integer, MyClass> f2 = (i) -> new MyClass(i);
        Function<Integer, MyClass> f2 = MyClass::new; // 메서드 참조

        MyClass mc = f2.apply(100);
        System.out.println(mc.iv);
        System.out.println(f2.apply(200).iv);

        // Function<Integer, int[]> f3 = (i) -> new int[i];
        Function<Integer, int[]> f3 = int[]::new; // 메서드 참조
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