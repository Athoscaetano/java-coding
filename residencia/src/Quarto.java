
public class Quarto {
public static void main(String[] args) {
	Casa quarto = new Casa();
	quarto.abrePorta();
	quarto.abreJanela();
	quarto.ligaLampada();
	quarto.setJanela("a janela est� aberta.");
	System.out.println(quarto.abreJanela());
	Casa casa = new Casa();
}
}
