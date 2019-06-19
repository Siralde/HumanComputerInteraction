/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.photoeditor.view;

import javax.swing.JPanel;
import es.uv.eu.photoeditor.model.PhotoEditorModel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

/**
 *
 * @author ajgs
 */
public class ImagenPanel extends JPanel {
    
    private PhotoEditorModel model;
    private BufferedImage image; 
    
    public ImagenPanel(PhotoEditorModel modelo){
        this.model = modelo;
        this.image = modelo.getImagen();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g); // Por el overlapping
        g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), this);
    }

    public void setMyMouseListener(MouseListener myMouseListener) {
        this.addMouseListener(myMouseListener);
    }

    public void pintar(int x, int y, int radio, Color color1, Color color2) {
        model.pintaCirculo(x, y, radio, color1, color2);
        this.repaint();
    }

    public void borrar(int x, int y) {
        model.borraImagen(x, y);
        this.repaint();
    }
    
    public void putNewImage(){
        this.image = model.getImagen();
        this.repaint();
    }
    
}
