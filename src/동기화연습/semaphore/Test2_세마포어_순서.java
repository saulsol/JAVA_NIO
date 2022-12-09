package ����ȭ����.semaphore;
import java.util.concurrent.Semaphore;
import java.io.IOException;

// ������� ����ϴ� �������� ������ �Ű������� �� ��, 
// 0���� �شٸ� ��� �ɱ�? acquire()�� ��ܿ� �ִ� �޼���� ���ŷ�� �ɰ��̴� �ֳ��ϸ� -- �ϸ� -1�� ���´ϱ� 
// �׷� ��ܿ� acquire() �޼ҵ尡 ������ ������� ������? 
// �� ó���� 0�� �̴ϱ� ������ �� ���̰� �� �������� release()�� �ϸ� ++ �ϱ� ��밡���� ���μ��� ������ 1���� �ɰ��̴�. 
// ���� ��������� �������� ������ ���� �� �ִ�.
// �ϳ��� ¦ ��������� ����ȭ�� ���� �� �ϳ��� ��������� ������ ���� ����Ѵ�. 



class BankAccount1{
	Semaphore sem ;
	Semaphore dsem;
	Semaphore wsem;
	int balance = 0; // �ܵ� 

	public BankAccount1() {
		this.sem = new Semaphore(1);  // ����ȭ ��������
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
public class Test2_��������_���� {

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
