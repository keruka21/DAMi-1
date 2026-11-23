package herencia;

public class mainPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.visualizar();
		
		Persona p2 = new Persona("123", "Kelea", 33);
		p2.visualizar();
		
		Estudiante e1 = new Estudiante();
		e1.visualizar();
		
		Estudiante e2 = new Estudiante("123", "Leire", 18, "1DAM", "456");
		e2.visualizar();
		
		Profesor pr1 = new Profesor();
		pr1.visualizar();
		
		Profesor pr2 = new Profesor("123456", "Pepito", 40, "informática", true);
		pr2.visualizar();
		
		Persona[] aPersonas = new Persona[4];
		
		aPersonas [0] = e1;
		aPersonas [1] = e2;
		aPersonas [2] = pr1;
		aPersonas [3] = pr2;
		
		for (int i=0; i<aPersonas.length; i++) {
			System.out.println(i +"persona");
			aPersonas[i].visualizar();
			//System.out.println(aPersonas[i]);
		}

	}

}
