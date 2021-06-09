package chapters15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class StreamEx {
	/**
	 * ��Ʈ��(Stream) �������� �帧 
	 * in -> out 
	 * out -> in 
	 * in ex)Ű����, �̹���, ����, ���� 
	 * out ex) ȭ��,��ƼĿ 
	 * ������ �� ������ ������ ���� ���� 
	 * ��Ʈ���� ������ : 
	 * 1. ���̳ʸ� ������ 
	 * 2. ���� ������ read(); �������� ����(����Ʈ��)
	 * 
	 * - ��Ÿ�޸� 
	 * .in ó�� ����� ����ƽ
	 * 
	 */

	public static void main(String[] args) throws IOException {
		InputStream i; // ����ó�� ,byte ����
		OutputStream o; // ����ó��
		Reader r; // ����ó�� ,char ����
		Writer w; // ����ó��

		InputStreamReader rd = new InputStreamReader(System.in);
		while (true) {
			int input = rd.read();
			if (input != 13 && input != 10) {
				System.out.println((char)input);
			}
		}
	}

}
