package firstJavaPrograming.IO;
import java.io.*;
import java.util.Properties;

public class Test09_propertiesExam {

	public static void main(String[] args) {
		//������Ƽ�� ���� �о�� ���� ������ �ݴ�� ���α׷����� key = value �������� ����Ǵ� ������Ƽ ������ ������ ���� �ִ�.
		
		try(Writer writer = new FileWriter("car.properties")){ // car.properties ���Ϸ� ��¹ޱ� ���� ��½�Ʈ���� �����Ѵ�. 
			
			Properties car = new Properties();
			car.setProperty("model", "X5");
			car.setProperty("engine", "2000");
			car.setProperty("fuel", "3.3");
			
			car.store(writer, "car information"); // Properties ��ü car�� ������ �ִ� ����� �����մϴ�. �����ϴ� �����ġ�� ù ��° ���ڰ� writer�̰�, 
													// �� ��° ���� "car information" �� ������Ƽ ������ �ּ����̴�. 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
