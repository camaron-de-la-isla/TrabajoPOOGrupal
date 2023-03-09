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

    public String getNombre() {
        return producto.getNombre();
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getId() {
        return producto.getId();
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void addCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    public void removeCantidad(int cantidad) {
        this.cantidad -= cantidad;
    }

    public void actualizarCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void buscarCantidad(int cantidad) {
        if (this.cantidad == cantidad) {
            System.out.println(this);
        }
    }

    public void buscarCantidad(int cantidad, String operador) {
        switch (operador) {
            case ">":
                if (this.cantidad > cantidad) {
                    System.out.println(this);
                }
                break;
            case "<":
                if (this.cantidad < cantidad) {
                    System.out.println(this);
                }
                break;
            case ">=":
                if (this.cantidad >= cantidad) {
                    System.out.println(this);
                }
                break;
            case "<=":
                if (this.cantidad <= cantidad) {
                    System.out.println(this);
                }
                break;
            case "==":
                if (this.cantidad == cantidad) {
                    System.out.println(this);
                }
                break;
            case "!=":
                if (this.cantidad != cantidad) {
                    System.out.println(this);
                }
                break;
            default:
                System.out.println("Operador no válido");
                break;
        }
    }



    @Override
    public String toString() {
        return "Stock [cantidad=" + cantidad + ", producto=" + producto + "]";
    }
}
