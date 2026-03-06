package Parcial_Brayan_Arboleda_punto10;
import java.util.Scanner;

public class Almacen {
    public int validarEntero(Scanner sc){
        while(!sc.hasNextInt()){
            System.out.println("Ingrese un numero entero ");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public Producto[][] llenarProductos(int n,Scanner sc){
        int x;
        Almacen a = new Almacen();
        Producto[][] m = new Producto[n][n];
        Producto p = new Producto();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Ingrese el nombre del producto: ");
                p.setNombre(sc.next());
                System.out.println("Ingrese el precio del producto: ");
                p.setPrecio(sc.nextDouble());
                System.out.println("El producto esta en oferta:\nEscriba 1 si esta en oferta \nEscriba 2 si no esta en oferta ");
                x=a.validarEntero(sc);
                if(x==1){
                    p.setOferta("Si");
                }
                else{
                    if(x==2){
                        p.setOferta("No");
                    }
                }
                m[i][j] = p;
            }
        }
        return m;
    }

    public void sabeProducto(Producto[][] m){
        int cont=0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if(m[i][j].getOferta().equals("Si")){
                    cont++;     
                }
  
            }
            
        }
        System.out.println("En total hay: "+cont+" prodcutos en descuento");
    }


}
