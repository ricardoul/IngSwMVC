/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.HashMap;
import java.util.Map;

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
  public void vistaction(String valorinicial,String tipoinicial,String tipofinal)
          
  {
     String resultado= resultado(Integer.parseInt(valorinicial),tipoinicial, tipofinal);
     updateView(resultado);
  }
  public String resultado(Integer valorinicial,String tipoinicial,String tipofinal)
  {
      
     Map<String, Integer> map = new HashMap<String, Integer>();
     map.put("km-km", 1);
     //TODO AGREGAR TODAS LAS MEDIDAS FALTANTES
     String key = tipoinicial+"-"+tipofinal;
     Integer aux = map.get(key);
     Integer result= valorinicial*aux;
     return result.toString();

  }
   public void updateView(String resultado){	
       
     view.updateStatus(resultado);
   }	
}

