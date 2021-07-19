package ejercicio02;

public class Password {

	// Aquí tenemos los atributos de Password.
	private int longitud;
	private String contraseña;

	// Esta constante contiene la longitud por defecto.
	private final static int LONGDEF = 8;

	// Este es el constructor por defecto.
	public Password() {

		longitud = LONGDEF;
		contraseña = generarContraseña(this.longitud);

	}

	// Este es el constructor que se usara en caso de que mandemos el parámetro
	// longitud.
	public Password(int longitud) {
		this.longitud = comprobarLongitud(longitud);
		this.contraseña = generarContraseña(this.longitud);
	}

	// Este método nos generará una contraseña dependiendo de la longitud que le
	// indiquemos.
	private static String generarContraseña(int num) {

		//
		String caracter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
		String contFinal = "";

		// El String caracter contiene todos los caracteres que se podrán usar para
		// generar la contraseña y el string contFinal es el que usaremos para mandar la
		// contraseña generada.
		for (int i = 0; i < num; i++) {
			// La variable j genera en cada vuelta del bucle un número entre 0 y el tamaño
			// máximo del String caracter lo convertimos a int porque math trabaja en double
			// y para poder usar luego j en el charAt nos viene mejor un número entero
			// (int).
			int j = (int) (caracter.length() * Math.random());
			contFinal = contFinal + caracter.charAt(j);
		}

		return contFinal;

	}

	// En este método miramos si nos han mandado una longitud de contraseña superior
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
		return "longitud: " + this.longitud + "\nContraseña: " + this.contraseña + "\n\n";
	}

	// Zona de getters y setters.
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

}
