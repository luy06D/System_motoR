
package Models;

import java.time.LocalDateTime;

public class Orden_compras {
    private int idordencompra;
    private int idprovedor;
    private String num_ordenC;
    private double total_costos;
    private String estado;
    private LocalDateTime create_at;

    public int getIdordencompra() {
        return idordencompra;
    }

    public void setIdordencompra(int idordencompra) {
        this.idordencompra = idordencompra;
    }

    public int getIdprovedor() {
        return idprovedor;
    }

    public void setIdprovedor(int idprovedor) {
        this.idprovedor = idprovedor;
    }

    public String getNum_ordenC() {
        return num_ordenC;
    }

    public void setNum_ordenC(String num_ordenC) {
        this.num_ordenC = num_ordenC;
    }

    public double getTotal_costos() {
        return total_costos;
    }

    public void setTotal_costos(double total_costos) {
        this.total_costos = total_costos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getCreate_at() {
        return create_at;
    }

    public void setCreate_at(LocalDateTime create_at) {
        this.create_at = create_at;
    }
    
    
    
}   
