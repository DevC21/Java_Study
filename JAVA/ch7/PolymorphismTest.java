package JAVA.ch7;

class Tv {
    // Tv�� �Ӽ�(�������) 
    String color;          // ���� 
    boolean power;         // ��������(on/off) 
    int channel;           // ä�� 

    // Tv�� ���(�޼���) 
    void power()   { power = !power; }  // TV�� �Ѱų� ���� ����� �ϴ� �޼��� 
    void channelUp()   {  ++channel; }  // TV�� ä���� ���̴� ����� �ϴ� �޼��� 
    void channelDown() {  --channel; }  // TV�� ä���� ���ߴ� ����� �ϴ� �޼��� 
}

class SmartTv extends Tv {
    String text; // ĸ��(�ڸ�)�� ���� �ֱ� ���� ���ڿ�
    void caption() {
        System.out.println(text);
    };
}

public class PolymorphismTest {
    public static void main(String[] args){
        SmartTv s = new SmartTv(); // ���� ������ �ν��Ͻ��� Ÿ���� ��ġ
        // �� ��� Tv t ���� �����δ� SmartTv�� String text, void caption() ����� ����� �� ����.
        Tv t = new SmartTv(); // ���� Ÿ�� ���������� �ڼ� Ÿ�� �ν��Ͻ� ����
        

        Tv t2 = new SmartTv(); // OK. ���
        // �� ��� SmartTv s2�� Tv�� �������� �ʴ� String text, void caption() ����� ����Ϸ��� �� ��
        // �� �ּҸ� ����Ϸ��� �� �� �ֱ⶧���� ��� �����ʴ´�
        // SmartTv s2 = new Tv(); // ����. ��� �ȵ�
    }

}
