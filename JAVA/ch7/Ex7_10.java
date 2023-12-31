package JAVA.ch7;

class Ex7_10 {
	public static void main(String[] args) {
        Unit[] group = {new Marine(), new Tank(), new DropShip() };

        for (int i = 0; i < group.length; i++)
            group[i].move(100, 200);
	}
}

abstract class Unit {
	int x, y;			// 유닛의 위치(x, y)
    int hitpoint;
    int MAX_HP;
    abstract void move(int x, int y);
    void stop() { /* 현재 위치에 정지 */}
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine[x = " + x + ", y = " + y + "]");
    }
    void stimPack() { /* 스팀팩을 사용한다. */}
}

class Tank extends Unit implements Repairable {
    void move(int x, int y) {
        System.out.println("Tank[x = " + x + ", y = " + y + "]");
    }
    void changeMode() { /* 공격모드를 변환한다. */}
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
    void load() { /* 선택된 대상을 태운다. */}
    void unload() { /* 선택된 대상을 내린다. */}
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