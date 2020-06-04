package javaapplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class OutputFile {
	private static void readAndProduceBytes() throws IOException {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		byte[] b = new byte[1024];
		int len = -1;
		try {
			fis = new FileInputStream("D://rudin.pdf");
			fos = new FileOutputStream("D://test.pdf");
			while((len=fis.read(b)) != -1) {
				fos.write(b,0,len);
			}
			
	
		} catch (Exception ex) {
			// if an error occurs
			ex.printStackTrace();
		} finally {

			// closes and releases system resources from stream
			if (fos != null) {
				fos.flush();
				fos.close();
			}
				
			if (fis != null)
				fis.close();
		}

	
	}
	
	private static void readAndProduceChar() throws IOException {
		BufferedReader read = null;
		BufferedWriter fos = null;
		
		String line = null;
		try {
			
			read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("D://LPAD+OUTER_JOIN.sql")), "UTF-8"));
			fos = new BufferedWriter(new FileWriter("D://test.txt"));
			while((line=read.readLine()) != null) {
				fos.write(line);
				fos.newLine();
			}

		} catch (Exception ex) {
			// if an error occurs
			ex.printStackTrace();
		} finally {

			// closes and releases system resources from stream
			if (fos != null) {
				fos.flush();
				fos.close();
			}
				
			if (read != null)
				read.close();
		}


	
	}
	public static void main(String[] args) throws IOException {
		readAndProduceBytes();
		readAndProduceChar();
	}

}
