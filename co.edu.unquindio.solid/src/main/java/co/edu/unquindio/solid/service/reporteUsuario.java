package co.edu.unquindio.solid.service;

import co.edu.unquindio.solid.model.Usuario;

import java.util.List;

public class reporteUsuario {
    private IreporteUsuarios reporteUsuarioDB;
    public reporteUsuario(IreporteUsuarios reporteUsuario){
       reporteUsuarioDB = reporteUsuario;
    }
    public void generarReporte(List<Usuario> ordenes){
        reporteUsuarioDB.reporteUsuario(ordenes);
    }

}
