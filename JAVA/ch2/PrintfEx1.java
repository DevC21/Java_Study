package JAVA.ch2;
public class PrintfEx1 {
    
    public static void main(String[] args){
        // System.out.println(10.0 / 3);

        // System.out.printf("%d\n", 15);  // 15
        // System.out.printf("%#o\n", 15); // 017
        // System.out.printf("%#x\n", 15); // 0xf
        // System.out.printf("%s\n", Integer.toBinaryString(15)); // 1111 (���ڿ�)

        // double f = 123.456789;
        // System.out.printf("%f\n", f); // 123.456789  
        // System.out.printf("%e\n", f); // 1.234568e+02
        // System.out.printf("%g\n", f); // 123.457     

        // System.out.printf("[%5d]\n", 10); // [   10]
        // System.out.printf("[%-5d]\n", 10);// [10   ]
        // System.out.printf("[%05d]\n", 10);// [00010]

        double d = 1.23456789;
        // %��ü�ڸ�.�Ҽ����Ʒ��ڸ�
        //[  1.2345678900] ������ ��������, �Ҽ����� 0���� ä����
        System.out.printf("d=%14.10f\n", d); 

        String url = "www.google.com";
        System.out.printf("[%s]\n", url);
        System.out.printf("[%20s]\n", url); // 20�ڸ� ������ Ȯ���ϰ� ������ ����
        System.out.printf("[%-20s]\n", url);// 20�ڸ� ������ Ȯ���ϰ� ���� ����
        System.out.printf("[%.10s]\n", url);// ���ʺ��� 10�ڸ��� �߶� ���
    }
}
