package ni.edu.uam;

import ni.edu.uam.modelos.Producto;
import ni.edu.uam.servicios.ProductoServicio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductoServicio productos = new ProductoServicio();

        JOptionPane.showMessageDialog(null, "Bienvenido a la Cafeteria");
        int option;
        do {

            option = Integer.parseInt(JOptionPane.showInputDialog(null,"1.Comprar \n 2.ver factura \n 3.Salir"));
            switch (option){
                case 1 -> {
                        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto:");
                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad del producto:"));
                        double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del producto:"));
                        productos.agregarProducto(nombre, cantidad, precio);
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null, productos.Factura());
                }


                case 3 -> {
                    JOptionPane.showMessageDialog(null,"Gracias por su compra, vuelva pronto!");
                }
                default ->
                    JOptionPane.showMessageDialog(null,"Opcion no valida, por favor intente de nuevo.");

            }

        }while (option !=3);



    }

}
