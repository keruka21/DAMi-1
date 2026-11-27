package herencia;

public class Persona {
	/*Atributos protected de la clase padre*/
	protected String dni;
	protected String nombre;
	protected int edad;
	
	/*constructores*/

	public Persona() {
		this.dni="";
		this.nombre="";
		this.edad=0;
	}
	
	public Persona(String d, String n, int e) {
		this.dni= d;
		this.nombre= n;
		this.edad= e;
	}
	
	/*getters y setters*/
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

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
	
	/*tostring*/
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	/*método visualizar*/
	public void visualizar() {
		System.out.println("Tu DNI es: " +this.dni);
		System.out.println("Tu nombre es: " +this.nombre);
		System.out.println("Tu edad es: " +this.edad);
	}

}
