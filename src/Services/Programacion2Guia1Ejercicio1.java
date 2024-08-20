

package Services;

    import Model.Empleados;
    import Model.CuentaBanco;
    import Model.Libro;

public class Programacion2Guia1Ejercicio1 {

   
    public static void main(String[] args) {
        
        //Ejercicio 1
        Empleados employee1 = new Empleados("23456345"," Carlos","Gutierrez",25000f);
        Empleados employee2 = new Empleados("34234123"," Ana","Sanchez",27500f);
        
        employee1.showEmployees(employee1);
        employee2.showEmployees(employee2);
        
        //Update salary
        employee1.setSalary(employee1);
        
        //show employee's annual salary
        employee1.showAnnualSalary(employee1);
        
        //Ejercicio 2
        CuentaBanco cuenta1 = new CuentaBanco(1,"Juan Perez",15000f);
        
        cuenta1.credito(2500f);
        cuenta1.debito(1500f);
        cuenta1.debito(30000f);
        cuenta1.cuentaData(cuenta1);
        
        //Ejercicio 3
        // a. Inicializa un libro con el título "El Quijote", autor "Miguel de Cervantes", precio 500, y 10 copias disponibles.
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 500f, 10);

        // b. Inicializa otro libro con el título "Cien Años de Soledad", autor "Gabriel García Márquez", precio 700, y 5 copias disponibles.
        Libro libro2 = new Libro("Cien Anios de Soledad", "Gabriel Garcia Marquez", 700f, 5);

        // c. Imprime los detalles de ambos libros.
        libro1.libroData(libro1);
        libro2.libroData(libro2);

        // d. Vende 3 copias del primer libro.
        libro1.venta(3);

        // e. Imprime los detalles del primer libro.
        libro1.libroData(libro1);

        // f. Intenta vender 8 copias del segundo libro.
        libro2.venta(8);

        // g. Incrementa en 5 la cantidad de copias disponibles del segundo libro.
        libro2.incremento(5);

        // h. Imprime los detalles del segundo libro.
        libro2.libroData(libro2);
    }
    }
    
}
