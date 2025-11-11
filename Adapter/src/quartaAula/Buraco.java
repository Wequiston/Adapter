package quartaAula;

public class Buraco {
	private int raio;
	public Buraco (int raio) {
	this.raio=raio;
}
public int setRaio() {
	return this.raio;
}
public boolean verificaTamanho(Cilindro c) {
	return c.getRaio()<=this.raio?true false;
}
	
}
