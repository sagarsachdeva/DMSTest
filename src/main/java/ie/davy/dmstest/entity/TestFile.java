package ie.davy.dmstest.entity;

import java.io.File;

import ie.davy.dmstest.utils.TestUtils.DestinationType;
import ie.davy.dmstest.validators.Validator;

public class TestFile {

	private File generatedFile;

	private File inputFile;

	private File outputFile;

	private DestinationType destinationType;

	private Validator validator;

	public File getGeneratedFile() {
		return generatedFile;
	}

	public void setGeneratedFile(File generatedFile) {
		this.generatedFile = generatedFile;
	}

	public File getInputFile() {
		return inputFile;
	}

	public void setInputFile(File inputFile) {
		this.inputFile = inputFile;
	}

	public File getOutputFile() {
		return outputFile;
	}

	public void setOutputFile(File outputFile) {
		this.outputFile = outputFile;
	}

	public DestinationType getDestinationType() {
		return destinationType;
	}

	public void setDestinationType(DestinationType destinationType) {
		this.destinationType = destinationType;
	}

	public Validator getValidator() {
		return validator;
	}

	public void setValidator(Validator validator) {
		this.validator = validator;
	}

}
