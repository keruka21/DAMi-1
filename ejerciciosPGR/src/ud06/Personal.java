package ud06;

import java.time.LocalDate;

/*
 Crea la clase Personal con los atributos id [int], nombre, apellido,
 fechaNacimiento (LocalDate), sueldo y nombre de la empresa. Crea sus contructores, getters y setters.

El nombre de la empresa es el mismo para todos y es un dato que no se debe poder cambiar
Todas las clases tendrán el método visualizar
*/

public class Personal {
	/*ATRIBUTOS*/
	protected int id;
	protected String nombre;
	protected String apellido;
	protected LocalDate fechaNacimiento;
	protected double sueldo;
	protected String nombreEmpresa = "Suspenso S.A.";

	/*CONSTRUCTORES*/
	
	public Personal() {
		this.id = 0;
		this.nombre = "";
		this.apellido = "";
		this.fechaNacimiento = null;
		this.sueldo = 0.0;
		this.nombreEmpresa = "";
		
	}
	
	public Personal(int id, String n, String a, LocalDate f, double s) {
		this.id = id;
		this.nombre = n;
		this.apellido = a;
		this.fechaNacimiento = f;
		this.sueldo = s;
	}

	
	/*GETTERS Y SETTERS*/
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	
	/*TO-STRING*/
	
	@Override
	public String toString() {
		return "Personal [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", sueldo=" + sueldo + ", nombreEmpresa=" + nombreEmpresa + "]";
	}
	
	/*MÉTODOS*/
	public void visualizar(){
		System.out.println("ID: " +this.id);
		System.out.println("Nombre: " +this.nombre);
		System.out.println("Apellido:" +this.apellido);
		System.out.println("Fecha de Nacimiento " +this.fechaNacimiento);
		System.out.println("Sueldo:" +this.sueldo);
		System.out.println("Empresa:" +this.nombreEmpresa);
	}

}
