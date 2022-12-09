package 동기화연습.semaphore;
import java.util.concurrent.Semaphore;
import java.io.IOException;

class BankAccount{
	Semaphore sem ;
	int balance = 0; // 잔돈 
	
	public BankAccount() {
		this.sem = new Semaphore(1); // 임계영역으로 들어갈 수 있는 프로세스의 개수가 1개다
		// 이 개수가 0이면 아직 쓰고 있다는 말이다. 
		// 임계 구역을 쓰고있는 동안에도 문맥교환이 될 수 있다. -1 이 되는 순간 블록킹이 된다. 
	}
	

	public void deposit(int a) {
		try {
			sem.acquire(); // 세마포어 매개변수로 준 1을 -- 해서 0으로 만든다. 즉 이미 임계구역을 사용하고 있다 이런 뜻  
		} catch (InterruptedException e) {}
		////////////////////////////////////////////
		int temp = balance + a;
		balance = temp;
		///////////////////////////////////////////
		sem.release(); // 임계구역을 다 쓰고 나가는 것 즉 매개변수로 지정해둔 1값을 원상 복귀 
	} 

	public void withdraw(int a) {
		try {
			sem.acquire();
		} catch (InterruptedException e) {}
		////////////////////////////////////////////
		int temp = balance - a;
		balance = temp;
		///////////////////////////////////////////
		sem.release();
	} 

	
	
	
	
	public int getBalance() {
		
		return balance;
		
	} 

}

class Parent extends Thread {

	BankAccount b;
	public Parent (BankAccount b) {
		this.b = b;
	}
	
	public void run() {
		try {
			sleep(100);
		} catch (InterruptedException e) {}
		
		for(int i=0; i<100000; i++ ) {
			System.out.println("+");
			b.deposit(1000);
		}
		System.out.println();
	}
	
}



class Child extends Thread {
	
	BankAccount b;
	public Child (BankAccount b) {
		this.b = b;
	}
	
	public void run() {
			
		for(int i=0; i<100000; i++ ) {
			System.out.println("-");
			b.withdraw(1000);
		}
		System.out.println();
	}
	
}



public class Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BankAccount b = new BankAccount();
		Parent p = new Parent(b);
		Child c = new Child(b); 
		
		p.start();
		c.start();
		p.join();
		c.join();
	
		System.out.println(b.getBalance());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
