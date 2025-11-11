package quartaAula;

public class CubosAdapter extends Cilindro{
	private Cubo cubo;
	public CubosAdapter(Cubo cubo){
		this.cubo=cubo;
	}
	@Override
    public int getRaio() {
        return (int) (this.cubo.getLado() * Math.sqrt(2) / 2);
    }
}
	


