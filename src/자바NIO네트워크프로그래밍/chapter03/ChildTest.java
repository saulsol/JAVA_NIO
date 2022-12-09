package 자바NIO네트워크프로그래밍.chapter03;

public class ChildTest {
	
	public static void print(Parent2 p) {
		System.out.println(p.i);
		System.out.println(p.get());
	}
	
	

	public static void main(String[] args) {
		
		Parent2 p1 = new Child2();
		System.out.println(p1.i);
		System.out.println(p1.get());
		
		Parent2 p2 = new Child3(p1);
		System.out.println(p2.i);
		System.out.println(p2.get());
		
		ChildTest.print(p1);// 7,5 자동 타입 변환이 됐을경우 부모 필드만 접근이 가능하다. 
		ChildTest.print(p2);// 7, 15
		
		// 객체간의 관계가 상속관계일 경우 위와같이 자동 타입 변환이 일어날 수 있다. 
		// 자동 타입 변환의 경우 상위 클래스 타입의 변수와 메서드만 접근할 수 있는데, 메서드는 조금 특별하다
		// 만약 자식 클래스 타입에서 해당 메서드가 오버라이딩이 됐을경우, 자식 메서드를 호출한다. 
		// 이는 힙영역에 객체가 생성된 후에 어떤 메서드를 호출할지 갈리기 떄문에 런타임이 되어서 호출 메서드를 정확히 알 수 있다. 
		// 런타임시 확정되는 것을 자바에서는 "동적 바인딩" 이라고 한다.
		
		
		

	}

}

class Parent2{
	int i = 7;
	
	public int get() {
		return i;
	}
}


class Child2 extends Parent2{
	int i = 5;
	
	public int get() {
		return i;
	}
	
}

class Child3 extends Parent2{
	int i = 8;
	
	public Child3(Parent2 p) {		 
		i = p.i + i;  
	}
	
	public int get() {
		return i;
	}
	
	
}