package ud05Medieval;

public class Mago extends Personaje{
	/*atributos*/
	private int hechizos;
	private String ataque;
	
	
	/*constructores*/
	public Mago() {
		super();
		this.nombre="";
		this.nivel=0;
		this.puntosVida=0;	
	}
	
	public Mago(String no, int ni, int p) {
		this.nombre=no;
		this.nivel=ni;
		this.puntosVida=p;	
	}
	
	
	
	/*métodos*/
	
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
