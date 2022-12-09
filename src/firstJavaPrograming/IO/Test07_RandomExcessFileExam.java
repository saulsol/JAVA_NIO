package firstJavaPrograming.IO;
import java.io.File;
import java.io.RandomAccessFile;

public class Test07_RandomExcessFileExam {

	public static void main(String[] args) {
		// ������ ������ �аų� ���� �۾��� �� ���� ������ ó������ ������� �б�, ���� �۾��� �ؾ��Ѵ�. 
		// ���� ������ �Ϻκи� �����ϰų� �о�� ���� ���ʿ��� �κ��� �ǳʶٴ� �۾��� �ؾ� �ϱ� ������ ��ȿ�����Դϴ�. 
		// �̷� �������� �ذ��ϴ� ��ü�� java.io.RandomAccessFile �Դϴ�.

		File f = new File("a.txt");

		try (RandomAccessFile raf = new RandomAccessFile(f, "rw")){ //"rw" ---> read write 
			// a.txt ���Ͽ� ���� �� �������� ������ �ϱ����� rw(�б�, ����) ���� RandomAcessFile raf�� �����Ѵ�. 
			raf.seek(1); //���� �������� ��ġ�� 1����Ʈ �̵��Ѵ�. ����ġ e
			byte b = raf.readByte(); // ���� ���� �����Ͱ� ��ġ�� ������ 1����Ʈ�� �о� ���� b�� �����Ѵ�. // �о���̸鼭 ���� ���ڷ� �Ѿ��.  
			System.out.println((char)b);

			byte[] arr = new byte[4]; // �Ʊ� e���� �о��� ������ ���� ��ġ�� n
			raf.read(arr); // �迭�� �� ��ŭ �а� �迭�� ���� 
			System.out.println(new String(arr));

			raf.seek(2); // seek() �޼��带 �̿��ҋ� �׳� ���ڸ� �Է��ϸ� ���� ���� �����ʹ� ���� ù��° ���� �̵��Ѵ�. ����ġ n	
			raf.write("good".getBytes()); // ���� �������� ��ġ�� "good" ���ڿ��� ����Ʈ �迭�� ��ȯ�Ͽ� (getBytes()) ����մϴ� 
			
			// getBytes ---> "good" ���ͷ��� ����Ʈ �迭�� ��ȯ�����ش� 
			// write( ) �޼���� ����Ʈ �迭�� �޾Ƽ� ����Ѵ�. ���� ���ͷ��� �ٷ� ����� �� getBytes() �޼��带 ����ϴ� ���̴�. 
 
		} catch (Exception e) {

		}

	}

}
