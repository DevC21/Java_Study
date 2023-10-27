package JAVA.ch7;

class Time {
    private int hour; // 0 ~ 23������ ���� ��������.
    private int minute;
    private int second;

    public int getHour() {
        return this.hour; 
    }
    
    public void setHour(int hour) {
        if(isNotVaildHour(hour)) return;
        this.hour = hour;
    }

    // �Ű������� �Ѱ��� hour�� ��ȿ���� Ȯ���ؼ� �˷��ִ� �޼���
    // ���ο����� ���� �޼��� �̹Ƿ� private�� �ܺο��� ���� ���ϰ� ���´�.
    private boolean isNotVaildHour(int hour) {
        return hour < 0 || hour > 23;
    }
}

public class TimeTest {
    public static void main(String[] args){
        Time t = new Time();
        t.setHour(100);
        System.out.println(t.getHour());
        t.setHour(21);
        System.out.println(t.getHour());
    }
}
