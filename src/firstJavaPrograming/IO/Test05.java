package firstJavaPrograming.IO;
import java.io.File;
import java.io.PrintWriter;

public class Test05 {

	public static void main(String[] args) {
		// File Ŭ���� �̿� ���
		
		try {
			
			File dir = new File("c:\\workSol");
			dir.mkdir(); // ���丮 ����
			
			File file = new File(dir, "sol.txt");// �ش� ���丮�� �ش� ���� �����
			file.createNewFile();
			
			// ���� �Ǵ� ���丮 ���� �Ǵ�
			if(dir.isDirectory())
				System.out.println(dir.getName()+"�� ���͸��Դϴ�"); // �ش� ���丮�� ������� true ����
			if(file.isFile())
				System.out.println(file.getName()+"�� �����Դϴ�"); // �ش� ��ü�� ������ ��� true ����
			
			// ���Ͽ� ������ ��� �� �б� 
			if(file.exists()) {
				try (PrintWriter out = new PrintWriter(file)){ // �Ű� ������ �޴� ���� write �ض� 
					out.println("Hello java!");	 //System.out.println() ---> �ֿܼ��ٰ� ��� System.out �� �ܼ����� ����ϴ� ��½�Ʈ�� �̱� �����̴�. 
				}
				System.out.println("���� �̸� : " + file.getName());
				System.out.println("���� ��� : " + file.getPath());
				System.out.println("���� ���� : " + file.canWrite());
				System.out.println("�б� ���� : " + file.canRead());
				System.out.println("���� ���� : " + file.length()+ "byte");
			}else {
				System.out.println("������ �������� ����");
			}
			
			File subDir = new File("c:\\workSol\\subdir");
			subDir.mkdir();
			
			File file2 = new File(subDir, "juju.txt");
			file2.createNewFile();
			
			// ���� ���� ���
			String file2Path = file2.getAbsolutePath();
			System.out.println("������ : " + file2Path );
			
			// �θ� ���丮
			String parentDir = file2.getParent();
			System.out.println("�θ� ��� : " + parentDir);
			
			// ���丮 ��� ���ϱ�
			File parentFile = file2.getParentFile(); // ���� ������ ���� ��θ� ���� File ��ü�� �����Ѵ�. 
			String [] fileNames = parentFile.list();  // File ��ü�� ������ �ִ� ����� String �迭�� ��ȯ�Ѵ�. 
														// ���丮��� ���丮�� ����� ���ϵ��� �Ǵ� ���� ���丮�� �̸��� �����մϴ�. �پ��ϰ� ���̴ϱ� ���߿� ���ӻ��� �˾ƺ���
			System.out.print( parentDir + "��� ===>");
			
			for(String name : fileNames ) {
				System.out.println(name);
			}
			
			
			
		} catch (Exception e) {
			System.out.println("���丮 �Ǵ� ������ �������� �ʾҽ��ϴ�.");
		}
		
		
		
		
	}

}
