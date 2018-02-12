/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaventanamultipestaña;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author javi-h
 */
public class ChangeListenerTab implements ChangeListener {

    private JTabbedPane panelPestania;
    private JButton close;
    private JPanel contentPanel;
    
    private boolean ContainerHasObject(Component p) {
        
        Component v[] = contentPanel.getComponents();
        
        for (int i = 0; i < v.length; i++) {
            
            if(v[i] == p) return true;
            
        }
        
        return false;
    }
    
    @Override
    public void stateChanged(ChangeEvent e) {
                if (panelPestania.getSelectedIndex() != 0) {
                    if (!ContainerHasObject(close)) {
                        //JOptionPane.showMessageDialog(null, "No tiene el boton cerrar");
                        contentPanel.add(close);
                        close.setVisible(true);
                    }
                } else {
                    if (ContainerHasObject(close)) {
                        //JOptionPane.showMessageDialog(null, "Pestaña principal");
                        close.setVisible(false);
                        contentPanel.remove(close);
                    }
                }
    }
    
    public ChangeListenerTab() {
        super();
    }
    
    public ChangeListenerTab(JTabbedPane tb, JButton b, JPanel p) {
        panelPestania = tb;
        close = b;
        contentPanel = p;
    }
    
}
