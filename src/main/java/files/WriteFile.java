package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteFile {

	public static void main(String[] args) throws Exception 
	{
		File f = new File("C:\\Users\\naani\\Desktop\\abc.txt");

		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("hi");
		bw.write("\n");
		bw.write("this is to file");
		bw.write("\n");
		bw.write("tiger");
		
		bw.close();
		fw.close();
		
		ReadFileUtils.read(f);
		
	}
		

}
