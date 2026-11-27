package herencia;

public class Profesor extends Persona{
	/*Atributos clase hijo*/
	private String departamento;
	private boolean jefe;
	
	/*constructores*/

	public Profesor() {
		super(); //constructor vacio de Persona
		this.departamento="";
		this.jefe=false;
	}
	
	public Profesor(String d, String n, int e, String dep, boolean j) {
		super(d, n, e);
		this.departamento=dep;
		this.jefe=j;
	}
	
	/*getters y setters*/
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public boolean isJefe() {
		return jefe;
	}

	public void setJefe(boolean jefe) {
		this.jefe = jefe;
	}
	
	/*tostring*/
	@Override
	public String toString() {
		return "Profesor [departamento=" + departamento + ", jefe=" + jefe + ", dni=" + dni + ", nombre=" + nombre
				+ ", edad=" + edad + "]";
	}
	
	/*método visualizar*/
	public void visualizar() {
		super.visualizar();
		System.out.println("Tu departamento es: " +this.departamento);
		if(jefe) {
			System.out.println("Eres jefe");
		}else{
			System.out.println("No eres jefe");
		}
	}
	
}
