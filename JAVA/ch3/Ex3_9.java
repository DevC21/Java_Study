package JAVA.ch3;

public class Ex3_9 {
    public static void main(String[] args){
        int a = 1_000_000; // 10�� 6����
        int b = 2_000_000; // 10�� 6���� * 2

        // 10�� 12���� int�� ������ 10�� 9����
        long c = (long)a * b; // a * b = 2,000,000,000,000

        System.out.println(c);
    }
}
