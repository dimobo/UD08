package ejerccicio03;

import java.util.ArrayList;

public class Electrodomestico {

	// Atributos del objeto, los hemos creado protected por que se han de poder
	// heredar.
	protected double precioBase, peso;
	protected String color;
	protected char consumoEnergetico;

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
		this.color = colorDEF;
		this.consumoEnergetico = consumoDEF;

	}

	// Contructor para todos los atributos.
	public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {

		this.precioBase = precioBase;
		this.peso = peso;

		if (colorList().contains(color.toLowerCase())) {
			this.color = color;
		} else {
			this.color = colorDEF;
		}

		if (consumoList().contains(consumoEnergetico)) {
			this.consumoEnergetico = consumoEnergetico;
		} else {
			this.consumoEnergetico = consumoDEF;
		}
	}

	public String toString() {

		String objeto = "Precio del Electrodoméstico: " + this.precioBase + " Peso del Electrodoméstico: " + this.peso
				+ " Color del Electrodoméstico: " + this.color + " Consumo energetico:  " + this.consumoEnergetico;

		return objeto;

	}

	// En esta zona estamos indicando los valores por defectos.
	protected char consumoDEF = 'F';
	protected String colorDEF = "blanco";
	protected double precioDEF = 100.0, pesoDEF = 5.0;

	// Este atributo nos devuelve una lista con lo que serán los parámetros
	// aceptados para el consumo de los electrodomésticos.
	protected ArrayList<Character> consumoList() {
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
	protected ArrayList<String> colorList() {
		ArrayList<String> colorList = new ArrayList<String>();

		colorList.add("blanco");
		colorList.add("negro");
		colorList.add("rojo");
		colorList.add("azul");
		colorList.add("gris");

		return colorList;
	}

	// Zona de gets y sets.
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

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

}
