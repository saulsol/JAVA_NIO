package firstJavaPrograming.IO;
import java.io.PrintWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Test06_1 {

	public static void main(String[] args) {

		try {

			// ���͸� ����
			Path dir = Paths.get("c:", "workHARD","srbDir" );	
			Files.createDirectories(dir);

			System.out.println("����Ϸ�1");

			// ���ϻ���
			Path file1 = Paths.get("c:\\workHARD\\file1.txt"); // �̹� �ִ� �����̸� ������� ����
			Files.createFile(file1);

			System.out.println("����Ϸ�2");

			// ������ Path�� ��ȯ
			File f1 = new File("c:\\workHARD\\file1.txt");
			Path p1 = f1.toPath();

			System.out.println("����Ϸ�3");


			// Path�� ���Ϸ� ��ȯ
			File f2 = file1.toFile();


			System.out.println("����Ϸ�4");

			Path file2 = dir.resolve("c:\\workHARD\\file2.txt");
			Path normalPath = file2.normalize();
			Path root = file2.getRoot(); // root ��� // �ֻ��� ��ġ 

			Path parent = file2.getParent(); // parent ��� // ���� ����
			System.out.println("Path normalize : " + normalPath);
			System.out.println("root ��� : " + root);
			System.out.println("parent ��� : " + parent);

			if(Files.exists(file1)) {
				System.out.println(file1 + "����");
			}

			try {
				PrintWriter out = new PrintWriter(f2);
				out.println("hi JUJU");
			} catch (Exception e) {
				System.out.println("���ܰ� �߻��Ͽ����ϴ�");
			}
			
			Path file3 = dir.resolve("file3.txt");
			Files.copy(file1, file3); // ���� ����





		} catch (Exception e) {
			System.out.println("���ܰ� �߻��Ͽ�������");
		}






	}

}
