
package com.todocodeacademy.pedidoscarne;

import igu.JMeat;
import java.util.List;
import model.CarneDAO;

public class PedidosCarne {

    public static void main(String[] args) {
        JMeat typeMeat = new JMeat();
        typeMeat.setVisible(true);
        
        CarneDAO carneDAO = new CarneDAO(); 
        List<String> tiposCarne = carneDAO.obtenerTiposCarne();
        
        javax.swing.JComboBox<String> cmbMeat =typeMeat.getCmbMeat();
        for (String tipo : tiposCarne) {
            typeMeat.cmbMeat.addItem(tipo);
        }
    }
}
