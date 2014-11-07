/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author rumpierrez
 */
public class MedidaDomain {
    
   private int cantidad;
   private String tipo;
   public int getCantidad() {
      return cantidad;
   }
   public void setCantidad(int cant) {
      this.cantidad = cant;
   }
   public String getTipoMedida() {
      return this.tipo;
   }
   public void setTipoMedida(String tipoMedida) {
      this.tipo = tipoMedida;
   }
}

