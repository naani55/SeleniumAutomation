package javaFaqs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingInFile 
{

	public static void main(String[] args) throws IOException 
	{
		File f = new File(".\\cache\\filewriter123.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("selenium with java");
		bw.newLine();
		bw.write("selenium with python");
		bw.newLine();
		bw.write("selenium with c#");
		
		bw.close();
		
		System.out.println("completed writing in a file");

	}

}
