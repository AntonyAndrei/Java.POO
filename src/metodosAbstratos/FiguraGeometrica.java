package metodosAbstratos;

public abstract class FiguraGeometrica {

	private Cor cor;

	public FiguraGeometrica() {
		
	}
	
	public FiguraGeometrica(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	
	public abstract double area();
	
}
