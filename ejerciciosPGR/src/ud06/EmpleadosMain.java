package ud06;

import java.util.Scanner;

/*
Menú repetitivo que gestiona una única lista:
1- Añadir empleado o jefe. El id no se debe repetir
2- Modificar el departamento de un empleado dado su id
3- Mostrar todos los empleados y jefes
4- Eliminar un jefe dado su id
5- Mostrar los salarios. Para mostrar el salario final de los jefes se tendrá que sumar al sueldo el plus.
6- Mostrar el personal ordenado por nombre.
7- Salir

** No deberá entrar en las opciones del 2 al 5 si previamente no hay personal.*/

public class EmpleadosMain {

	public static void main(String[] args) {
		/*VARIABLES*/
		int opcion;
		Scanner sc = new Scanner(System.in);
		ArrayList aPersonal = new ArrayList();

        do{
            System.out.println("\n----- MENÚ DE GESTIÓN DE EMPLEADOS -----");
            System.out.println("1 - Añadir empleado o jefe.");
            System.out.println("2 - Modificar el departamento de un empleado.");
            System.out.println("3 - Mostrar todos los empleados y jefes.");
            System.out.println("4 - Eliminar un jefe.");
            System.out.println("5 - Mostrar los salarios.");
            System.out.println("6 - Mostrar el personal ordenado por nombre.");
            System.out.println("7 - Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:  
                	System.out.println("En construcción");
                	break;
                case 2:
                	System.out.println("En construcción");
                	break;
                case 3:
                	System.out.println("En construcción");
                	break;
                case 4:
                	System.out.println("En construcción");
                	break;
                case 5:
                	System.out.println("En construcción");
                	break;
                case 6:
                	System.out.println("En construcción");
                	break;
                case 7:
                	System.out.println("En construcción");
                	break;
               
                default:
                	System.out.println("Opción no válida. Introduce un número del 1 al 7");
                	break;
            }
        }while (opcion != 7);

        sc.close();
    }

}
