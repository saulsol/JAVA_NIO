package 자바NIO네트워크프로그래밍.chapter03;

public class InheritanceTest {

	public static void main(String[] args) {
		// 객체지향 프로그래밍의 목적은 객체를 재사용함으로써 생산성을 향상 시키는 것이 목적이다
		// 자바 IO를 이해하기 위해 자바의 상속과 오버라이딩에 대한 선수지식이 완벽해야한다 그래서 이번 파트는 자바 IO를 공부해 볼 생각이다. 
		
		FirstChild f = new FirstChild();
		System.out.println(f.read());
		
		
		SecondChild s = new SecondChild();
		System.out.println(s.read());
		
		
		ThirdChild t1 = new ThirdChild(f); // 객체 합성
		System.out.println(t1.read());
		
		ThirdChild t2 = new ThirdChild(s); // 객체 합성 // 인자로 어떤 객체를 받느냐에 따라 다양한 결과를 나타낼 수 있음
		System.out.println(t2.read());
		
		Parent p = new ThirdChild(t2);
		System.out.println(p.read());
		
		Parent p2 = new ThirdChild(p); 
		System.out.println(p2.read());
		

	}

}

class Parent{
	public String read() {
		return "parent 입니다";
	}
	
}

class FirstChild extends Parent {
	
	public String read() {
		return super.read() + ": firstChild";
	}
		
}

class SecondChild extends Parent {
	
	public String read() {
		return super.read() + ": SecondChild";
	}
	
}

class ThirdChild extends Parent {
	
	Parent p;
	
	public ThirdChild(Parent p) { // 상위 클래스의 타입으로 선정. 만약 자식객체 가 왔을경우 Parent p = new 자식객체(); 이런 자동타입 변환이 실행될 것이고
								// 만약 자식객체에서 오버라이딩을 했을 경우 오버라이딩한 메서드가 동적으로 실행된다. 
		this.p = p;
	}
	
	public String read() {
		return p.read() + ": ThirdChild";
	}
	
	
	
	
}









