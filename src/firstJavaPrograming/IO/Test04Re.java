package firstJavaPrograming.IO;
import java.io.*;
public class Test04Re {

	public static void main(String[] args) {
		// Test04 �� ���ݴ� ������ ������. 
		
		// 1. ���� ����Ʈ �����͸� ���� �� �ִ� ����Ʈ �迭�� �ʿ��ϴ�. 
		byte[] arr = null;
		
		// ������ ��ζ� ������ ��θ� ������ �Ѵ�.
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:\\Users\\82103\\eclipse-workspace\\�ڹ� NIO\\src\\firstJavaPrograming\\IO\\a.txt"));
				ByteArrayOutputStream out = new ByteArrayOutputStream();){
			// ��Ʈ�����κ��� �ٷ� ���� �� �ִ� �迭�� �ʿ��ϴ�
			byte[] buf = new byte[1024];
			int len = 0;
			
			while((len = in.read(buf)) != -1) {
				// ������ ��� �������� �� ��ŭ ����ؾ��Ѵ�. 
				out.write(buf, 0, len);
			}
			
			arr = out.toByteArray();
			String s = new String(arr);
			System.out.println(s);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// ����Ʈ �迭������ write, read ���� ���Ӽ��� ���ݾ� �ٸ��� �����ϸ鼭 �������
		
		
		try(BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("C:\\Users\\82103\\eclipse-workspace\\�ڹ� NIO\\src\\firstJavaPrograming\\IO\\c.txt"))) {
			bo.write(arr);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		

	}

}
