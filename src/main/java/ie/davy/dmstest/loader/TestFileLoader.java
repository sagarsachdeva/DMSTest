package ie.davy.dmstest.loader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

@Component
public class TestFileLoader {

	@Value("test.file.name")
	private String testFile;

	@Value("test.file.delimiter")
	private String delimeter;

	public void loadFiles() throws IOException {
		File file = new ClassPathResource(testFile).getFile();
		BufferedReader br = null;
		String line = null;
		try {
			br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {
				
			}

		} catch (Exception e) {

		}
	}

}
