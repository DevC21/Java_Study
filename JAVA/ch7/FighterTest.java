package JAVA.ch7;

public class FighterTest {
	public static void main(String[] args) {
        Unit2 u = new Fighter();
		Fightable f = new Fighter();
        u.move(100, 200);
//      u.attack(new Fighter()); // Unit2���� attack()�� ��� ȣ�� �Ұ�
        u.stop();
        f.move(100, 200);
        f.attack(new Fighter());
//      f.stop(); // Fightable���� stop()�� ��� ȣ�� �Ұ�

		if (f instanceof Unit2)	{		
			System.out.println("f�� UnitŬ������ �ڼ��Դϴ�.");
		}
		if (f instanceof Fightable) {	
			System.out.println("f�� Fightable�������̽��� �����߽��ϴ�.");
		}
		if (f instanceof Movable) {		
			System.out.println("f�� Movable�������̽��� �����߽��ϴ�.");
		}
		if (f instanceof Attackable) {	
			System.out.println("f�� Attackable�������̽��� �����߽��ϴ�.");
		}
		if (f instanceof Object) {		
			System.out.println("f�� ObjectŬ������ �ڼ��Դϴ�.");
		}
	}
}

class Fighter extends Unit2 implements Fightable {
	public void move(int x, int y) { // public�� �پ����
        this.x = x;
        this.y = x;
        System.out.println("[" + x + ", " + y + "] �� �̵�");
    }
	public void attack(Unit2 u) { // public�� �پ����
        u.currentHP -= 10; 
        System.out.println(u + "���� ������ 10�� �־����ϴ�.");
        System.out.println("����� ���� ü�� : " + u.currentHP);
    }

    // �ο� �� �ִ� ��븦 �ҷ��´�.
    Fightable getFightable(){
        Fighter f = new Fighter();
        return f; // (Fightable) ����ȯ ������
    }
}

abstract class Unit2 {
	int currentHP;	// ������ ü��
	int x;			// ������ ��ġ(x��ǥ)
	int y;			// ������ ��ġ(y��ǥ)

    abstract void move(int x, int y);
    void stop() { System.out.println("����ϴ�."); }
}

interface Fightable extends Movable, Attackable { }
interface Movable {	
    void move(int x, int y); //	public abstract�� ������
}
interface Attackable {	
    void attack(Unit2 u);    //	public abstract�� ������
}