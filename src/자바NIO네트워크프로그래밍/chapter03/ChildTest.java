package �ڹ�NIO��Ʈ��ũ���α׷���.chapter03;

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
		
		ChildTest.print(p1);// 7,5 �ڵ� Ÿ�� ��ȯ�� ������� �θ� �ʵ常 ������ �����ϴ�. 
		ChildTest.print(p2);// 7, 15
		
		// ��ü���� ���谡 ��Ӱ����� ��� ���Ͱ��� �ڵ� Ÿ�� ��ȯ�� �Ͼ �� �ִ�. 
		// �ڵ� Ÿ�� ��ȯ�� ��� ���� Ŭ���� Ÿ���� ������ �޼��常 ������ �� �ִµ�, �޼���� ���� Ư���ϴ�
		// ���� �ڽ� Ŭ���� Ÿ�Կ��� �ش� �޼��尡 �������̵��� �������, �ڽ� �޼��带 ȣ���Ѵ�. 
		// �̴� �������� ��ü�� ������ �Ŀ� � �޼��带 ȣ������ ������ ������ ��Ÿ���� �Ǿ ȣ�� �޼��带 ��Ȯ�� �� �� �ִ�. 
		// ��Ÿ�ӽ� Ȯ���Ǵ� ���� �ڹٿ����� "���� ���ε�" �̶�� �Ѵ�.
		
		
		

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