package com.singletondesign;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Filereader {

	public static Properties p;

	public Filereader() throws IOException {

		File f = new File("C:\\Users\\suresh\\facebook\\src\\main\\java\\facebook.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();
		p.load(fis);

	}

	public String get_Instance_Url() {
		String property = p.getProperty("url");
		return property;
	}

	public String get_Instance_Username() {

		String value = p.getProperty("username");
		return value;
	}

	public String get_Instance_Password() {

		String value = p.getProperty("password");
		return value;
	}

	public String get_Instnce_Fname() {

		String value = p.getProperty("firstname");
		return value;
	}

	public String get_Instance_Passwordcreate() {
		String value = p.getProperty("passwordcreate");
		return value;
	}

}
