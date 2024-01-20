package JAVA.ch14;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_0_3 {
    public static void main(String[] args) {
        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // Stream<Integer> intStream = list.stream(); // list�� Stream���� ��ȯ
        // intStream.forEach(System.out::print); // forEach() ��������

        // // stream�� 1ȸ��. stream�� ���� ���������� �����ϸ� stream�� ������.
        // intStream = list.stream(); // list�κ��� Stream�� ����
        // intStream.forEach(System.out::print);

        String[] strArr = new String[] {"a", "b", "c", "d"};

        Stream<String> strStream = Stream.of(strArr);
        strStream.forEach(System.out::println);

        strStream = Arrays.stream(strArr);
        strStream.forEach(System.out::println);

        strStream = Stream.of(new String[]{"a", "b", "c", "d"});
        strStream.forEach(System.out::println);

        int[] intArr = {1, 2, 3, 4, 5};
        IntStream intStream =  Arrays.stream(intArr);
        // intStream.forEach(System.out::println);
        // System.out.println("count = " + intStream.count());
        // System.out.println("sum = " + intStream.sum());
        System.out.println("average = " + intStream.average());

        // Integer[] intArr = {1, 2, 3, 4, 5};
        // Stream<Integer> intStream =  Arrays.stream(intArr);
        // // intStream.forEach(System.out::println);
        // System.out.println("count = " + intStream.count());

        
    }
}
