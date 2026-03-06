package Parcial_Brayan_Arboleda_punto10;
public class Producto{
    private String Nombre;
    private double Precio;
    //private boolean Oferta;
    private String Oferta;

    public Producto(){

    }

  

    /*public Producto(String nombre, double precio, boolean oferta) {
        Nombre = nombre;
        Precio = precio;
        Oferta = oferta;
    }*/



    public Producto(String nombre, double precio, String oferta) {
        Nombre = nombre;
        Precio = precio;
        Oferta = oferta;
    }



    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }



    public String getOferta() {
        return Oferta;
    }



    public void setOferta(String oferta) {
        Oferta = oferta;
    }



    /*public boolean isOferta() {
        return Oferta;
    }



    public void setOferta(boolean oferta) {
        Oferta = oferta;
    }*/
    
   
    
    
}