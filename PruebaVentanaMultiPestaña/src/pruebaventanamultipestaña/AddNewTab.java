/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaventanamultipestaña;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

/**
 *
 * @author javi-h
 */
public class AddNewTab implements ActionListener {
    
    private JTabbedPane panelPestania;
    private int id;
    
    public AddNewTab() {
        super();
    }
    
    public AddNewTab(JTabbedPane j, int n) {
        super();
        panelPestania = j;
        id = n;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Pestania p = new Pestania(id);
        panelPestania.addTab("Pestania " + p.getId(), null, p, null);
    }
}
