public class Casa{
	private String lampada;
	private String porta;
	private String janela;
	static int house;
	public Casa() {
		Casa.house++;
		System.out.println("esta casa é a casa de número " + Casa.house);
	}
	public String ligaLampada() {
		return this.lampada;
	}
	public String abreJanela() {
		return this.janela;
}
	public void setJanela(String abrir) {
		this.janela = abrir;
	}
	public String abrePorta() {
		return this.porta;
}
}