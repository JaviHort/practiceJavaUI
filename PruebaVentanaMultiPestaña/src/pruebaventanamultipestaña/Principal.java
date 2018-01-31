/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaventanamultipestaña;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
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
        //add(new JButton("1"));
        //add(new JButton("2"));
        
        JFrame j = new JFrame();
        
        
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
        contentPanel.add(new JButton("Boton"));
        
        //Añadimos primer panel al JTabbedPane que será nuestra primera pestaña
        
        JPanel pestania1 = new JPanel();
        panelDePestanias.addTab("Pestania 1", null, pestania1, null);
        pestania1.setLayout(null);
        
        
        //Añadimos etiqueta a la pestaña 1
        
        JLabel taglabel1 = new JLabel("P1");
        taglabel1.setBounds(10, 11, 348, 14);
        pestania1.add(taglabel1);
        
        
        //Añadimos primer panel al JTabbedPane que será nuestra primera pestaña
        
        JPanel pestania2 = new JPanel();
        panelDePestanias.addTab("Pestania 2", null, pestania2, null);
        pestania2.setLayout(null);
        
        //Añadimos etiqueta a la pestaña 1
        
        JLabel taglabel2 = new JLabel("P2");
        taglabel2.setBounds(10, 11, 290, 14);
        pestania2.add(taglabel2);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*JFrame ventIni = new JFrame("Ventana inicial");
        JButton jb = new JButton("Boton");
        jb.setSize(20, 20);
        
        ventIni.setSize(400, 400);
        ventIni.setVisible(true);
        ventIni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridLayout gl = new GridLayout(3, 2);*/
        
        //Arrancamos hilo de ejecución
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    // creando el frame y lo muestra
                    Principal frame = new Principal();
                    frame.setVisible(true);
                } catch (Exception e){
                   e.printStackTrace();
                }
                }
        });
        
    }
    
}
