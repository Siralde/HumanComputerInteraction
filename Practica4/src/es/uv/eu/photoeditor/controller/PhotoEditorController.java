/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.photoeditor.controller;

import es.uv.eu.photoeditor.model.PhotoEditorModel;
import es.uv.eu.photoeditor.view.PhotoEditorView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author ajgs
 */
public class PhotoEditorController {
    
    PhotoEditorView view;
    PhotoEditorModel model;
    
    public PhotoEditorController(PhotoEditorView view, PhotoEditorModel model){
        this.view = view;
        this.model = model;
        
        MyActionListener myActionListener = new MyActionListener();
        MyMouseListener myMouseListener = new MyMouseListener();
        MyChangeListener myChangeListener = new MyChangeListener();
        
        view.setMyActionListener(myActionListener);
        view.setMyMouseListener(myMouseListener);
        view.setMyChangeListener(myChangeListener);
    }
    
    public class MyActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {

            JButton botonColores;
            
            switch(event.getActionCommand()){
                case "Salir":
                    System.exit(0);
                break;
                case "Cargar Imagen":
                    model.loadImagen(view.loadImage());
                    view.putNewImage();
                break;
                case "Guardar Imagen":
                    model.saveImagen(view.saveImage());
                break;
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "10":
                case "11":
                case "12":
                    botonColores = (JButton) event.getSource();
                    view.setColor1(botonColores.getBackground());
                //TRAERME EL OBJECTO Y PASARLE LOS COLORES 
                break;
                case "13":
                case "14":
                case "15":
                case "16":
                case "17":
                case "18":
                case "19":
                case "20":
                case "21":
                case "22":
                case "23":
                case "24":
                case "25":
                    botonColores = (JButton) event.getSource();
                    view.setColor2(botonColores.getBackground());
                //TRAERME EL OBJECTO Y PASARLE LOS COLORES 
                break;
            }
        } 
    }
    
    public class MyMouseListener extends MouseAdapter{

        @Override
        public void mouseClicked(MouseEvent e) {
            
            int x = e.getX();
            int y = e.getY();
//            System.out.println(x + ", " + y);
            
            switch(e.getButton()){
                case 1:
                    view.pintar(x,y);
                break;
                case 3:
                    view.borrar(x,y);
                break;
            }
        }   
    }
    
    public class MyChangeListener implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
            JSlider source = (JSlider) e.getSource();

            if (!source.getValueIsAdjusting()) {
                int fps = (int)source.getValue();
                view.setRadio(fps);
            }    
        }
    }
}
