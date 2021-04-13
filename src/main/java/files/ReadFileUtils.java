package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUtils {

	public static void read(String fileName) {
		File f = new File(fileName);

		read(f);

	}

	public static void read(File f) {
		try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr)) {

			String line = null;
			while ((line = br.readLine()) != null) {

				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
