package ni.edu.uam.servicios;

import ni.edu.uam.interfaces.ProductoInterface;
import ni.edu.uam.modelos.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoServicio implements ProductoInterface {

    private List<Producto> productos;

    public ProductoServicio() {
        this.productos = new ArrayList<>();
    }

    @Override
    public void agregarProducto(String nombre, int cantidad, double precio) {
        this.productos.add(new Producto(nombre, cantidad, precio));

    }

    @Override
    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public boolean EliminarProducto(String nombre) {
        Producto miProducto = new Producto();
        return productos.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre));
    }

    @Override
    public boolean EditarProducto(String nombre, int nuevaCantidad, double nuevoPrecio) {
            for (Producto p : productos) {
                if (p.getNombre().equalsIgnoreCase(nombre)) {
                    p.setCantidad(nuevaCantidad);
                    p.setPrecio(nuevoPrecio);
                    return true;
                }
            }
            return false;
    }


    @Override
    public boolean BuscarProducto(String nombre, int cantidad, double precio) {
        Producto miProducto = new Producto(nombre,cantidad,precio);
        return productos.contains(miProducto);

    }

    public boolean buscarProducto(String nombre){
        for (Producto producto : productos){
            if(producto.getNombre().equalsIgnoreCase(nombre)) return true;
        }
        return false;
    }


    public double getMonto(){
        double total= 0, monto= 0;
        for(Producto producto: productos){
            total=producto.getCantidad()*producto.getPrecio();
            monto+=total;


        }
        return monto;
    }



    public StringBuilder Factura() {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Factura:\n");
        for (Producto producto : productos) {
            mensaje.append(producto.getNombre());
            mensaje.append(" | ");
            mensaje.append(producto.getCantidad());
            mensaje.append(" | ");
            mensaje.append(producto.getPrecio());
            mensaje.append(" | ");
            mensaje.append(getMonto());
            mensaje.append("\n");
        }
        return mensaje;
    }

}
