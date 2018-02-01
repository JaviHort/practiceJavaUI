/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaventanamultipestaña;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author javi-h
 */
public class AddNewTab implements ActionListener {
    
    private int hash;
    
    public AddNewTab() {
        super();
    }
    
    public AddNewTab(int id) {
        hash = id;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
