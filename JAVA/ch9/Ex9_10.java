package JAVA.ch9;

public class Ex9_10 {
    public static void main(String[] args){
        int iVal = 100;
        String strVal = String.valueOf(iVal); // int�� String���� ��ȯ�Ѵ�.

        double dVal = 200.0;
        String strVal2 = dVal + ""; // ���ڸ� String���� ��ȯ�ϴ� �� �ٸ� ���

        double sum = Integer.parseInt("+" + strVal) + Double.valueOf(strVal2);
        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

        // ���� ���ڿ��� �̷��� ������� �����ϸ� ������ �������⶧����
        System.out.println(strVal + " + " + strVal2 + " = " + sum2); 
        // String.join() �޼��带 ���� �����ϴ� ���� �ٶ����ϴ�.
        System.out.println(String.join("", strVal, " + ", strVal2, " = ") + sum);

    }
}
