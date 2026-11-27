package ud06;

import java.time.LocalDate;

/*
Crea la clase Empleado que hereda de Personal.
Tendrá el atributo departamento.
Todas las clases tendrán el método visualizar
*/

public class Empleado extends Personal{
	/*ATRIBUTOS*/
	private String departamento;
	
	/*CONSTRUCTORES*/
	
	public Empleado(){
		super();
		this.departamento="";
	}
	
	public Empleado(int id, String n, String a, LocalDate f, double s, String d){
		super(id, n, a, f, s);
		this.departamento = d;
	}

	/*GETTERS Y SETTERS*/
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	/*TO-STRING*/
	
	@Override
	public String toString() {
		return "Empleado [departamento=" + departamento + ", id=" + id + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", sueldo=" + sueldo + ", nombreEmpresa=" + nombreEmpresa
				+ "]";
	}
	
	/*MÉTODOS*/
	

}
