package ejercicio04;

public class Serie {

	// Atributos del objeto.
	protected String titulo, genero, creador;
	protected boolean entregado;
	protected int numTemporadas;

	// Valores por defecto.
	protected final int TEMPDEF = 3;
	protected final boolean ENTDEF = false;

	// Este es el constructor por defecto.
	public Serie() {
		titulo = "";
		genero = "";
		creador = "";
		entregado = ENTDEF;
		numTemporadas = TEMPDEF;

	}

	// Este es el constructor para cuando mandemos solo el titulo y el creador de la
	// serie.
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero = "";
		entregado = ENTDEF;
		numTemporadas = TEMPDEF;
	}

	// Este es el constructor con todos los parametros.
	public Serie(String titulo, String genero, String creador, boolean entregado, int numTemporadas) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.entregado = entregado;
		this.numTemporadas = numTemporadas;
	}

	@Override
	public String toString() {
		return "Titulo de la Serie: " + this.titulo + "\nGenero de la serie: " + this.genero + "\nCreador de la serie: "
				+ this.creador + "\nSerie entregada: " + this.entregado + "\nNumero de temporadas: "
				+ this.numTemporadas + "\n\n";
	}

	// Zona getters y setters.
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

}
