package ejercicio01;

public class Persona {

	// Aquí tenemos los atributos de los objetos persona que crearemos.
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;

	// Aquí tenemos la constante que se nos ha pedido para poner por defecto sexo
	// hombre.
	private static final char DEF = 'H';

	// Este es nuestro constructor por defecto tal y como se pide el sexo lo
	// recibimos por la constante.
	public Persona() {
		nombre = "";
		edad = 0;
		dni = "";
		sexo = DEF;
		peso = 0;
		altura = 0;
	}

	// Este es nuestro constructor para cuando solo mandemos nombre, edad y sexo.
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;

		this.dni = "";

		// Para evitar tener código repetido hemos generado un método ComprobarSexo y lo
		// estamos llamando aquí para que nos mire si nos han introducido un valor o si
		// se ha introducido un char vació por lo que necesitaremos usar el valor
		// default.
		this.sexo = comprobarSexo(sexo);

		this.peso = 0;
		this.altura = 0;

	}

	// Este será nuestro constructor cuando mandemos todos los parámetros que tiene
	// el objeto.
	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;

		// Aqui estamos usando otra vez el metodo C
		this.sexo = comprobarSexo(sexo);
	}

	private static char comprobarSexo(char c) {

		// Con este if estamos comprobando si nos han mandado un valor para el sexo o no
		// y en caso de que nos hayan mandado un char vacío se introducirá el sexo de
		// nuestra constante.
		if (c == (char) 0) {
			return DEF;
		} else {
			return c;
		}

	}

	@Override
	public String toString() {

		return "Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nDNI: " + this.dni + "\nSexo: " + this.sexo
				+ "\nPeso: " + this.peso + "\nAltura: " + this.altura + "\n\n";
	}

	// Esta es la zona de getters y setters, se han generado de forma automática con
	// el eclipse.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
