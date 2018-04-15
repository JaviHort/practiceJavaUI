/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaventanamultipestaña;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author javi-h
 */
public class CloseApplication implements ActionListener {
    
    SubMenusContainer obj;
    
    /**
     * En esta clase se elimina la pestaña en primer plano
     */
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //obj.getSelectedIndex() devuelve la pestaña en primer plano
        if (obj.getSelectedIndex() > 0) obj.remove(obj.getSelectedIndex());
    }
   
    /**
     * 
     * @param p -> JTabbedPane (panel de pestañas) contenedor de todas las pestañas
     */
    
    public CloseApplication(SubMenusContainer p) {
        obj = p;
    }
    
}
