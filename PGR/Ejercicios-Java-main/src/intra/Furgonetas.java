package herencia;

public class Furgonetas extends Vehiculo{
	private double alto;
	private double tara;
	private double carga;
	
	public Furgonetas() {
		super();
		this.alto=0;
		this.tara=0;
		this.carga=0;
	}
	public Furgonetas(String mat, String mar, String mo, String c, int a, double p, double al, double t, double ca) {
		super(mat, mar, mo, c, a, p);
		this.alto=al;
		this.tara=t;
		this.carga=ca;
	}
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
	@Override
	public String toString() {
		return "Furgonetas [alto=" + alto + ", tara=" + tara + ", carga=" + carga + ", matricula=" + matricula
				+ ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", anos=" + anos + ", precio="
				+ precio + "]";
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("La altura es: "+this.alto);
		System.out.println("La tara es de: "+this.tara);
		System.out.println("La carga máxima es de: "+this.carga);
	}
}
