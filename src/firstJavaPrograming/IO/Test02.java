package firstJavaPrograming.IO;
import java.io.*;
public class Test02 {

	public static void main(String[] args) {
		

		try( InputStream keyboard = System.in;
			PrintStream console = System.out;)  // try ����� ������ �ڵ� �ڿ� ����
		{
			int c = 0;
			while((c = keyboard.read()) != -1) {
				console.write(c);
			}
			
		} catch (IOException e) {
			System.out.println("��Ʈ�� ������ �߻��Ͽ����ϴ�");
		}
		
		// .read() �޼���� ctrl + z �� �ϸ� �ڵ����� �̴�. 

	}

}
