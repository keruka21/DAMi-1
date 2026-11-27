package ud05Vehiculo;

public class Coche extends Vehiculo{
	/*atributos*/
	private boolean descapotable;
	
	/*constructores*/
	public Coche() {
		super();
		this.descapotable=false;
	}
	
	public Coche(String ma, String mo, String c, int a, double pr, boolean des) {
		super(ma, mo, c, a, pr);
		this.descapotable = des;
	}

	/*getters y setters*/
	
	public boolean isDescapotable() {
		return descapotable;
	}

	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}
	
	/*tostring*/
	@Override
	public String toString() {
		return "Coche [descapotable=" + descapotable + ", matricula=" + matricula + ", modelo=" + modelo + ", color="
				+ color + ", antiguedad=" + antiguedad + ", precioAlquiler=" + precioAlquiler + "]";
	}
	/*metodo*/
	public void visualizar(){
		super.visualizar();
		if(descapotable) {
			System.out.println("El modelo es descapotable.");
		}else {
			System.out.println("No es descapotable.");
		}
		
	}
	
}
