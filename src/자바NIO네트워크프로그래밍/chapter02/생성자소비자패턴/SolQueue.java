package �ڹ�NIO��Ʈ��ũ���α׷���.chapter02.�����ڼҺ�������;
import java.util.NoSuchElementException;

public interface SolQueue  {

	
	public void put(Object o);
	
	public Object pop() throws InterruptedException, NoSuchElementException;
	
	public void clear();
	
	
}
