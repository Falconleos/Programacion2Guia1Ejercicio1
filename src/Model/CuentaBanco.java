
package Model;


public class CuentaBanco {
    Integer identificador;
    String nombre;
    Float balance;
    
    public CuentaBanco(Integer identificador,String nombre,Float balance){
       this.identificador = identificador; 
       this.nombre = nombre; 
       this.balance = balance; 
    }
    
    public void setIdentificador(Integer identificador){
        this.identificador = identificador;
    }
    public Integer getIdentificador(){
        return this.identificador;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setBalance(Float balance){
        this.balance = balance;
    }
    public Float getBalance(){
        return this.balance;
    }
    
}
