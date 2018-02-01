/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaventanamultipestaña;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author javi-h
 */
public class Principal extends JFrame {

    //Panel principal contenedor de todo
    private JPanel contentPanel;
    
    //Panel contenedor de las distintas pestañas
    private JTabbedPane panelDePestanias;
    
    /**
     * Constructor por defecto de la clase
     */
    
    public Principal() {
        
        //Al implementar JFrame (extends JFrame) es un JFrame, incorporando todos sus métodos
        
        setTitle("Titulo Ventana");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100, 100, 419, 234);
        
        //Creamos GridLayout
        
        GridLayout casillas = new GridLayout(2, 0);
        setLayout(casillas);        
        
        //Inicializamos panel contenedor y lo incluimos en el frame
        
        contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPanel);
        
        
        //Creamos un layout (distribución) nulo para posicionar todos los elementos en las posiciones que deseemos
        
        contentPanel.setLayout(casillas);
        
        //Inicializamos el panel de pestañas
        
        panelDePestanias = new JTabbedPane();
        panelDePestanias.setBounds(10, 11, 383, 174);
        contentPanel.add(panelDePestanias);
        
        JButton close = new JButton("Boton");
        close.addActionListener(new CloseApplication(panelDePestanias));
        contentPanel.add(close);
        
        //Añadimos primer panel al JTabbedPane que será nuestra primera pestaña
        //El identificador Hash será 0 para indicar que es la pestaña principal
        
        Pestania pestania1 = new Pestania(0);
        panelDePestanias.addTab("Pestania principal", null, pestania1, null);
        pestania1.setLayout(new GridLayout(1, 4));
        
        JButton addTab1 = new JButton("Add Tab 1");
        addTab1.addActionListener(new AddNewTab(1));
        pestania1.add(addTab1);
        
        JButton addTab2 = new JButton("Add Tab 2");
        addTab2.addActionListener(new AddNewTab(2));
        pestania1.add(addTab2);
        
        JButton addTab3 = new JButton("Add Tab 3");
        addTab3.addActionListener(new AddNewTab(3));
        pestania1.add(addTab3);
        
        JButton addTab4 = new JButton("Add Tab 4");
        addTab4.addActionListener(new AddNewTab(4));
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
