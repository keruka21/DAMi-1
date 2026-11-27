package ud06;

/*
 Crea la clase Personal con los atributos id [int], nombre, apellido, fechaNacimiento (LocalDate), sueldo y nombre de la empresa. Crea sus contructores, getters y setters.

* El nombre de la empresa es el mismo para todos y es un dato que no se debe poder cambiar

Crea la clase Empleado que hereda de Personal. Tendrá el atributo departamento.

Crea la clase Jefe que hereda de Personal. Tendrá el atributo Plus (double)

*Todas las clases tendrán el método visualizar

Menú repetitivo que gestiona una única lista:
1- Añadir empleado o jefe. El id no se debe repetir
2- Modificar el departamento de un empleado dado su id
3- Mostrar todos los empleados y jefes
4- Eliminar un jefe dado su id
5- Mostrar los salarios. Para mostrar el salario final de los jefes se tendrá que sumar al sueldo el plus.
6- Mostrar el personal ordenado por nombre.
7- Salir

** No deberá entrar en las opciones del 2 al 5 si previamente no hay personal.
 */