package ejerccicio03;

import java.util.ArrayList;

public class Electrodomestico {

	// Atributos del objeto.
	private double precioBase, peso;
	private String color;
	private char consumoEnergetico;

	// Constructor en blanco con todo por defecto.
	public Electrodomestico() {

		precioBase = precioDEF;
		peso = pesoDEF;
		color = colorDEF;
		consumoEnergetico = consumoDEF;

	}

	// Constructor para precio y peso los demas atributos por defecto.
	public Electrodomestico(double precioBase, double peso) {

		this.precioBase = precioBase;
		this.peso = peso;

	}

	// Contructor para todos los atributos.
	public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {

		this.precioBase = precioBase;
		this.peso = peso;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;

	}

	// En esta zona estamos indicando los valores por defectos.
	private char consumoDEF = 'F';
	private String colorDEF = "blanco";
	private double precioDEF = 100.0, pesoDEF = 5.0;

	// Este atributo nos devuelve una lista con lo que serán los parámetros
	// aceptados para el consumo de los electrodomésticos.
	private ArrayList<Character> consumoList() {
		ArrayList<Character> consumoList = new ArrayList<Character>();

		consumoList.add('A');
		consumoList.add('B');
		consumoList.add('C');
		consumoList.add('D');
		consumoList.add('E');
		consumoList.add('F');

		return consumoList;
	}

	// Este atributo nos devuelve una lista con lo que serán los parámetros
	// aceptados para el color de los electrodomésticos.
	private ArrayList<String> colorList() {
		ArrayList<String> colorList = new ArrayList<String>();

		colorList.add("blanco");
		colorList.add("negro");
		colorList.add("rojo");
		colorList.add("azul");
		colorList.add("gris");

		return colorList;
	}

	// Zona de gets y sets (en este ejercicio hemos modificado un par de sets).
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {

		this.peso = peso;
	}

	public String getColor() {

		return color;
	}

	// Este set lo hemos modificado un poco para asegurarnos que nos introducen un
	// valor dentro de los esperados y en caso contrario obtendremos el valor por
	// defecto.
	public void setColor(String color) {

		if (colorList().contains(color.toLowerCase())) {
			this.color = color;
		} else {
			this.color = colorDEF;
		}

	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	// Este set lo hemos modificado un poco para asegurarnos que nos introducen un
	// valor dentro de los esperados y en caso contrario obtendremos el valor por
	// defecto.
	public void setConsumoEnergetico(char consumoEnergetico) {

		if (consumoList().contains(consumoEnergetico)) {
			this.consumoEnergetico = consumoEnergetico;
		} else {
			this.consumoEnergetico = consumoDEF;
		}

	}

}
