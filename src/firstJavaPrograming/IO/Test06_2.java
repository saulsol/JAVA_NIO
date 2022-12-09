package firstJavaPrograming.IO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test06_2 {

	public static void main(String[] args) {

		try {
			// ���� �б�
			Path input = Paths.get("a.txt"); // c ����̺���� ��θ� �����ϴ� ����� ���� ��θ� �����ϴ� ����̴�. 
											// �׸��� ����̺� �̸����� �������� �ʰ� �ٷ� a.txt ���ϸ��� ������ ���� ����� �Դϴ�.
											// ��Ŭ�������� ���ϸ� �Է��ϸ� ������Ʈ�� ���� ��ġ�� �ǹ��մϴ�
			
			byte [] bytes = Files.readAllBytes(input); // Files.readAllBytes() �޼���� ���ڷ� ������ Path�� ��� ������ ����Ʈ �迭�� �����Ѵ�.
														// bytes �迭���� a.txt ������ ������ ����˴ϴ�. 
			System.out.println("== readAllBytes ==");
			System.out.println(new String(bytes)); // ����Ʈ �迭�� String ���ڿ��� ��ȯ String �������� ���� 
			
			System.out.println("\n == readAllLines == ");
			List<String> lines = Files.readAllLines(input); // �޼��� ���ڷ� ������ Path�� ��� ������ ���ڿ��� �о���δ�.
															// �ٴ��� ���ٿ��� ó���Ͽ� List�� �����մϴ�.
			for(String line : lines ) {
				System.out.println(line);
			}
			
			System.out.println("-------------��¿Ϸ�-------------");
			
			// ���� ����
			Path out1 = Paths.get("C:\\Users\\82103\\eclipse-workspace\\�ڹ� NIO\\src\\firstJavaPrograming\\IO\\c.txt");
			Files.write(out1, bytes); // ���ڷ� ���� ���Ͽ��ٰ� ����Ʈ �迭�� ������ ���
			
			Path out2 = Paths.get("C:\\Users\\82103\\eclipse-workspace\\�ڹ� NIO\\src\\firstJavaPrograming\\IO\\d.txt");
			Files.write(out2, lines); // ���ڷ� ���� ���Ͽ� ���� ����Ʈ�� ������ ���
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		

	}

}
