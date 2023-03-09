import java.util.List;
import java.util.ArrayList;

public class GestorProductos {
    private List<Producto> productoList;

    public GestorProductos() {
        productoList = new ArrayList<>();
    }

    public void addProducto(Producto producto) {
        productoList.add(producto);
    }

    public List<Producto> obtenerProductos() {
        return productoList;
    }

    public void removeProducto(Producto producto) {
        productoList.remove(producto);
    }

    public void actualizarProducto(Producto producto) {
        for (int i = 0; i < productoList.size(); i++) {
            if (productoList.get(i).getId() == producto.getId()) {
                productoList.set(i, producto);
            }
        }
    }

    public void buscarProducto(String nombre) {
        for (int i = 0; i < productoList.size(); i++) {
            if (productoList.get(i).getNombre().equals(nombre)) {
                System.out.println(productoList.get(i));
            }
        }
    }

    public void buscarProducto(int id) {
        for (int i = 0; i < productoList.size(); i++) {
            if (productoList.get(i).getId() == id) {
                System.out.println(productoList.get(i));
            }
        }
    }


}
