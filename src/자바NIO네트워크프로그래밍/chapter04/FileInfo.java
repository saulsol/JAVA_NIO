package �ڹ�NIO��Ʈ��ũ���α׷���.chapter04;
import java.io.File;
import java.io.IOException;


public class FileInfo {

	public static void main(String[] args) {
		
		
		
		File f = new File("C:\\Users\\82103\\eclipse-workspace\\�ڹ� NIO\\bin\\�ڹ�NIO��Ʈ��ũ���α׷���\\chapter04\\FileInfo.class"); // ���α׷� �˱Ը�Ʈ 
		if(f.exists()) {
			System.out.println("length : " + f.length()); // ������ ũ�� ����
			System.out.println("canRead : "+ f.canRead()); // ������ ���� �� �ִ��� ���� �ľ�
			System.out.println("canWrite : " + f.canWrite()); // �� ���Ͽ� � ���� �� �� ������ , ������ �ɷ��� �ִ� �����̸� ���ų� ���� ���Ѵ�.
			System.out.println("getApsolutePath : " + f.getAbsolutePath()); // �� ������ �����θ� ����
			
			try {
				System.out.println("getCononicalPath :" + f.getCanonicalPath());
				
			} catch (IOException e) {
				System.out.println(e);
			}
			
			System.out.println("getName : " + f.getName());
			System.out.println("getParent : " + f.getParent());
			System.out.println("getPath : " + f.getPath()); // ������ ��θ� ���ڿ��� ��ȯ�Ѵ�
			
		}else {
			System.out.println("������ �������� �ʽ��ϴ�");
		}
		
		
		
		
		
		

	}

}
