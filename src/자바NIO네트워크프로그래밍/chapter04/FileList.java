package �ڹ�NIO��Ʈ��ũ���α׷���.chapter04;
import java.io.*;
public class FileList {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\82103\\eclipse-workspace\\�ڹ� NIO\\bin\\�ڹ�NIO��Ʈ��ũ���α׷���"); // ����� ���ϸ��� �ƴ϶� ���丮�� �־���. 
		
		if(!f.exists()) {
			System.out.println("������ �������� �ʽ��ϴ�");
			System.exit(0);
		}else if(f.exists()){
			
			File [] list = f.listFiles(); // listFiles() �޼ҵ�� ���丮 �ȿ� �ִ� ���� ����� File�� �迭 ���·� ��ȯ�Ѵ�. 
											// File �迭�� �޾Ƶ��� �� for���� �̿��� 
			
			for(int i=0; i<list.length; i++) {
				System.out.print(list[i].getName());
				System.out.print("\t");
				
				if(list[i].isDirectory()) //isDirectory() �޼���� ���͸����� �������� �����Ǵ��� �ؼ� 
					System.out.print("���丮\n"); // true dir �� ���
				else {
					System.out.print("����"); // false ������ ���
					System.out.print("\t");
					System.out.print(list[i].length()+"\n");
				}
					
			}
		}else {
			System.out.println("���͸��� �ƴմϴ�");
		}
	

	}

}
