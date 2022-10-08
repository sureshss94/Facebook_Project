package com.singletondesign;

import java.io.IOException;

public class File_Read_Manager {

	public Filereader get_Instance_Fb() throws IOException {

		Filereader fr = new Filereader();
		return fr;

	}

	public static File_Read_Manager get_Instance_Frm() {
		File_Read_Manager frm = new File_Read_Manager();
		return frm;
	}

	private File_Read_Manager() {

	}

}
