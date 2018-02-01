/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaventanamultipestaña;

import java.awt.EventQueue;

/**
 *
 * @author javi-h
 */
public class MainFrame {
    
    
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
