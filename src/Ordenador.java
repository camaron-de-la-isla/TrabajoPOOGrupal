public class Ordenador extends Producto{
    private
    int ram;
    int almacenamiento;
    String sistemaOperativo;
    String marca;
    String modelo;
    String color;

    public Ordenador(int ram, int almacenamiento, String sistemaOperativo, String marca, String modelo, String color, int id, String nombre, double precio) {
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.sistemaOperativo = sistemaOperativo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Ordenador() {
        super();
        this.ram = 0;
        this.almacenamiento = 0;
        this.sistemaOperativo = "";
        this.marca = "";
        this.modelo = "";
        this.color = "";
    }

    public int getRam() {
        return ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
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

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
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

    @Override
    public String toString() {
        return "Ordenador [almacenamiento=" + almacenamiento + ", color=" + color + ", marca=" + marca + ", modelo="
                + modelo + ", ram=" + ram + ", sistemaOperativo=" + sistemaOperativo + "]";
    }
}
