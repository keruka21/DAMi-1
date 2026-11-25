package vehiculo;

import java.util.Scanner;

public class PrincipalVehiculo {

	public static int opcion(Scanner sc, int op) {
		System.out.println("\n1. Introducir un nuevo vehiculo.");
		System.out.println("2. Mostrar todos vehiculos.");
		System.out.println("3. Salir.");
		System.out.println("¿Qué quieres hacer?");
		op=sc.nextInt();
		return op;
	}
	public static int introducir(Scanner sc, Vehiculo [] aVehiculo, int cont) {
		String tipo, matricula, marca, modelo;
		int anios;
		double precio, altura, peso;
		boolean descapotable;
			
		System.out.print("¿Qué tipo de vehiculo va a introducir? ");
		tipo=sc.next();
		while (!tipo.equalsIgnoreCase("vehiculo")&&!tipo.equalsIgnoreCase("coche")&&!tipo.equalsIgnoreCase("furgoneta")) {
			System.out.println("Introduce una opción válida (vehiculo, coche o furgoneta): ");
			tipo=sc.next();
		}
		System.out.print("Introduce la matrícula: ");
		matricula=sc.next();
		System.out.print("Introduce la marca: ");
		marca=sc.next();
		System.out.print("Introduce el modelo: ");
		modelo=sc.next();
		System.out.print("Introduce la duración del viaje: ");
		anios=sc.nextInt();
		while (anios<0) {
			System.out.print("Error: Introduce un número positivo: ");
			anios=sc.nextInt();
		}
		System.out.print("Introduce el precio de alquiler: ");
		precio=sc.nextDouble();
		while (precio<0) {
			System.out.print("Error: Introduce un número positivo: ");
			precio=sc.nextDouble();
		}
		if (tipo.equalsIgnoreCase("vehiculo")) {
			aVehiculo[cont]=new Vehiculo(matricula,marca,modelo,anios,precio);
			cont++;
			System.out.println("Vehiculo añadido exitosamente.");
		} else if (tipo.equalsIgnoreCase("coche")){
			System.out.println("Introduce si es descapotable: ");
			descapotable=sc.hasNext();
			aVehiculo[cont]=new Coche(matricula,marca,modelo,anios,precio,descapotable);
			cont++;
			System.out.println("Vehiculo añadido exitosamente.");
		} else if (tipo.equalsIgnoreCase("furgoneta")) {
			System.out.print("Introduce la altura: ");
			altura=sc.nextDouble();
			while (altura<0) {
				System.out.print("Error: Introduce un número positivo: ");
				altura=sc.nextDouble();
			}
			System.out.print("Introduce el peso: ");
			peso=sc.nextDouble();
			while (peso<0) {
				System.out.print("Error: Introduce un número positivo: ");
				peso=sc.nextDouble();
			}
			aVehiculo[cont]=new Furgoneta(matricula,marca,modelo,anios,precio,altura,peso);
			cont++;
			System.out.println("Vehiculo añadido exitosamente.");
		}
	return cont;
	}
	public static void mostrar(Vehiculo [] aVehiculo, int cont) {
		for (int i=0;i<cont;i++) {
			System.out.println(aVehiculo[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		Vehiculo [] aVehiculo=new Vehiculo [10];
		int op=0, cont=0;
		
		do {
			op=opcion(sc, op);
			switch (op) {
				case 1:
					if (cont==10) {
						System.out.println("No hay espacio.");
					} else {
						cont=introducir(sc, aVehiculo, cont);
					}
					break;
				case 2:
					if (cont==0) {
						System.out.println("No hay vehiculos.");
					} else {
						mostrar(aVehiculo, cont);
					}
					break;
				case 3:
					System.out.println("Hasta pronto!");
					break;
				default:
					System.out.println("Introduce una opción del menú.");
					op=opcion(sc, op);
			}
		} while (op!=3);
	sc.close();
	}

}
