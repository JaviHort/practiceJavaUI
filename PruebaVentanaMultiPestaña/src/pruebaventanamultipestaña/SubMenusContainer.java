/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaventanamultipestaña;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author javi-h
 */
public class SubMenusContainer extends JTabbedPane {
    
    private boolean _dragging = false;
    private Image tabImage = null;
    private Point currMousePos = null;
    private int indDragged = 0;
    
    public SubMenusContainer() {
        super();
        setBounds(10, 11, 383, 174);
        
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                if(!_dragging) {
                    // Gets the tab index based on the mouse position
                    int tabIndex = getUI().tabForCoordinate(SubMenusContainer.this, e.getX(), e.getY());

                    if(tabIndex > 0) {
                        indDragged = tabIndex;
                        Rectangle bounds = getUI().getTabBounds(SubMenusContainer.this, tabIndex);


                        Image totalImage = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
                        Graphics totalGraphics = totalImage.getGraphics();
                        totalGraphics.setClip(bounds);

                        setDoubleBuffered(false);
                        paintComponent(totalGraphics);


                        tabImage = new BufferedImage(bounds.width, bounds.height, BufferedImage.TYPE_INT_ARGB);
                        Graphics graphics = tabImage.getGraphics();
                        graphics.drawImage(totalImage, 0, 0, bounds.width, bounds.height, bounds.x, bounds.y, bounds.x + bounds.width, bounds.y+bounds.height, SubMenusContainer.this);

                        _dragging = true;
                        repaint();
                    }

                } else {
                    currMousePos = e.getPoint();
                    repaint();
                }

                super.mouseDragged(e);
            }
        });

        addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                if(_dragging) {
                    int tabIndex = getUI().tabForCoordinate(SubMenusContainer.this, e.getX(), 10);
                    if(tabIndex > 0) {
                        Component comp = getComponentAt(indDragged);
                        String title = getTitleAt(indDragged);
                        removeTabAt(indDragged);
                        insertTab(title, null, comp, null, tabIndex);
                    }
                }

                _dragging = false;
                tabImage = null;
            }
        });
    }
    
    public void addTabChangedListener(JButton close, JPanel contentPanel) {
        addChangeListener(new ChangeListenerTab(this, close, contentPanel));
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if(_dragging && currMousePos != null && tabImage != null) {
            g.drawImage(tabImage, currMousePos.x, currMousePos.y, this);
        }
    }
    
    
}
