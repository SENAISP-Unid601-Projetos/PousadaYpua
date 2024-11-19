package pousadaYpua.utils;

import java.io.File;

public class Path {
	private static String rootPath = new File("").getAbsolutePath();
	private static String pathResources = rootPath +File .separator+ "resources";
	private static String pathBanco = "jdbc:sqlite:"+File .separator+ rootPath+ File .separator+ "resources"+File.separator+"Pousada.db";
	
	public static String getPathBanco() {
		return pathBanco;	
	}
	
	public static String getPathResources() {
		return pathResources;
	}
	
	

}
