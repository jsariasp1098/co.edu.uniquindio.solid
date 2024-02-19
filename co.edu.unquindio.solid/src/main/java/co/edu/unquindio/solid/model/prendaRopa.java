package co.edu.unquindio.solid.model;

public class prendaRopa{
    private String talla;
    private String material;
    private String color;
    private String marca;
    private double precio;
    public prendaRopa() {
    }
    public prendaRopa(String talla, String material, String color, String marca,double precio) {
        this.talla = talla;
        this.material = material;
        this.color = color;
        this.marca = marca;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getTalla() {
        return talla;
    }
    public void setTalla(String talla) {
        this.talla = talla;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void mostrarPrecio(prendaRopa prenda){
        System.out.println("El precio de la prenda es:"+ prenda.getPrecio());
    }

}
