package 동기화연습.semaphore;
import java.util.concurrent.Semaphore;
import java.io.IOException;

// 세마포어에 허용하는 스레드의 개수를 매개변수로 줄 때, 
// 0개를 준다면 어떻게 될까? acquire()이 상단에 있는 메서드는 블록킹이 될것이다 왜냐하면 -- 하면 -1이 될태니깐 
// 그럼 상단에 acquire() 메소드가 없으면 실행되지 않을까? 
// 즉 처음엔 0개 이니깐 실행이 될 것이고 그 마지막에 release()를 하면 ++ 니깐 허용가능한 프로세스 개수가 1개가 될것이다. 
// 따라서 세마포어로 스레드의 순서를 정할 수 있다.
// 하나의 짝 세마포어는 동기화로 쓰고 또 하나의 세마포어는 순서를 위해 사용한다. 



class BankAccount1{
	Semaphore sem ;
	Semaphore dsem;
	Semaphore wsem;
	int balance = 0; // 잔돈 

	public BankAccount1() {
		this.sem = new Semaphore(1);  // 동기화 세마포어
		this.dsem = new Semaphore(0);
		this.wsem = new Semaphore(0);
	}


	public void deposit(int a) {
		try {
			
			sem.acquire(); 
		} catch (InterruptedException e) {}
		////////////////////////////////////////////
		System.out.println("+");
		int temp = balance + a;
		balance = temp;
		///////////////////////////////////////////
		sem.release(); 
		wsem.release();
		try {
			dsem.acquire();
		} catch (InterruptedException e) {}
		
	} 

	public void withdraw(int a) {
		try {		
			wsem.acquire();
			sem.acquire();
		} catch (InterruptedException e) {}
		///////////////////////////////////////////
		System.out.println("-");
		int temp = balance - a;
		balance = temp;
		///////////////////////////////////////////
		sem.release();
		dsem.release();
	} 

	public int getBalance() {

		return balance;

	} 
	

}


class Parent1 extends Thread {

	BankAccount1 b;
	public Parent1 (BankAccount1 b) {
		this.b = b;
	}
	
	public void run() {
		
		for(int i=0; i<1000; i++ ) {
			
			b.deposit(1000);
		}
		System.out.println();
	}
	
}



class Child1 extends Thread {
	
	BankAccount1 b;
	public Child1 (BankAccount1 b) {
		this.b = b;
	}
	
	public void run() {
			
		for(int i=0; i<1000; i++ ) {
			
			b.withdraw(1000);
		}
		System.out.println();
	}
	
}
public class Test2_세마포어_순서 {

	public static void main(String[] args) throws InterruptedException {
		
		BankAccount1 b = new BankAccount1();
		Parent1 p = new Parent1(b);
		Child1 c = new Child1(b); 
		
		p.start();
		c.start();
		p.join();
		c.join();
	
		System.out.println(b.getBalance());
		
	}
	

}
