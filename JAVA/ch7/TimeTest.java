package JAVA.ch7;

class Time {
    private int hour; // 0 ~ 23사이의 값을 가져야함.
    private int minute;
    private int second;

    public int getHour() {
        return this.hour; 
    }
    
    public void setHour(int hour) {
        if(isNotVaildHour(hour)) return;
        this.hour = hour;
    }

    // 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
    // 내부에서만 쓰는 메서드 이므로 private로 외부에서 접근 못하게 막는다.
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
