package co.edu.unquindio.solid.model;

public class ventaProducto {
    private final IgestionClientes cliente;
    private final IgestionInventario producto;
    public ventaProducto(IgestionClientes cliente, IgestionInventario producto) {
        this.cliente = cliente;
        this.producto = producto;
    }
    public void procesarPedido(){
        
    }
}
