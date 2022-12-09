package �ڹ�NIO��Ʈ��ũ���α׷���.chapter03;

public class InheritanceTest {

	public static void main(String[] args) {
		// ��ü���� ���α׷����� ������ ��ü�� ���������ν� ���꼺�� ��� ��Ű�� ���� �����̴�
		// �ڹ� IO�� �����ϱ� ���� �ڹ��� ��Ӱ� �������̵��� ���� ���������� �Ϻ��ؾ��Ѵ� �׷��� �̹� ��Ʈ�� �ڹ� IO�� ������ �� �����̴�. 
		
		FirstChild f = new FirstChild();
		System.out.println(f.read());
		
		
		SecondChild s = new SecondChild();
		System.out.println(s.read());
		
		
		ThirdChild t1 = new ThirdChild(f); // ��ü �ռ�
		System.out.println(t1.read());
		
		ThirdChild t2 = new ThirdChild(s); // ��ü �ռ� // ���ڷ� � ��ü�� �޴��Ŀ� ���� �پ��� ����� ��Ÿ�� �� ����
		System.out.println(t2.read());
		
		Parent p = new ThirdChild(t2);
		System.out.println(p.read());
		
		Parent p2 = new ThirdChild(p); 
		System.out.println(p2.read());
		

	}

}

class Parent{
	public String read() {
		return "parent �Դϴ�";
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
	
	public ThirdChild(Parent p) { // ���� Ŭ������ Ÿ������ ����. ���� �ڽİ�ü �� ������� Parent p = new �ڽİ�ü(); �̷� �ڵ�Ÿ�� ��ȯ�� ����� ���̰�
								// ���� �ڽİ�ü���� �������̵��� ���� ��� �������̵��� �޼��尡 �������� ����ȴ�. 
		this.p = p;
	}
	
	public String read() {
		return p.read() + ": ThirdChild";
	}
	
	
	
	
}









