package JAVA.ch2;

public class VarEx3_1 {
    
    public static void main(String[] args){
        // score�� final�� �ٿ��� ����� �ǹǷ� �� ���� �Ұ�
        final int score = 100;
        // score = 200;

        boolean power = true;

        byte b = 127; // -128 ~ 127;

        int oct = 010; // 8���� , 10������ 8
        int hex = 0x10; // 16����, 10������ 16

        long l = 10_000_000_000L;

        float f= 3.14f;
        double d = 3.14f; // float Ÿ�� ���ͷ��̾ double�� �� ���� �����̱⶧���� ���� ����
        
        System.out.println(score);
        System.out.println(power);
        System.out.println(b);
        System.out.println(oct);
        System.out.println(hex);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(10.);
        System.out.println(.1);
        System.out.println(10f);
        System.out.println(1e3);
    }
}
