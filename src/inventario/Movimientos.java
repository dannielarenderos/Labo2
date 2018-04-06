/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

/**
 *
 * @author Danniela Renderos
 */
public class Movimientos {
    
    private String codigoMov;
    private String tipoMov;
    private String codProveedor;
    private String codProducto;
    private String cantProducto;
    private float total;
    
    public Movimientos(){};

    public String getCodigoMov() {
        return codigoMov;
    }

    public void setCodigoMov(String codigoMov) {
        this.codigoMov = codigoMov;
    }

    public String getTipoMov() {
        return tipoMov;
    }

    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
    }

    public String getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(String codProveedor) {
        this.codProveedor = codProveedor;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getCantProducto() {
        return cantProducto;
    }

    public void setCantProducto(String cantProducto) {
        this.cantProducto = cantProducto;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
    
}
