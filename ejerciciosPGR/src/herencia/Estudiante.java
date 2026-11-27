package herencia;

public class Estudiante extends Persona{
	/*Atributos clase hijo*/
	private String clase;
	private String matricula;
	
	/*constructores*/
	//llegan todos los atributos vacios
	public Estudiante() {
		super(); //llama al cosntructor vacio de la clase padre Persona (dni, nombre, edad)
		this.clase="";
		this.matricula="";
	}
	//solo llega clase y matricula y los atributos vacios de Perosna
	public Estudiante(String c, String m) {
		super();
		this.clase=c;
		this.matricula=m;
	}
	//llama a dni, nombre, edad, clase y matricula
	public Estudiante(String d, String n, int e, String c, String m) {
		super(d, n, e);
		this.clase=c;
		this.matricula=m;
	}
	
	
	//getters y setters
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	//tostring
	@Override
	public String toString() {
		return "Estudiante [clase=" + clase + ", matricula=" + matricula + ", dni=" + dni + ", nombre=" + nombre
				+ ", edad=" + edad + "]";
	}
	
	//método visualizar
	
	public void visualizar() {
		super.visualizar();//llamamos al metodo visualizar de la clase padre Persona
		System.out.println("Tu clase es: " +this.clase);
		System.out.println("Tu matrícula es: " +this.matricula);
	}
}
