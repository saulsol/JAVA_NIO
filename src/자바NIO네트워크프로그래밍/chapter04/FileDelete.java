package �ڹ�NIO��Ʈ��ũ���α׷���.chapter04;
import java.io.*;


public class FileDelete {

	public static void main(String[] args) {
		// �����Ǵ� ���� ����� 
		
		File f = new File("C:\\Users\\82103\\eclipse-workspace\\�ڹ� NIO\\bin\\�ڹ�NIO��Ʈ��ũ���α׷���\\chapter04\\FileInfo.class");
		
		if(f.exists()) {
			boolean deleteFlag = f.delete();
			if(deleteFlag) 
				System.out.println("���� ������ �����Ͽ����ϴ�");
			else 
				System.out.println("���� ������ �����߽��ϴ�");	
		}else {
			System.out.println("������ �������� �ʽ��ϴ�");
		}
		
		// ������ ���� ���� ������ ������ ���� �� �� �ִ�. 
		
		// delete() �޼ҵ�� ������ ���������� �������� ��� true ���� ��ȯ�Ѵ�. 
		

	}

}
