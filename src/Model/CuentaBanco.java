
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
    
   public Float credito(Float deposito){
       this.balance += deposito;
       
       System.out.println("");
       System.out.println("Credito otorgado: " + deposito);
       System.out.println("Balance actualizado: " + this.balance);
       
       return this.balance;
   }
   
   public Float debito(Float monto){
       
       if(this.balance >= monto){
           this.balance -= monto;
           System.out.println("");
           System.out.println("Debito exitoso: " + monto);
           System.out.println("Balance actualizado: " + this.balance);
       }else{
           System.out.println("Saldo insuficiente");
       }
       
       return this.balance;
   }
   
   public void cuentaData(){
       System.out.println("");
       System.out.println("Nro. Cuenta: " + this.identificador);
       System.out.println("Nombre: " + this.nombre);
       System.out.println("Balance: " + this.balance);
   }
    
}
