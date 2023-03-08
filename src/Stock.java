public class Stock {
    private
    Producto producto;
    int cantidad;

    public Stock(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Stock() {
        this.producto = new Producto();
        this.cantidad = 0;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Stock [cantidad=" + cantidad + ", producto=" + producto + "]";
    }
}
