package �ڹ�NIO��Ʈ��ũ���α׷���.chapter03;
import java.io.*;
public class BufferedReaderTest {

	public static void main(String[] args) {
		// ������ ���� ���α׷��� ����� �����̴�. 
		
		InputStream is = System.in; // Ű���� ��ü ����
		InputStreamReader isr = new InputStreamReader(is); // char Ÿ������ ��ȯ �����ش� 
		 // ���ٷ� ���ϰ� �д� Ŭ���� Ȯ���غ��� 
		BufferedReader bfr = new BufferedReader(isr); // ���ٷ� ���� �� �ִ� ������ �޼��� ���� readLine() �޼ҵ� ����
		String s = "�Է��ϼ���";
		 try {
			 System.out.println(s);
			 while(s != null) {
				  s = bfr.readLine();
				 System.out.println(s);
			 }
			System.out.println("�����մϴ�"); 
		} catch (IOException e) {
			
		}
		
		
		
		
		
		

	}

}
