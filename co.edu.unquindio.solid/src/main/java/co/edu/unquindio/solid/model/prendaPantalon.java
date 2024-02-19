package co.edu.unquindio.solid.model;

public class prendaPantalon extends prendaRopa{
    private String genero;

    public prendaPantalon() {
    }
    public prendaPantalon(String talla, String material, String color, String marca, double precio, String genero) {
        super(talla, material, color, marca, precio);
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
