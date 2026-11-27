package ud05Medieval;

public class Soldado extends Personaje {
	
	/*ATRIBUTOS*/
    private String arma;
    private int armadura;
    
    /*CONSTRUCTOR*/
    public Soldado(String nombre, int nivel, int puntosVida, String arma, int armadura) {
        super(nombre, nivel, puntosVida);
        this.arma = arma;
        this.armadura = armadura;
    }
    
    /*GETTERS Y SETTERS*/
    public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}
	
	/*TO-STRING*/

	@Override
	public String toString() {
		return "Soldado [arma=" + arma + ", armadura=" + armadura + ", nombre=" + nombre + ", nivel=" + nivel
				+ ", puntosVida=" + puntosVida + "]";
	}

   /*MÉTODOS*/
    
    public void play() {
        int danio = 0;
        if (arma.equalsIgnoreCase("Espada larga")) {
            danio = 6;
        } else if (arma.equalsIgnoreCase("Lanza")) {
            danio = 5;
        } else {
            danio = 4;
        }
        System.out.println(nombre + " ataca con " + arma + " e inflige " + danio + " de daño.");
    }


	public int recibirDanio(int cantidad) {
        int danioReducido = cantidad - armadura;
        if (danioReducido < 0) {
            danioReducido = 0;
        }
        puntosVida = puntosVida - danioReducido;
        if (puntosVida < 0) {
            puntosVida = 0;
        }
        System.out.println(nombre + " bloquea " + armadura + " con su armadura y recibe " + danioReducido + " de daño. Vida restante: " + puntosVida);
        return puntosVida;
    }


    public void presentarse() {
        super.presentarse();
        System.out.println("   -> Tipo: Soldado | Arma: " + arma + " | Armadura: " + armadura);
    }
}