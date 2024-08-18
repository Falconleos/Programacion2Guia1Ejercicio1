
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
    
        //calculate anual salary
        public Float getAnnualSalary(Float salary){
            return this.salary * 12;
        }
        
        
    
    
}
