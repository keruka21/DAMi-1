package ud06;
/*
Crea la clase Jefe que hereda de Personal. Tendrá el atributo Plus (double)
Todas las clases tendrán el método visualizar
*/

import java.time.LocalDate;

public class Jefe extends Personal{
	/*ATRIBUTOS*/
	private double plus;
	
	/*CONSTRUCTORES*/
	public Jefe(){
		super();
		this.plus = 0.0;
	}
	
	public Jefe( int id, String n, String a, LocalDate f, double s, double p) {
		super(id, n, a, f, s);
		this.plus = 300.5; 
	 }

	
	/*GETTERS Y SETTERS*/
	
	public double getPlus() {
		return plus;
	}

	public void setPlus(double plus) {
		this.plus = plus;
	}

	/*TO-STRING*/
	
	@Override
	public String toString() {
		return "Jefe [plus=" + plus + ", id=" + id + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", sueldo=" + sueldo + ", nombreEmpresa=" + nombreEmpresa
				+ "]";
	}
	
	/*MÉTODOS*/
	

}
