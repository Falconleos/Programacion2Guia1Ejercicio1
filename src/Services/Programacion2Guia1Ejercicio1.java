

package Services;

    import Model.Empleados;

public class Programacion2Guia1Ejercicio1 {

   
    public static void main(String[] args) {
        
        Empleados employee1 = new Empleados("23456345"," Carlos","Gutierrez",25000f);
        Empleados employee2 = new Empleados("34234123"," Ana","Sanchez",27500f);
        
        employee1.showEmployees(employee1);
        employee2.showEmployees(employee2);
        
        //Update salary
        employee1.setSalary(employee1);
        
        //show employee's annual salary
        employee1.showAnnualSalary(employee1);
    }
    
}
