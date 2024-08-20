
package Model;

public class Libro {
    private static int contadorId = 0; // Contador estático para el id autoincremental
    private Integer id;
    private String titulo;
    private String autor;
    private Float precio;
    private Integer copias;
    
    public Libro(String titulo,String autor,Float precio,Integer copias){
        this.id = ++contadorId; // Incrementa el contador y asigna el id
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.copias = copias;
    }
    
    public Integer getId(){
        return this.id;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setAutor(String autor){
        this.titulo = autor;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setPrecio(Float precio){
        this.precio = precio;
    }
    public void getPrecio(){
        this.precio = precio;
    }
    public Integer setCopias(Integer copias){
        return this.copias;
    }
    public void getCopias(){
        this.copias = copias;
    }
    
    public Integer venta(Integer cantidad){
    
        if(cantidad >= copias){
            this.copias -= cantidad;
            System.out.println("");
            System.out.println("Venta exitosa");
            System.out.println("actualizacion de copias: " + this.copias);
        }else{
            System.out.println("");
            System.out.println("Stock insuficiente");
        }
        return this.copias;
    }
    
    public Integer incremento(Integer cantidad){
        this.copias += cantidad;
        System.out.println("");
        System.out.println("Incremento exitoso");
        System.out.println("actualizacion de copias: " + this.copias);
        
        return this.copias;
    }
    
    public void libroData(Libro libro){
        
        System.out.println("");
        System.out.println("Libro [Id=" + this.id + ", titulo=" + this.titulo + ", autor=" + this.autor + ", precio=" + this.precio + ", copias disponibles=" + this.copias );
    }
    
    
    
}
