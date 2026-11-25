package ud05Vehiculo;

public class Furgoneta extends Vehiculo{
	/*atributos*/
	private double alto;
	private double tara;
	private double carga;
	
	
	
	/*constructores*/
	public Furgoneta() {
		super();
		this.alto=0.0;
		this.tara=0.0;
		this.carga=0.0;
	}
	
	public Furgoneta(String ma, String mo, String c, int a, double pr, double alto, double tara, double carga) {
		super(ma, mo, c, a, pr);
		this.alto=alto;
		this.tara=tara;
		this.carga=carga;
	}
	
	/*getters y setters*/

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getTara() {
		return tara;
	}

	public void setTara(double tara) {
		this.tara = tara;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	
	
	/*tostring*/
	@Override
	public String toString() {
		return "Furgoneta [alto=" + alto + ", tara=" + tara + ", carga=" + carga + ", matricula=" + matricula
				+ ", modelo=" + modelo + ", color=" + color + ", antiguedad=" + antiguedad + ", precioAlquiler="
				+ precioAlquiler + "]";
	}
	
	/*metodo*/
	public void visualizar(){
		super.visualizar();
		System.out.println("El alto en metros es: " +this.alto);
		System.out.println("La tara en kg es: " +this.tara);
		System.out.println("La carga en kg es:" +this.tara);
	}
	
	}
