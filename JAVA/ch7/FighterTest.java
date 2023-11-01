package JAVA.ch7;

public class FighterTest {
	public static void main(String[] args) {
        Unit2 u = new Fighter();
		Fightable f = new Fighter();
        u.move(100, 200);
//      u.attack(new Fighter()); // Unit2에는 attack()이 없어서 호출 불가
        u.stop();
        f.move(100, 200);
        f.attack(new Fighter());
//      f.stop(); // Fightable에는 stop()이 없어서 호출 불가

		if (f instanceof Unit2)	{		
			System.out.println("f는 Unit클래스의 자손입니다.");
		}
		if (f instanceof Fightable) {	
			System.out.println("f는 Fightable인터페이스를 구현했습니다.");
		}
		if (f instanceof Movable) {		
			System.out.println("f는 Movable인터페이스를 구현했습니다.");
		}
		if (f instanceof Attackable) {	
			System.out.println("f는 Attackable인터페이스를 구현했습니다.");
		}
		if (f instanceof Object) {		
			System.out.println("f는 Object클래스의 자손입니다.");
		}
	}
}

class Fighter extends Unit2 implements Fightable {
	public void move(int x, int y) { // public이 붙어야함
        this.x = x;
        this.y = x;
        System.out.println("[" + x + ", " + y + "] 로 이동");
    }
	public void attack(Unit2 u) { // public이 붙어야함
        u.currentHP -= 10; 
        System.out.println(u + "에게 데미지 10을 주었습니다.");
        System.out.println("대상의 현재 체력 : " + u.currentHP);
    }

    // 싸울 수 있는 상대를 불러온다.
    Fightable getFightable(){
        Fighter f = new Fighter();
        return f; // (Fightable) 형변환 생략됨
    }
}

abstract class Unit2 {
	int currentHP;	// 유닛의 체력
	int x;			// 유닛의 위치(x좌표)
	int y;			// 유닛의 위치(y좌표)

    abstract void move(int x, int y);
    void stop() { System.out.println("멈춥니다."); }
}

interface Fightable extends Movable, Attackable { }
interface Movable {	
    void move(int x, int y); //	public abstract가 생략됨
}
interface Attackable {	
    void attack(Unit2 u);    //	public abstract가 생략됨
}