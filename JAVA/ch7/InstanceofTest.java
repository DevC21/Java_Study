package JAVA.ch7;

// 참조변수를 형변환하기 전에 형변환 가능여부를 확인할 때 사용

class InstanceofTest {
	public static void main(String args[]) {
		FireEngine2 fe = new FireEngine2();

		if(fe instanceof FireEngine2) {
			System.out.println("This is a FireEngine instance.");
		} 

		if(fe instanceof Car2) {
			System.out.println("This is a Car instance.");
		} 

		if(fe instanceof Object) {
			System.out.println("This is an Object instance.");
		} 

		System.out.println(fe.getClass().getName());
	}
} // class
class Car2 {}
class FireEngine2 extends Car2 {}