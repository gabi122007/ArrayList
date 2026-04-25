package ni.edu.uam.interfaces;

import ni.edu.uam.modelos.Producto;

import java.util.List;

public interface ProductoInterface {
    public void agregarProducto(String nombre, int cantidad, double precio);
    public List<Producto> getProductos();
    public boolean EliminarProducto(String nombre);
    public boolean EditarProducto(String nombre, int nuevaCantidad, double nuevoPrecio);
    public boolean BuscarProducto(String nombre, int cantidad, double precio);
}
