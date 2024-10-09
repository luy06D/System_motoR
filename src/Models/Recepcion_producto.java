
package Models;

import java.time.LocalDateTime;

public class Recepcion_producto {
    
    private int idreceptionP;
    private int idordencompra;
    private String guia_remision;
    private LocalDateTime fecha_recepcion;

    public int getIdreceptionP() {
        return idreceptionP;
    }

    public void setIdreceptionP(int idreceptionP) {
        this.idreceptionP = idreceptionP;
    }

    public int getIdordencompra() {
        return idordencompra;
    }

    public void setIdordencompra(int idordencompra) {
        this.idordencompra = idordencompra;
    }

    public String getGuia_remision() {
        return guia_remision;
    }

    public void setGuia_remision(String guia_remision) {
        this.guia_remision = guia_remision;
    }

    public LocalDateTime getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(LocalDateTime fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }
    
    
    
}
