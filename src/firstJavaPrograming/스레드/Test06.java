package firstJavaPrograming.������;
import java.util.*;

public class Test06 {

	public static void main(String[] args) {
		
		Pool pool = new Pool();
		Thread productGet = new Thread(new ProductGet(pool));
		Thread productAdd = new Thread(new ProductAdd(pool));
		
		productGet.start();
		productAdd.start();
	}

}


class Pool{ // �����忡 ���ؼ� ���Ǿ����� ��ü
	
	List<String> produts = new ArrayList<>();
	
	public synchronized void get() throws InterruptedException { // �ϳ��� �����尡 get() �޼��带 ����ϰ� ������ �ٸ� �����尡 ���ÿ� ����� �� ����
		if(produts.size() == 0) {
			wait();
		}
		produts.remove(0);
		System.out.println("�Һ� / ��� = " + produts.size());
	}
	
	
	public synchronized void add (String value) { // ���������� ����ȭ ó���� �߱� ������ add �޼��带 �����ϴ� ���� �ٸ� �޼��带 ����� �� ����. 
		produts.add(value);
		System.out.println("���� / ��� = " + produts.size());
		notifyAll();
	}

}

class ProductGet implements Runnable { // �Һ��ϴ� ������

	Pool pool;
	
	public ProductGet(Pool pool) {
		this.pool = pool;
	}
	
	@Override
	public void run() {
		try {
			for(int i=0; i<=10; i++) {
				pool.get();
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
} 


class ProductAdd implements Runnable{ // �����ϴ� ������
	
	Pool pool;
	
	ProductAdd(Pool pool){
		this.pool = pool; 
	}

	@Override
	public void run() {
		for(int i=0; i<=10; i++) 
			pool.add("��ǰ " + i);
	}
	
}








