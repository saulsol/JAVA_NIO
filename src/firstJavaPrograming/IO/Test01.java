package firstJavaPrograming.IO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {

	public static void main(String[] args) {
		// ��Ʈ�� ��ü�� ������ ��δ� �װ� �о�帮�� �޼ҵ尡 �ʿ��ϴ�. 

		try(FileInputStream fi= new FileInputStream("C:\\Users\\82103\\eclipse-workspace\\�ڹ� NIO\\src\\firstJavaPrograming\\IO\\a.txt");
				FileOutputStream fo = new FileOutputStream("C:\\Users\\82103\\eclipse-workspace\\�ڹ� NIO\\src\\firstJavaPrograming\\IO\\b.txt", true); // �ּ� �ڿ� true ǥ�ø� ���ָ� ��� ��Ʈ���� ������ ���ҽ��� �̸� ����� ���� + ���� �޴� ������ ����ȴ�
				) { // try ����� ������ �ڵ����� �ڿ� ���� ���ش� ��Ʈ���� ����̱� ������ �� ������ �ݴ� ������ ���ִ� ���� ����. 
					// ��Ȯ�� �ּҸ� �˷��ִ� ���� ����
			int c = 0;

			while((c = fi.read()) != -1) { // -1 �� �ƴϸ� ��� ����  -1 ������ Ż��
				fo .write(c);
			}

		} catch (FileNotFoundException e) {
			System.out.println("�׷� ������ �������� �ʽ��ϴ�");
			e.printStackTrace();

		}catch (IOException e) {
			System.out.println("��Ʈ�� ������ ������ �߻��߽��ϴ�");

		}

		System.out.println("���� ���簡 �Ϸ�Ǿ����ϴ� ������Ʈ�� ���ΰ�ħ �� �� ������ Ȯ���� ������");


		// fi.read()�� fi �Է½�Ʈ���� ����� a.txt ���Ͽ��� 1����Ʈ�� �о� ������ ��ȯ�Ѵ�. 'A'�� �о��ٸ� 65�� �����Ѵ�. 
		// fi.read() �޼���� �ѹ��� �����ϸ� �� ���ڸ� �о�´�. ������ ��� ���ڸ� �о������ ������ ���� �� ��ŭ  fi.read () �޼ҵ带 �ݺ��ؾ� �Ѵ�. 
		// fi.read() �޼ҵ�� ���̻� ���� ���ڰ� ������� -1 �� �����Ѵ�. 
	}

}
