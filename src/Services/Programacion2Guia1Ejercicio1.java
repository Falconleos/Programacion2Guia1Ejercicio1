

package Services;

    import Model.Empleados;
    import Model.CuentaBanco;

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
        cuenta1.cuentaData();
        
    }
    
}
