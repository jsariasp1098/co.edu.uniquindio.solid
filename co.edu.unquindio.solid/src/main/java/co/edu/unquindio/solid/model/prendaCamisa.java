package co.edu.unquindio.solid.model;

public class prendaCamisa extends prendaRopa{
    private String genero;
    private String tipo;
    public prendaCamisa() {
    }
    public prendaCamisa(String talla, String material, String color, String marca, double precio, String genero, String tipo) {
        super(talla, material, color, marca, precio);
        this.genero = genero;
        this.tipo = tipo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "prendaCamisa{" +
                "genero='" + genero + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
