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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (hash == 0) {
            JOptionPane.showMessageDialog(null, "Cerramos la aplicacion principal");
        } else {
            JOptionPane.showMessageDialog(null, "Cerramos otra pestaña");
        }
    }
    
    public CloseApplication(int id) {
        hash = id;
    }
    
}
