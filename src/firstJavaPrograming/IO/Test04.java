package firstJavaPrograming.IO;
import java.io.*;

public class Test04 {

	public static void main(String[] args) {
		// ���� ��Ʈ�� �׽�Ʈ
		
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:\\Users\\82103\\eclipse-workspace\\�ڹ� NIO\\src\\firstJavaPrograming\\IO\\a.txt"));
			ByteArrayOutputStream out = new ByteArrayOutputStream();){

			byte[] buf = new byte [1024];
			int len = 0;
			while ((len = in.read(buf)) != -1) { // in.read(buf)�� in �Է� ��Ʈ������ buf �迭 ũ�⸸ŭ �о�鿩 buf �迭�� �����Ѵ�.  
												// len �������� in.read �޼��忡�� �о���� ��ü ����Ʈ �� �� ����ȴ�.  �׷��ϱ� �迭�� ����� ����Ʈ �� ��ŭ �д´ٰ� 
				
				out.write(buf, 0, len); // ����Ʈ �迭�� ����� ByteArrayOutputStream �� wirte �޼ҵ带 �����Ͽ� �����͸� 0���� ���� len ���� ���� ����Ѵ�. (�ٵ� �׳� ��¸��ϴ� ��� �����Ҳ���)
			}
			
			byte [] arr = out.toByteArray(); // out.toByteArray() �޼���� out ����Ʈ �迭 ��Ʈ������ ��µ� �����͸� byte �迭�� ��ȯ�Ѵ�.  (���⿡ �����Ѵ�.)
			
			
			String s = new String(arr); //!
			
			System.out.println(s);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		// ! ���� ������ ������ �аų� ��Ʈ��ũ�� ���� ���� �����ʹ� ���� byte[] �迭�̹Ƿ� �̰��� ���ڿ��� ��ȯ�ϱ� ���� ����Ѵ�.
		// �ڼ��� ������ ������ String s = new Sting (byte[] b) �̷������� String �����ڸ� ����� ����Ʈ Ÿ�� �迭�� ������ 
		// �ڵ����� String Ÿ������ ��ȯ�ؼ� ���ڿ��� ������ش�. 
		

	}

}
