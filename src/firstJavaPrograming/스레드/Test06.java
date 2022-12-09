package firstJavaPrograming.스레드;
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


class Pool{ // 스레드에 의해서 사용되어지는 객체
	
	List<String> produts = new ArrayList<>();
	
	public synchronized void get() throws InterruptedException { // 하나의 스레드가 get() 메서드를 사용하고 있을때 다른 스레드가 동시에 실행될 수 없다
		if(produts.size() == 0) {
			wait();
		}
		produts.remove(0);
		System.out.println("소비 / 재고 = " + produts.size());
	}
	
	
	public synchronized void add (String value) { // 마찬가지로 동기화 처리를 했기 때문에 add 메서드를 실행하는 동안 다른 메서드를 사용할 수 없다. 
		produts.add(value);
		System.out.println("생산 / 재고 = " + produts.size());
		notifyAll();
	}

}

class ProductGet implements Runnable { // 소비하는 스레드

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


class ProductAdd implements Runnable{ // 생산하는 스레드
	
	Pool pool;
	
	ProductAdd(Pool pool){
		this.pool = pool; 
	}

	@Override
	public void run() {
		for(int i=0; i<=10; i++) 
			pool.add("상품 " + i);
	}
	
}








