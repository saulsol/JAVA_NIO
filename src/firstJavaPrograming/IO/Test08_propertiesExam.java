package firstJavaPrograming.IO;
import java.io.*;
import java.util.Properties;

public class Test08_propertiesExam {
	// ���α׷��� ������ �� ���� �����ؾ� �ϴ� ���� ����. ������� ���̵�, ��й�ȣ�� ���� �����̴�. 
	// ���̵�� ��й�ȣ�� �̿��Ͽ� � ����� ó���� �� ���α׷� ������ ������ ���� ���� �����ϸ� ���߿� ���� ����� �� ���α׷��� �����ؾ� �ϴ� ���� �߻��Ѵ�.
	// ���� ����� ���ɼ��� �ִ� ������ �ܺ����Ͽ� ������ �ΰ� ���α׷����� �о�� ����Ѵ�. �׷��� ���α׷� ���� ���� �ܺ� ���ϸ� �����ؼ� �����ϰ� ����� �� �ִ�.
	// ��ó�� ���α׷����� ����� ���� ������ �������� ����� ������ "������Ƽ(properties) �����̶�� �Ѵ�."
	// properties ������ "key=value" �������� ����Ǹ� �ּ��� ������ ���� # ��ȣ�� ����Ѵ�. 
	
	public static void main(String[] args) {
		
			// �Է½�Ʈ�� ����
		try (Reader reader = new FileReader("C:\\Users\\82103\\eclipse-workspace\\�ڹ� NIO\\src\\firstJavaPrograming\\IO\\user.properties")){
			 
			// ������� ��ü ����� (������Ƽ ������ ������ ���� ��ü �����) 
			Properties user = new Properties();
			user.load(reader);
			// .load() �޼���� ���ڷ� ������ �Է½�Ʈ���� ������Ƽ ���Ϸκ��� key = value�� ����� �о�ɴϴ�.
			
			
			
			System.out.println(user.getProperty("id"));
			System.out.println(user.getProperty("name"));
			System.out.println(user.getProperty("password"));
			// .getProperties() �ش��ϴ� Key ���� value ���� ��ȯ�Ѵ�. 
			
			
		} catch (Exception e) {
			
		}
		
		
		
		
		
		
		
	}
	
	

}
