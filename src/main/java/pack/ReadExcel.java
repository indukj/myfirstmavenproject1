package pack;

import java.io.IOException;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		Excel e = new Excel();
		String a = e.readData(0, 0);
		System.out.println(a);
		String b = e.readData(0, 1);
		System.out.println(b);


	}

}


