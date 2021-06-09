package chapters15;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("C:\\windows\\system.ini");
			int input;
			while ((input = fin.read()) != -1) {
				System.out.print((char) input);
			}
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
