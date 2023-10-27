package JAVA.ch7;

class Tv {
    // Tv의 속성(멤버변수) 
    String color;          // 색상 
    boolean power;         // 전원상태(on/off) 
    int channel;           // 채널 

    // Tv의 기능(메서드) 
    void power()   { power = !power; }  // TV를 켜거나 끄는 기능을 하는 메서드 
    void channelUp()   {  ++channel; }  // TV의 채널을 높이는 기능을 하는 메서드 
    void channelDown() {  --channel; }  // TV의 채널을 낮추는 기능을 하는 메서드 
}

class SmartTv extends Tv {
    String text; // 캡션(자막)을 보여 주기 위한 문자열
    void caption() {
        System.out.println(text);
    };
}

public class PolymorphismTest {
    public static void main(String[] args){
        SmartTv s = new SmartTv(); // 참조 변수와 인스턴스의 타입이 일치
        // 이 경우 Tv t 참조 변수로는 SmartTv의 String text, void caption() 멤버를 사용할 수 없다.
        Tv t = new SmartTv(); // 조상 타입 참조변수로 자손 타입 인스턴스 참조
        

        Tv t2 = new SmartTv(); // OK. 허용
        // 이 경우 SmartTv s2가 Tv에 존재하지 않는 String text, void caption() 멤버를 사용하려고 할 때
        // 빈 주소를 사용하려고 할 수 있기때문에 허용 되지않는다
        // SmartTv s2 = new Tv(); // 에러. 허용 안됨
    }

}
