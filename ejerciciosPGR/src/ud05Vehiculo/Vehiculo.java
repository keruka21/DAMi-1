package ud05Vehiculo;

public class Vehiculo {
	/*atributos*/
	protected String matricula;
	protected String modelo;
	protected String color;
	protected int antiguedad;
	protected double precioAlquiler;
	
	/*constructores*/
	public Vehiculo() {
		this.matricula="";
		this.modelo="";
		this.color="";
		this.antiguedad=0;
		this.precioAlquiler=0;
	}
	
	public Vehiculo(String ma, String mo, String c, int a, double pr) {
		this.matricula=ma;
		this.modelo=mo;
		this.color=c;
		this.antiguedad=a;
		this.precioAlquiler=pr;
	}
	
	/*getters y setters*/
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public double getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}
	/*tostring*/

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", modelo=" + modelo + ", color=" + color + ", antiguedad="
				+ antiguedad + ", precioAlquiler=" + precioAlquiler + "]";
	}
	
	
	/*método*/
	public void visualizar(){
		System.out.println("La matrícula es: " +this.matricula);
		System.out.println("El modelo es modelo: " +this.modelo);
		System.out.println("El color es:" +color);
		System.out.println("La antigëdad es: " +antiguedad);
		System.out.println("El precio de alquiler:" +precioAlquiler);
	}
	
}
