package ni.edu.uam;

import ni.edu.uam.modelos.Producto;
import ni.edu.uam.servicios.ProductoServicio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductoServicio productos = new ProductoServicio();
        double monto = 0, total = 0;

        productos.agregarProducto("cafe", 3, 40);
        productos.agregarProducto("Tajadas con queso", 3, 60);

        System.out.println("Factura:");
        System.out.println(productos.getProductos());
        System.out.println("Total Pagar: " + productos.getMonto());


    }

}
