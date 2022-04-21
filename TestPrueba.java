import java.util.ArrayList;

public class TestPrueba {
    
    public static void main(String args[]){
    
    // items del menu 
    Articulo articulo1 = new Articulo("moka",3.5);
    Articulo articulo2 = new Articulo("latte",4.0);
    Articulo articulo3 = new Articulo("cafe de goteo",10.0);
    Articulo articulo4 = new Articulo("capuchino",10.0);
 
    // lista de pedidos no especificados 
    Pedido pedido1 = new Pedido();
    Pedido pedido2 = new Pedido();
    //lista de pedidos con nombre especificado 
    Pedido pedido3 = new Pedido("Cinduri");
    Pedido pedido4 = new Pedido("Jimmy");    
    Pedido pedido5 = new Pedido("Noah");

    //simulacion de aplicaciones 
    //agregando articulos a la lista de pedidos 
    pedido1.addArticulo(articulo1);
    pedido1.addArticulo(articulo2);

    pedido2.addArticulo(articulo2);
    pedido2.addArticulo(articulo3);
    
    pedido3.addArticulo(articulo3);
    pedido3.addArticulo(articulo1);
    
    pedido4.addArticulo(articulo4);
    pedido4.addArticulo(articulo3);
    
    //usando el metodo display 
    pedido1.display();
    pedido2.display();
    pedido3.display();
    pedido4.display();
    pedido5.display();

    // modificando el estado de listos 
    pedido1.setListo(true);
    //pedido2.setListo(true);
    pedido3.setListo(true);
    pedido4.setListo(true);
    pedido5.setListo(true);

    //mostrando el estado de los pedidos 
    System.out.println(pedido1.getStatusMessage());
    System.out.println(pedido2.getStatusMessage());
    System.out.println(pedido3.getStatusMessage());
    //visualizacion de los pedidos 
    //mostrar pedido1 
    /*System.out.println("nombre: " + pedido1.getNombre());
    System.out.println("Total: " + pedido1.getTotal());
    System.out.println("Listo: " + pedido1.getListo());
    System.out.println("-------------------------------");
    //mostrar pedido 2
    System.out.println("nombre: " + pedido2.getNombre());
    System.out.println("Total: " + pedido2.getTotal());
    System.out.println("Listo: " + pedido2.getListo());
    System.out.println("-----------------------------------");
    //mostrar pedido3
    System.out.println("nombre: " + pedido3.getNombre());
    System.out.println("Total: " + pedido3.getTotal());
    System.out.println("-----------------------------------");
    //Mostrar pedido4 
    System.out.println("nombre: " + pedido4.getNombre());
    System.out.println("Total: " + pedido4.getTotal());
    System.out.println("-----------------------------------");
    //mostrar el arreglo 
    System.out.println(pedido2.toString());*/
    }
}