package ni.edu.uam.interfaces;

import ni.edu.uam.modelos.Producto;

import java.util.List;

public interface ProductoInterface {
    public void agregarProducto(String nombre, int cantidad, double precio);
    public List<Producto> getProductos();
}
