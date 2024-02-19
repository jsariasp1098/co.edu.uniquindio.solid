package co.edu.unquindio.solid;


import co.edu.unquindio.solid.model.Usuario;
import co.edu.unquindio.solid.model.guardarUsuario;
import co.edu.unquindio.solid.model.prendaCamisa;
import co.edu.unquindio.solid.service.reporteExcel;
import co.edu.unquindio.solid.service.reporteUsuario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        crearUsuario();
        crearReporteUsuario();
        mostrarPrecio();
    }

    public static void crearUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Juan Sebastian Arias");
        usuario.setID("123456789");
        usuario.setCelular("55555555");
        usuario.setDireccion("calle 8 # 7-22");
        usuario.setEmail("juan@jjjjjua.com");

        System.out.println(usuario.getNombre());
        guardarDB(usuario);
    }
    private static void guardarDB(Usuario usuario) {
        guardarUsuario guardarUsuarioDB = new guardarUsuario();
        guardarUsuarioDB.setNombre(usuario.getNombre());
        guardarUsuarioDB.setID(usuario.getID());
        guardarUsuarioDB.setCelular(usuario.getCelular());
        guardarUsuarioDB.setDireccion(usuario.getDireccion());
        guardarUsuarioDB.setEmail(usuario.getEmail());

        List<guardarUsuario> usuarioDB = new ArrayList<>();
        usuarioDB.add(guardarUsuarioDB);

        System.out.println(usuarioDB);
    }

    public static void crearReporteUsuario(){
        List<Usuario> ordenes = new ArrayList<>();// Llamamos la lista de usuarios de DB

        reporteUsuario usuarios = new reporteUsuario(new reporteExcel());
        usuarios.generarReporte(ordenes);
    }
    public static void mostrarPrecio(){
        prendaCamisa camiseta = new prendaCamisa();
        camiseta.setPrecio(30);
        camiseta.setTipo("Playera");

        camiseta.mostrarPrecio(camiseta);
    }
}
