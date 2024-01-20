package JAVA.ch14;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_0_4 {
    public static void main(String[] args) {
        // IntStream intStream = new Random().ints(); // 무한 스트림
        // IntStream intStream = new Random().ints(10, 5, 10); // 유한 스트림
        // intStream
        // // .limit(10) // 10개만 자르기
        // .forEach(System.out::println);

        // iterate(T seed, UnaryOperator f) 단항 연산자
        Stream<Integer> intStream = Stream.iterate(1, n -> n + 2);
        intStream.limit(10).forEach(System.out::println);

        // generate(Supplier s) : 주기만 하는것 입력 X, 출력 O
        Stream<Integer> oneStream = Stream.generate(() -> 1);
        oneStream
        .limit(10)
        .forEach(System.out::println);
    }
}
