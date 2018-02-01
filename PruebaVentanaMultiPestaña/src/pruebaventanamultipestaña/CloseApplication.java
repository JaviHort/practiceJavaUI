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
    
    int hash;
    JTabbedPane obj;

    @Override
    public void actionPerformed(ActionEvent e) {
        //JOptionPane.showMessageDialog(null, "Cerramos la aplicacion " + hash);
        obj.remove(obj.getSelectedIndex());
    }
    
    public CloseApplication(int id, JTabbedPane p) {
        hash = id;
        obj = p;
    }
    
}
