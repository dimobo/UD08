package ejercicio01;

public class Ejercicio01APP {
	public static void main(String[] args) {

		// Aquí vamos a crear una array de 5 personas para probar los distintos casos.
		Persona arrayPersonas[] = new Persona[5];

		// Ahora crearemos los objetos.
		arrayPersonas[0] = new Persona();
		arrayPersonas[1] = new Persona("Maria", 23, 'M');
		arrayPersonas[2] = new Persona("Pepe", 19, (char) 0);
		arrayPersonas[3] = new Persona("Jose", 15, "85694724K", 'H', 65.25, 1.75);
		arrayPersonas[4] = new Persona("Maite", 45, "75454724R", '\0', 70.55, 1.65);

		// Para comprobar que todo ha salido bien recorreremos el array viendo atributo
		// por atributo como ha quedado.

		for (int i = 0; i < arrayPersonas.length; i++) {
			System.out.println("Datos Persona " + (i + 1) + "\n" + arrayPersonas[i].toString());

		}

	}

}
