package ���ڵ�����;
import java.util.Scanner;
public class EncodingTest {

	public static void main(String[] args) throws Exception {
		// �ڹٿ����� ��� ���ڵ��� ����ɱ�?
		// ����Ʈ �����͸� �������� ���ڸ� ������ ��� �κп��� ����ȴ�. �� ����Ʈ�� ��ȯ�ϴ� ��� ��찡 ���ڵ��̶�� �� �� �ִ�.
		// String Ŭ�������� ����Ʈ �迭�� � ���ڵ� ������� �ؼ��Ͽ� ���ڸ� ������ ������ �����ϴ� �����ڰ� �ִ�. 
		// �ݴ�� String ��ü���� � ���ڵ� ����� �̿��� ����Ʈ �迭�� �������� �����ϴ� getBytes() �޼��嵵 �����Ѵ�.
		
		System.out.println("file.encoding="+System.getProperty("file.encoding"));
        System.out.println("�Ӽ�");
		
		String str = "���õ� �� �����ǿ� �Դ� ���α׷����̶� ���� �ʱ��� ~ ��";
		
		byte defaultBytes[] = str.getBytes(); // �⺻ ���ڵ�

		for(byte s : defaultBytes) {
			System.out.print(s);
		}
		
		String s = new String(defaultBytes); // ����Ʈ �迭�� String �������� ���ڷ� �޾� ����Ʈ �迭�� ���ڵ� �ϴ� �ڵ�
		System.out.println("\n"+s);
		
		
		byte eucBytes[] = str.getBytes("euc-kr"); // EUC-KR ���ڵ�
		byte ksc5601Bytes[] = str.getBytes("ksc5601"); // KSC5601 ���ڵ�
		byte ms949Bytes[] = str.getBytes("ms949"); // MS949 ���ڵ�
		byte unicodeBytes[] = str.getBytes("unicode"); // Unicode ���ڵ�
		byte utf8Bytes[] = str.getBytes("utf-8"); // UTF-8 ���ڵ�
		byte utf16Bytes[] = str.getBytes("utf-16"); // UTF-16 ���ڵ�
		
		System.out.println("EUC-KR ���ڵ� : " + new String(eucBytes,"euc-kr"));
		System.out.println("KSC5601 ���ڵ� : " + new String(ksc5601Bytes, "ksc5601"));
		System.out.println("MS949 ���ڵ� :" + new String(ms949Bytes, "ms949"));
		System.out.println("Unicode ���ڵ� : " + new String(unicodeBytes, "unicode"));
		System.out.println("UTF-8 ���ڵ� : " + new String(utf8Bytes, "utf-8"));
		System.out.println("UTF-16 ���ڵ� : " + new String(utf16Bytes, "utf-16"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
