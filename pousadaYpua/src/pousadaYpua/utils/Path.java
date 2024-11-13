package pousadaYpua.utils;

public class Path {
	private static String pathResources = "C:\\\\Users\\\\nicol\\\\Documentos\\\\GitHub\\\\PousadaYpua\\\\pousadaYpua\\\\resources";
	private static String pathBanco = "jdbc:sqlite:C:\\Users\\nicol\\Documentos\\GitHub\\PousadaYpua\\pousadaYpua\\resources\\Pousada.db";
	
	public static String getPathBanco() {
		return pathBanco;	
	}
	
	public static String getPathResources() {
		return pathResources;
	}

}
