/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.photoeditor.view;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author ajgs
 */
public class PhotoEditorMenuBar extends JMenuBar {
    JMenu archivo;
    JMenuItem cargarImagen, guardarImagen, salir;
    
    public PhotoEditorMenuBar(){
        archivo = new JMenu("Archivo");
        cargarImagen = new JMenuItem("Cargar Imagen");
        guardarImagen = new JMenuItem("Guardar Imagen");
        salir = new JMenuItem("Salir");

        archivo.add(cargarImagen);
        archivo.add(guardarImagen);
        archivo.add(salir);
        this.add(archivo);
    }

    void setMyActionListener(ActionListener myActionListener) {
        salir.addActionListener(myActionListener);
        cargarImagen.addActionListener(myActionListener);
        guardarImagen.addActionListener(myActionListener);
    }
}
