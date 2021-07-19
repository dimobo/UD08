package ejercicio02;

public class Password {

	// Aqu� tenemos los atributos de Password.
	private int longitud;
	private String contrase�a;

	// Esta constante contiene la longitud por defecto.
	private final static int LONGDEF = 8;

	// Este es el constructor por defecto.
	public Password() {

		longitud = LONGDEF;
		contrase�a = generarContrase�a(this.longitud);

	}

	// Este es el constructor que se usara en caso de que mandemos el par�metro
	// longitud.
	public Password(int longitud) {
		this.longitud = comprobarLongitud(longitud);
		this.contrase�a = generarContrase�a(this.longitud);
	}

	// Este m�todo nos generar� una contrase�a dependiendo de la longitud que le
	// indiquemos.
	private static String generarContrase�a(int num) {

		//
		String caracter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
		String contFinal = "";

		// El String caracter contiene todos los caracteres que se podr�n usar para
		// generar la contrase�a y el string contFinal es el que usaremos para mandar la
		// contrase�a generada.
		for (int i = 0; i < num; i++) {
			// La variable j genera en cada vuelta del bucle un n�mero entre 0 y el tama�o
			// m�ximo del String caracter lo convertimos a int porque math trabaja en double
			// y para poder usar luego j en el charAt nos viene mejor un n�mero entero
			// (int).
			int j = (int) (caracter.length() * Math.random());
			contFinal = contFinal + caracter.charAt(j);
		}

		return contFinal;

	}

	// En este m�todo miramos si nos han mandado una longitud de contrase�a superior
	// a 0 (que se consideraria null) y en caso de que no sea superior utilizamos la
	// longitud por defecto.
	private static int comprobarLongitud(int num) {
		if (num != 0) {
			return num;
		} else {
			return LONGDEF;
		}
	}

	@Override
	public String toString() {
		return "longitud: " + this.longitud + "\nContrase�a: " + this.contrase�a + "\n\n";
	}

	// Zona de getters y setters.
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

}
