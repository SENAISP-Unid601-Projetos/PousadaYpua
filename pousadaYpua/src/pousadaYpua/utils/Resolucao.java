package pousadaYpua.utils;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Resolucao {
	private static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    private static final int largura = screenSize.width;
    private static final int altura = screenSize.height;
    
	public static int getLargura() {
		return largura;
	}
	public static int getAltura() {
		return altura;
	}
}

