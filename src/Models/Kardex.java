
package Models;

import java.time.LocalDateTime;

public class Kardex {
    
    private int idkardex;
    private int idreceptionP;
    private int idventa;
    private String transaccion;
    private LocalDateTime fecha_transac;
    private String descripcion;

    public int getIdkardex() {
        return idkardex;
    }

    public void setIdkardex(int idkardex) {
        this.idkardex = idkardex;
    }

    public int getIdreceptionP() {
        return idreceptionP;
    }

    public void setIdreceptionP(int idreceptionP) {
        this.idreceptionP = idreceptionP;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    public LocalDateTime getFecha_transac() {
        return fecha_transac;
    }

    public void setFecha_transac(LocalDateTime fecha_transac) {
        this.fecha_transac = fecha_transac;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
}
