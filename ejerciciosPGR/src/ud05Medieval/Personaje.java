package ud05Medieval;

public class Personaje {

	/*ATRIBUTOS*/
	protected String nombre;
	protected int nivel;
	protected int puntosVida;
	
	
	/*CONSTRUCTORES*/
	public Personaje() {
		this.nombre="";
		this.nivel=0;
		this.puntosVida=0;	
	}
	
	public Personaje(String no, int ni, int p) {
		this.nombre=no;
		this.nivel=ni;
		this.puntosVida=p;	
	}
	
	/*GETTERS Y SETTERS*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	/*TOSTRING*/

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", nivel=" + nivel + ", puntosVida=" + puntosVida + "]";
	}
	
	/*MÉTODOS*/
	
	public void presentarse(){
		System.out.print("Me llamo: " +this.nombre);
		System.out.print("Mi nivel: " +this.nivel);
		System.out.print("Nivel de vida: " +this.puntosVida);	
	}
	
	public void play(){
		System.out.print("play");
	}
	
	public int recibirDanio(int cantidadDanio) {
		int danio= 0;
		danio= puntosVida - cantidadDanio;
		return danio;
	}
}


