package ud05Medieval;


public class Campesino extends Personaje {
	
	/*ATRIBUTOS*/
    private String herramienta;
    private int cosechaRecolectada;

    /*CONSTRUCTOR*/
    public Campesino(String nombre, int nivel, int puntosVida, String herramienta, int cosechaRecolectada) {
        super(nombre, nivel, puntosVida);
        this.herramienta = herramienta;
        this.cosechaRecolectada = cosechaRecolectada;
    }

    /*GETTERS Y SETTERS*/
    public String getHerramienta() {
		return herramienta;
	}

	public void setHerramienta(String herramienta) {
		this.herramienta = herramienta;
	}

	public int getCosechaRecolectada() {
		return cosechaRecolectada;
	}

	public void setCosechaRecolectada(int cosechaRecolectada) {
		this.cosechaRecolectada = cosechaRecolectada;
	}

	public void venderCosecha() {
        int monedas = 100 * cosechaRecolectada;
        System.out.println(nombre + " vende su cosecha y gana " + monedas + " monedas.");
        cosechaRecolectada = 0;
        }
    
	/*TO-STRING*/
	@Override
	public String toString() {
		return "Campesino [herramienta=" + herramienta + ", cosechaRecolectada=" + cosechaRecolectada + ", nombre="
				+ nombre + ", nivel=" + nivel + ", puntosVida=" + puntosVida + "]";
	}
	
    
    /*MÉTODOS*/
    public void play() {
        if (herramienta.equalsIgnoreCase("Azada")) {
            cosechaRecolectada += 5;
        } else if (herramienta.equalsIgnoreCase("Hoz")) {
            cosechaRecolectada += 3;
        } else {
            cosechaRecolectada += 1;
        }
        System.out.println(nombre + " trabaja la tierra con " + herramienta + ". Cosecha recolectada: " + cosechaRecolectada);
    }

	public void presentarse() {
        super.presentarse();
        System.out.println("   -> Tipo: Campesino | Herramienta: " + herramienta + " | Cosecha: " + cosechaRecolectada);
    }
}