/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaventanamultipestaña;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author javi-h
 */
public class Principal extends JFrame {

    //Panel principal contenedor de todo
    private JPanel contentPanel;
    
    //Panel contenedor de las distintas pestañas
    private JTabbedPane panelDePestanias;
      
    //Dimension inicial (y mínima) de la ventana principal
    private Dimension dimension;
    
    /**
     * Constructor por defecto de la clase
     */
    
    public Principal() {
        
        contentPanel = new JPanel();
        panelDePestanias = new JTabbedPane();
        dimension = new Dimension(900, 600);
        _init_();
    }
    
    public void _init_() {
        
        //Al implementar JFrame (extends JFrame) es un JFrame, incorporando todos sus métodos
        
        setTitle("Titulo Ventana");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100, 100, 419, 234);
        setMinimumSize(dimension);
        
        //Creamos GridLayout
        
        GridLayout casillas = new GridLayout(2, 0);
        setLayout(casillas);        
        
        //Inicializamos panel contenedor y lo incluimos en el frame
        
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPanel);
        
        //Creamos un layout (distribución) nulo para posicionar todos los elementos en las posiciones que deseemos
        
        contentPanel.setLayout(casillas);
        
        //Inicializamos el panel de pestañas
        
        panelDePestanias.setBounds(10, 11, 383, 174);
        
        contentPanel.add(panelDePestanias);
        
        JButton close = new JButton("Cerrar pestaña actual");
        close.addActionListener(new CloseApplication(panelDePestanias));
        contentPanel.add(close);
        
        /*ChangeListener que se activa al cambiar de pestaña y que añade o elimina el botón de cerrar pestaña
        al cambiar de la pestaña principal a otras*/
        
        panelDePestanias.addChangeListener(new ChangeListenerTab(panelDePestanias, close, contentPanel));
        
        //Añadimos primer panel al JTabbedPane que será nuestra primera pestaña
        //El identificador Hash será 0 para indicar que es la pestaña principal
        
        Pestania pestania1 = new Pestania(0);
        panelDePestanias.addTab("Pestania principal", null, pestania1, null);
        pestania1.setLayout(new GridLayout(1, 4));
        
        /**
         * Los botones añaden la pestaña correspondiente al botón pulsado (mismo id)
         * 
         * SIGUIENTES PASOS:
         * 
         *  - Impedir que no existan más de 5 pestañas (la principal y las otras 4 que creamos desde la principal)
         *  - Cambiar de posición las pestañas (?)
         *      -> Como consecuencia que el boton de cerrar pestaña se comporte de igual manera (oculto en la principal
         *         y visible en el resto)
         *  - Si pulsamos el botón de "AddTabN" y la pestaña N está ya abierta, cambiar a la pestaña N
         */   
        
        JButton addTab1 = new JButton("Add Tab 1");
        addTab1.addActionListener(new AddNewTab(panelDePestanias, 1));
        pestania1.add(addTab1);
        
        JButton addTab2 = new JButton("Add Tab 2");
        addTab2.addActionListener(new AddNewTab(panelDePestanias, 2));
        pestania1.add(addTab2);
        
        JButton addTab3 = new JButton("Add Tab 3");
        addTab3.addActionListener(new AddNewTab(panelDePestanias, 3));
        pestania1.add(addTab3);
        
        JButton addTab4 = new JButton("Add Tab 4");
        addTab4.addActionListener(new AddNewTab(panelDePestanias, 4));
        pestania1.add(addTab4);
        
        
        //Añadimos etiqueta a la pestaña 1
        
        JLabel taglabel1 = new JLabel("P1");
        taglabel1.setBounds(10, 11, 348, 14);
        pestania1.add(taglabel1);
        
        
        //Añadimos primer panel al JTabbedPane que será nuestra primera pestaña
        
        Pestania pestania2 = new Pestania(1);
        panelDePestanias.addTab("Pestania 2", null, pestania2, null);
        pestania2.setLayout(null);
        
        //Añadimos etiqueta a la pestaña 1
        
        JLabel taglabel2 = new JLabel("P2");
        taglabel2.setBounds(10, 11, 290, 14);
        pestania2.add(taglabel2);
    }
    
}
