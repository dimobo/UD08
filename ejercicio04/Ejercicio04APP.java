package ejercicio04;

public class Ejercicio04APP {

	public static void main(String[] args) {

		// Aqui creamos objetos de la clase Serie.
		Serie arraySeries[] = new Serie[3];
		arraySeries[0] = new Serie();
		arraySeries[1] = new Serie("Fumetsu no anata e", "Drama");
		arraySeries[2] = new Serie("Fooly Cooly", "Comedia", "Hajime Ueda", true, 4);

		// En estebucle nos imprime por pantalla los objetos de la clase Serie.
		for (int i = 0; i < arraySeries.length; i++) {
			System.out.println(arraySeries[i].toString());
		}

	}

}
