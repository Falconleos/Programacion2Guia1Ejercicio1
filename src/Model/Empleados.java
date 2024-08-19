
package Model;


public class Empleados {
    
    //Class's Attributes
    String dni;
    String name;
    String surname;
    Float salary;
    
    //Getters & Setters
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setDni(String dni){
        this.dni = dni;
    }
    
    public String getDni(){
        return this.dni;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public String getSurname(){
        return this.surname;
    }
    
    public void setSalary(Float salary){
        this.salary = salary;
    }
    
    public Float getSalary(){
        return this.salary;
    }
    
    //Constructor
    public Empleados(String dni, String name, String surname, Float salary){
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
    
    //Methods
    
        //show employees
        public void showEmployees(Empleados employee){
            System.out.println("Empleado[dni = " + this.dni + ", nombre = " + this.name + ", apellido = " + this.surname + ", salario = " + this.salary + "]");      
        }
        
        public Float setSalary(Empleados employee){
            
            float porcentage = 0.15f;
            
            this.salary = employee.getSalary() + (employee.getSalary() * porcentage);
            
            System.out.println("");
            System.out.println("Empleado Actualizado");
            System.out.println("Empleado[dni = " + this.dni + ", nombre = " + this.name + ", apellido = " + this.surname + ", salario = " + this.salary + "]");      
      
            
        return this.salary;    
        }
        
        public void showAnnualSalary(Empleados employee){
            
            float annualSalary = this.salary * 12;
            
            System.out.println("");
            System.out.println("Salario anual de " + this.name + " " + this.surname + ": " + annualSalary);
        }
    
        
    
}
