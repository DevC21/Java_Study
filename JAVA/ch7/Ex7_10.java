package JAVA.ch7;

class Ex7_10 {
	public static void main(String[] args) {
        Unit[] group = {new Marine(), new Tank(), new DropShip() };

        for (int i = 0; i < group.length; i++)
            group[i].move(100, 200);
	}
}

abstract class Unit {
	int x, y;			// ������ ��ġ(x, y)
    int hitpoint;
    int MAX_HP;
    abstract void move(int x, int y);
    void stop() { /* ���� ��ġ�� ���� */}
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine[x = " + x + ", y = " + y + "]");
    }
    void stimPack() { /* �������� ����Ѵ�. */}
}

class Tank extends Unit implements Repairable {
    void move(int x, int y) {
        System.out.println("Tank[x = " + x + ", y = " + y + "]");
    }
    void changeMode() { /* ���ݸ�带 ��ȯ�Ѵ�. */}
    public void Repair(Repairable r){
        if(r instanceof Unit){
            Unit u = (Unit)r;
            while(u.hitpoint != u.MAX_HP){
                u.hitpoint++;
            }
        }
    }
}

class DropShip extends Unit implements Repairable {
    void move(int x, int y) {
        System.out.println("DropShip[x = " + x + ", y = " + y + "]");
    }
    void load() { /* ���õ� ����� �¿��. */}
    void unload() { /* ���õ� ����� ������. */}
    public void Repair(Repairable r){
        if(r instanceof Unit){
            Unit u = (Unit)r;
            while(u.hitpoint != u.MAX_HP){
                u.hitpoint++;
            }
        }
    }
}

interface Repairable {
    void Repair(Repairable r);
}