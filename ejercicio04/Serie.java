package ejercicio04;

public class Serie {

	// Atributos del objeto.
	protected String titulo, genero, creador;
	protected boolean entregado;
	protected int numTemporadas;

	// Valores por defecto.
	protected final int TEMPDEF = 3;
	protected final boolean ENTDEF = false;

	public Serie() {
		titulo = "";
		genero = "";
		creador = "";
		entregado = ENTDEF;
		numTemporadas = TEMPDEF;

	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero = "";
		entregado = ENTDEF;
		numTemporadas = TEMPDEF;
	}

	public Serie(String titulo, String genero, String creador, boolean entregado, int numTemporadas) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.entregado = entregado;
		this.numTemporadas = numTemporadas;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
