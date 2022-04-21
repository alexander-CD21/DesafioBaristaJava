import java.util.ArrayList;

public class Pedido{
    
    private String nombre;
    private boolean listo;
    private ArrayList<Articulo> articulo;
    //constructor vacio inicializado con nombre invitado y arraylist vacia 
    public Pedido(){
        this.nombre = "invitado";
        this.articulo = new ArrayList<Articulo>();
    }
    //contructor sobrecargado que toma como parametros string nombre 
    public Pedido( String nombre){
        this.nombre = nombre;
        this.articulo = new ArrayList<Articulo>();
    }
    //agregando los getter 
    public String getNombre(){
        return this.nombre;
    }

    public boolean getListo(){
        return this.listo;
    }

    public ArrayList<Articulo> getArticulo(){
        return this.articulo;
    }
    //agregando los setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setListo(boolean listo){
        this.listo = listo;
    }

    public void setArticulo(ArrayList<Articulo> articulo ){
        this.articulo = articulo;
    }

    public void addArticulo(Articulo articulo){
        this.articulo.add(articulo);
    }

    public String getStatusMessage(){

        if(this.listo){
            return "Tu pedido esta listo";
        }
        else{
            return "Gracias por esperar.Tu pedido estara listo pronto";
        }
    }

    public double getOrderTotal(){
        double total=0.0;
        for ( int i = 0; i< articulo.size(); i++){
             total += articulo.get(i).getPrecio();
        } 
        return total;
    }

    public void display(){
        System.out.println( "Nombre del cliente : " +  this.nombre );
        for(int i = 0; i<articulo.size();i++){
            System.out.println(articulo.get(i).getNombre()+":" + articulo.get(i).getPrecio());
        }
        System.out.println("Total :" + this.getOrderTotal() );
    }
}