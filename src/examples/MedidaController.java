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
public class MedidaController {
    
   private MedidaDomain model;
   private MedidaView view;

   public MedidaController(MedidaDomain model, MedidaView view){
      this.model = model;
      this.view = view;
   }

   public void setTipo(String tipo){
      model.setTipoMedida(tipo);		
   }

   public String getTipo(){
      return model.getTipoMedida();		
   }

   public void setCantidad(int cant){
      model.setCantidad(cant);		
   }

   public int getCantidad(){
      return model.getCantidad();		
   }
 public void updateDomain(int cantidad,String tipo){
      model.setCantidad(cantidad);
      model.setTipoMedida(tipo);
      updateView();
      
   }
   public void updateView(){	
       
     view.updateStatus(model.getCantidad(), model.getTipoMedida());
   }	
}

