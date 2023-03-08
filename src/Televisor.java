public class Televisor extends Producto{
    private
    int pulgadas;
    String marca;
    String modelo;
    String color;
    double precio;

    public Televisor(int pulgadas, String marca, String modelo, String color, double precio, int id, String nombre, double precio2) {
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public Televisor() {
        this.pulgadas = 0;
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.precio = 0.0;

    }

    public int getPulgadas() {
        return pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Televisor [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
                + ", pulgadas=" + pulgadas + "]";
    }
}
