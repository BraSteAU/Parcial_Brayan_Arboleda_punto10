package Parcial_Brayan_Arboleda_punto10;
import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Almacen a = new Almacen();
        int n;
        System.out.println("Ingrese la dimension del almacen ");
        n=sc.nextInt();
        Producto[][] p = new Producto[n][n];
        p = a.llenarProductos(n, sc);
        a.sabeProducto(p);
    }
}
