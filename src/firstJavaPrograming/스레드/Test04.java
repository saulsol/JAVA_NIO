package firstJavaPrograming.������;

public class Test04 {

	public static void main(String[] args) {
		
		Food f = new Food();
		Phone p = new Phone();
		
		
		f.setPriority(Thread.MAX_PRIORITY); // ���� �ԱⰡ ���� ����
		
		p.setPriority(Thread.MIN_PRIORITY);
		
		f.start();
		p.start();
		
		// �켱������ ���� ���� �� ���� �۾��ð��� �Ҵ����  ---> CPU���Լ�
		
		
	}

}

