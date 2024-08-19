

package Services;

    import Model.Empleados;

public class Programacion2Guia1Ejercicio1 {

   
    public static void main(String[] args) {
        
        Empleados employee1 = new Empleados("34946165","Leonel","Soto",1800f);
        
        System.out.println("El salario anual de " + employee1.getName() + " es: " + employee1.getAnnualSalary(employee1.getSalary()));;
        
    }
    
}
