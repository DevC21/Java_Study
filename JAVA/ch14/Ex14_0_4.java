package JAVA.ch14;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_0_4 {
    public static void main(String[] args) {
        // IntStream intStream = new Random().ints(); // ���� ��Ʈ��
        // IntStream intStream = new Random().ints(10, 5, 10); // ���� ��Ʈ��
        // intStream
        // // .limit(10) // 10���� �ڸ���
        // .forEach(System.out::println);

        // iterate(T seed, UnaryOperator f) ���� ������
        Stream<Integer> intStream = Stream.iterate(1, n -> n + 2);
        intStream.limit(10).forEach(System.out::println);

        // generate(Supplier s) : �ֱ⸸ �ϴ°� �Է� X, ��� O
        Stream<Integer> oneStream = Stream.generate(() -> 1);
        oneStream
        .limit(10)
        .forEach(System.out::println);
    }
}
