package pousadaYpua.utils;

public class Path {
	private static String pathResources = "/Users/macbookpro/Documents/Projeto-Integrador-Pousada/pousadaYpua/resources";
	private static String pathBanco = "jdbc:sqlite:/Users/macbookpro/Documents/Projeto-Integrador-Pousada/pousadaYpua/resources/Pousada.db";
	
	public static String getPathBanco() {
		return pathBanco;	
	}
	
	public static String getPathResources() {
		return pathResources;
	}
	
	

}
