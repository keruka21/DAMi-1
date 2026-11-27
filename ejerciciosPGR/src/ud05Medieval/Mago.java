package ud05Medieval;

public class Mago extends Personaje {
    /*ATRIBUTOS*/
	private int hechizos;
    private String tipoAtaque;
    
    /*CONSTRUCTORES*/
    public Mago(String nombre, int nivel, int puntosVida, int hechizos, String ataque) {
        super(nombre, nivel, puntosVida);
        this.hechizos = hechizos;
        this.tipoAtaque = ataque;
    }
    
    /*GETTERS Y SETTERS*/
    public int getHechizos() {
		return hechizos;
	}

	public void setHechizos(int hechizos) {
		this.hechizos = hechizos;
	}

	public String getTipoAtaque() {
		return tipoAtaque;
	}

	public void setTipoAtaque(String tipoAtaque) {
		this.tipoAtaque = tipoAtaque;
	}
	
	/*MÉTODOS*/

    public void meditar(int cantidad) {
        if (cantidad > 0) {
            hechizos += cantidad;
            System.out.println(nombre + " medita y recupera " + cantidad + " hechizos. Total hechizos: " + hechizos);
        }
    }

	public void play() {
        if (hechizos >= 10) {
            hechizos--;
            System.out.println(nombre + " lanza un hechizo de " + tipoAtaque + ". Hechizos restantes: " + hechizos);
        } else {
            System.out.println(nombre + " no tiene suficientes hechizos (tiene " + hechizos + ") y debe meditar para recuperarlos.");
        }
    }

    public void presentarse() {
        super.presentarse();
        System.out.println("   -> Tipo: Mago | Hechizos: " + hechizos + " | Ataque elemental: " + tipoAtaque);
    }
    
}
