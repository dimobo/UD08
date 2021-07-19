package ejercicio02;

public class Ejercicio02APP {
	public static void main(String[] args) {
		// Crearemos un array que contendrá objetos de la clase password.
		Password arrayPasswords[] = new Password[6];

		// Las siguientes líneas son los objetos que generamos.
		arrayPasswords[0] = new Password();
		arrayPasswords[1] = new Password(9);
		arrayPasswords[2] = new Password(4);
		arrayPasswords[3] = new Password(0);
		arrayPasswords[4] = new Password(6);
		arrayPasswords[5] = new Password(0);

		// Este for nos mostrará por consola el contenido de los objetos.
		for (int i = 0; i < arrayPasswords.length; i++) {
			System.out.println("Password " + (i + 1) + "\n" + arrayPasswords[i].toString());
		}

	}
}