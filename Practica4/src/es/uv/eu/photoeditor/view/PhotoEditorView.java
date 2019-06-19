/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.photoeditor.view;

import es.uv.eu.photoeditor.model.PhotoEditorModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.event.ChangeListener;

/**
 *
 * @author ajgs
 */
public class PhotoEditorView extends JFrame{
    
    PhotoEditorModel model;
    PhotoEditorMenuBar menu;
    StatusPanel statusPanel;
    SelectPanel selectPanel;
    RadioPanel radioPanel;
    ImagenPanel imagenPanel;
    LoadImage load;
    SaveImage save;
    
    public PhotoEditorView(PhotoEditorModel modelo){
        model = new PhotoEditorModel();
        menu = new PhotoEditorMenuBar();
        statusPanel = new StatusPanel();
        selectPanel = new SelectPanel();
        radioPanel = new RadioPanel();
        imagenPanel = new ImagenPanel(modelo);
        load = new LoadImage();
        save = new SaveImage();

        this.setLayout(new BorderLayout());
        
        model = modelo;
        this.setJMenuBar(menu);
        this.add(statusPanel, BorderLayout.NORTH);
        this.add(selectPanel, BorderLayout.WEST);
        this.add(radioPanel, BorderLayout.SOUTH);
        this.add(imagenPanel, BorderLayout.CENTER);
    }

    public void setMyActionListener(ActionListener myActionListener) {
        menu.setMyActionListener(myActionListener);
        selectPanel.setMyActionListener(myActionListener);
    }

    public void setColor1(Color background) {
        statusPanel.setColor1(background);
    }
    
    public void setColor2(Color background) {
        statusPanel.setColor2(background);
    }
    
    public Color getColor1(){
        return statusPanel.getColor1();
    }
    public Color getColor2(){
        return statusPanel.getColor2();
    }

    public void setMyMouseListener(MouseListener myMouseListener) {
        imagenPanel.setMyMouseListener(myMouseListener);
    }

    public void pintar(int x, int y) {
        imagenPanel.pintar(x, y, this.getRadio(), this.getColor1(), this.getColor2()); 
    
    }

    public void borrar(int x, int y) {
        imagenPanel.borrar(x, y);
    }

    public void setMyChangeListener(ChangeListener myChangeListener) {
        radioPanel.setMyChangeListener(myChangeListener);
    }

    public void setRadio(int fps) {
        statusPanel.setRadio(fps);
    }
    
    public int getRadio(){
        return statusPanel.getRadio();
    }

    public File loadImage() {
        return load.getFile();
    }
    
    public void putNewImage(){
        imagenPanel.putNewImage();
    }

    public File saveImage() {
        return save.getFile();
    }
}
