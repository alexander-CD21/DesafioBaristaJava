public class Articulo{

    private String nombre;
    private double precio;

    public Articulo(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setNombre(){
        this.nombre = nombre;
    }

    public void setPrecio(){
        this.precio = precio;
    }
    

}