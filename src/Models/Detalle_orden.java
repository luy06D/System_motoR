
package Models;

public class Detalle_orden {
    private int iddetalle_orden;
    private int idordencompra;
    private int idrepuesto;
    private int cantidad;
    private double precio_unitario;


    public int getIddetalle_orden() {
        return iddetalle_orden;
    }

    public void setIddetalle_orden(int iddetalle_orden) {
        this.iddetalle_orden = iddetalle_orden;
    }

    public int getIdordencompra() {
        return idordencompra;
    }

    public void setIdordencompra(int idordencompra) {
        this.idordencompra = idordencompra;
    }

    public int getIdrepuesto() {
        return idrepuesto;
    }

    public void setIdrepuesto(int idrepuesto) {
        this.idrepuesto = idrepuesto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }


}
