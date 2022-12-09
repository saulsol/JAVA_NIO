package 자바NIO네트워크프로그래밍.chapter02.생성자소비자패턴;
import java.util.NoSuchElementException;

public interface SolQueue  {

	
	public void put(Object o);
	
	public Object pop() throws InterruptedException, NoSuchElementException;
	
	public void clear();
	
	
}
