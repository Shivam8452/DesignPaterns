package com.SOLIDPricniples.LSP;

public class Cient {
	
	public static void ReadAnyFiles(ReadbleFiles r) {
		r.read();
	}
	
	public static void main(String args[]) {
		ReadbleFiles readfile = new ReadbleFiles();
		readfile.read();
		
		WritableFiles writeFile = new WritableFiles();
		writeFile.write();
		ReadAnyFiles(readfile);
		ReadAnyFiles(writeFile);
	}
}
