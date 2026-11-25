package ud05Vehiculo;

import java.util.Scanner;

public class VehiculoMain {

    // MÉTODOS ESTÁTICOS AUXILIARES ----------------------------------------------

    public static int contarVehiculos(Vehiculo[] aVehiculos) {
        int total = 0;
        for (int i = 0; i < aVehiculos.length; i++) {
            if (aVehiculos[i] != null) {
                total++;
            }
        }
        return total;
    }

    public static int buscarVehiculo(Vehiculo[] aVehiculos, String matricula) {
        int indice = -1;
        boolean encontrada = false;
        for (int i = 0; i < aVehiculos.length && !encontrada; i++) {
            if (aVehiculos[i] != null && aVehiculos[i].getMatricula().equalsIgnoreCase(matricula)) {
                encontrada = true;
                indice = i;
            }
        }
        return indice;
    }
    
    public static int buscarPosicionLibre(Vehiculo[] aVehiculos) {
        int posicion = 0;
        boolean ocupada = aVehiculos[posicion] != null;
        while (ocupada) {
            posicion++;
            ocupada = aVehiculos[posicion] != null;
        }
        return posicion;
    }

    // 1 - Introducir un nuevo vehículo
    public static void introducirVehiculo(Vehiculo[] aVehiculos, Scanner sc) {
        String elegir;
        boolean valido, descapotable;
        int anios;
        double precio, tara, carga;
        int posicion;

   

        if (contarVehiculos(aVehiculos) >= aVehiculos.length){
            System.out.println("No hay espacio disponible.");
        } else {
            System.out.println("--Introducir un nuevo vehículo--");
            System.out.println("¿Qué tipo de vehículo vas a introducir?");
            System.out.println("Coche / Furgoneta / Vehículo");
            elegir = sc.next();

            valido = !elegir.equalsIgnoreCase("vehiculo") && !elegir.equalsIgnoreCase("coche") && !elegir.equalsIgnoreCase("furgoneta");
            while (valido) {
                System.out.println("Introduce una opción válida (vehiculo, coche o furgoneta): ");
                elegir = sc.next();
                valido = !elegir.equalsIgnoreCase("vehiculo") && !elegir.equalsIgnoreCase("coche") && !elegir.equalsIgnoreCase("furgoneta");
            }

            System.out.print("Introduce la matrícula: ");
            String matricula = sc.next();
            System.out.print("Introduce la marca: ");
            String marca = sc.next();
            System.out.print("Introduce el modelo: ");
            String modelo = sc.next();
            System.out.print("Introduce la antigüedad (años): ");
            anios = sc.nextInt();
            
            while (anios < 0) {
                System.out.print("Error: Introduce un número positivo: ");
                anios = sc.nextInt();
            }
            System.out.print("Introduce el precio: ");
            precio = sc.nextDouble();
            if (precio < 0);
            while (precio < 0) {
                System.out.print("Error: Introduce un número positivo: ");
                precio = sc.nextDouble();
            }

            posicion = buscarPosicionLibre(aVehiculos);

            if (elegir.equalsIgnoreCase("vehiculo")) {
                aVehiculos[posicion] = new Vehiculo(matricula, marca, modelo, anios, precio);
            } else if (elegir.equalsIgnoreCase("coche")) {
                System.out.print("Introduce si es descapotable (true/false): ");
                descapotable = sc.nextBoolean();
                aVehiculos[posicion] = new Coche(matricula, marca, modelo, anios, precio, descapotable);
            } else {
                System.out.print("Introduce la altura: ");
                double altura = sc.nextDouble();
                
                while (altura < 0) {
                    System.out.print("Error: Introduce un número positivo: ");
                    altura = sc.nextDouble();
                }
                System.out.print("Introduce la tara: ");
                tara= sc.nextDouble();
                while (tara < 0) {
                    System.out.print("Error: Introduce un número positivo: ");
                    tara = sc.nextDouble();
                }
                System.out.print("Introduce la carga: ");
                carga = sc.nextDouble();
                while (carga < 0) {
                    System.out.print("Error: Introduce un número positivo: ");
                    carga = sc.nextDouble();
                }
                aVehiculos[posicion] = new Furgoneta(matricula, marca, modelo, anios, precio, altura, tara, carga);
            }
            System.out.println("Vehículo añadido con éxito.");
        }
    }

  
    // 2 - Listar coches descapotables
    public static void listarDescapotables(Vehiculo[] aVehiculos) {
        boolean encontrado = false;
        for (int i = 0; i < aVehiculos.length; i++) {
            if (aVehiculos[i] instanceof Coche) {
                Coche c = (Coche) aVehiculos[i];
                if (c.isDescapotable()) {
                    System.out.println(c);
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("No hay coches descapotables.");
        }
    }
    

    // 3 - Pedir tara y listar furgonetas con tara menor
    public static void listarFurgonetasTaraMenor(Vehiculo[] aVehiculos, Scanner sc) {
        System.out.print("Introduce la tara máxima: ");
        double tara = sc.nextDouble();
        boolean encontrado = false;
        for (int i = 0; i < aVehiculos.length; i++) {
            if (aVehiculos[i] instanceof Furgoneta) {
                Furgoneta f = (Furgoneta) aVehiculos[i];
                if (f.getTara() < tara) {
                    System.out.println(f);
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("No hay furgonetas con tara menor a " + tara + ".");
        }
    }

    // 4 - Pedir nueva carga y modificar para todas las furgonetas
    public static void modificarCargaFurgonetas(Vehiculo[] aVehiculos, Scanner sc) {
        System.out.print("Introduce la nueva carga: ");
        double nuevaCarga = sc.nextDouble();
        boolean negativa = nuevaCarga < 0;
        while (negativa) {
            System.out.print("Error: Introduce un número positivo: ");
            nuevaCarga = sc.nextDouble();
            negativa = nuevaCarga < 0;
        }
        int modificadas = 0;
        for (int i = 0; i < aVehiculos.length; i++) {
            if (aVehiculos[i] instanceof Furgoneta) {
                Furgoneta f = (Furgoneta) aVehiculos[i];
                f.setCarga(nuevaCarga);
                modificadas++;
            }
        }
        System.out.println(modificadas + " furgoneta(s) actualizada(s).");
    }

    // 5 - Mostrar furgoneta más antigua y más nueva
    public static void mostrarFurgonetaAntiguaYNueva(Vehiculo[] aVehiculos) {
        Furgoneta masAntigua = null;
        Furgoneta masNueva = null;
        boolean primera = true;
        for (int i = 0; i < aVehiculos.length; i++) {
            if (aVehiculos[i] instanceof Furgoneta) {
                Furgoneta f = (Furgoneta) aVehiculos[i];
                if (primera) {
                    masAntigua = f;
                    masNueva = f;
                    primera = false;
                } else {
                    if (f.getAntiguedad() > masAntigua.getAntiguedad()) {
                        masAntigua = f;
                    }
                    if (f.getAntiguedad() < masNueva.getAntiguedad()) {
                        masNueva = f;
                    }
                }
            }
        }
        if (masAntigua == null) {
            System.out.println("No hay furgonetas.");
        } else {
            System.out.println("Furgoneta más antigua: " + masAntigua);
            System.out.println("Furgoneta más nueva:   " + masNueva);
        }
    }

    // 6 - Antigüedad media de coches, furgonetas y vehículos
    public static void antiguedadMedia(Vehiculo[] aVehiculos) {
        int sumaCoches = 0, numCoches = 0;
        int sumaFurgonetas = 0, numFurgonetas = 0;
        int sumaVehiculos = 0, numVehiculos = 0;

        for (int i = 0; i < aVehiculos.length; i++) {
            if (aVehiculos[i] instanceof Furgoneta) {
                sumaFurgonetas += aVehiculos[i].getAntiguedad();
                numFurgonetas++;
            } else if (aVehiculos[i] instanceof Coche) {
                sumaCoches += aVehiculos[i].getAntiguedad();
                numCoches++;
            } else if (aVehiculos[i] instanceof Vehiculo) {
                sumaVehiculos += aVehiculos[i].getAntiguedad();
                numVehiculos++;
            }
        }

        System.out.println("Antigüedad media de coches:     "
            + (numCoches > 0 ? (double) sumaCoches / numCoches : "N/A"));
        System.out.println("Antigüedad media de furgonetas: "
            + (numFurgonetas > 0 ? (double) sumaFurgonetas / numFurgonetas : "N/A"));
        System.out.println("Antigüedad media de vehículos:  "
            + (numVehiculos > 0 ? (double) sumaVehiculos / numVehiculos : "N/A"));
    }

    // 7 - Ordenar furgonetas por tara (Comparable) y mostrar
 

    // 8 - Listar todos los vehículos ordenados por matrícula
    

    // 9 - Introducir matrícula y borrar dicho vehículo
    public static void borrarVehiculo(Vehiculo[] aVehiculos, Scanner sc) {
        System.out.print("Introduce la matrícula a borrar: ");
        String matricula = sc.next();
        int indice = buscarVehiculo(aVehiculos, matricula);

        if (indice == -1) {
            System.out.println("No se encontró ningún vehículo con esa matrícula.");
        } else {
            System.out.println("Vehículo a borrar: " + aVehiculos[indice]);
            System.out.print("¿Confirmas? (true/false): ");
            boolean confirmar = sc.nextBoolean();
            if (confirmar) {
                aVehiculos[indice] = null;
                System.out.println("Vehículo borrado exitosamente.");
            } else {
                System.out.println("Operación cancelada.");
            }
        }
    }

    // 10 - Salir
    public static void salir() {
        System.out.println("Finalizando programa. Hasta pronto :-)");
    }

    // MAIN--------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehiculo[] aVehiculos = new Vehiculo[10];
        int opcion;
        

        do{
            System.out.println("\n----- MENÚ DE VEHÍCULOS -----");
            System.out.println("1.  Introducir un nuevo vehículo");
            System.out.println("2.  Listar los datos de los coches que sean descapotables");
            System.out.println("3.  Pedir una tara y listar las furgonetas con tara menor");
            System.out.println("4.  Pedir una nueva carga y modificarla para todas las furgonetas");
            System.out.println("5.  Mostrar los datos de la furgoneta más antigua y más nueva");
            System.out.println("6.  Mostrar la antigüedad media de coches, furgonetas y vehículos");
            System.out.println("7.  Ordenar el listado de furgonetas por tara y mostrarlo");
            System.out.println("8.  Listar todos los vehículos ordenados por matrícula");
            System.out.println("9.  Introducir una matrícula y borrar dicho vehículo");
            System.out.println("10. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:  introducirVehiculo(aVehiculos, sc); break;
                case 2:  listarDescapotables(aVehiculos); break;
                case 3:  listarFurgonetasTaraMenor(aVehiculos, sc); break;
                case 4:  modificarCargaFurgonetas(aVehiculos, sc); break;
                case 5:  mostrarFurgonetaAntiguaYNueva(aVehiculos); break;
                case 6:  antiguedadMedia(aVehiculos); break;
                case 7:  System.out.println("No admite ordenación"); break;
                case 8:  System.out.println("No admite ordenación"); break;
                case 9:  borrarVehiculo(aVehiculos, sc); break;
                case 10: salir();break;
                default: System.out.println("Opción no válida. Introduce un número del 1 al 10."); break;
            }
        }while (opcion != 10);

        sc.close();
    }
}   