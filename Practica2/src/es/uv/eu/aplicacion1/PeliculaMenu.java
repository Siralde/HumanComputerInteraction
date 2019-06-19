/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.aplicacion1;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Rulos
 */
public class PeliculaMenu extends JMenuBar {

    private JMenu file,data;
    private JMenuItem salir, resumen, creador;
    
    public PeliculaMenu() {
        file = new JMenu("Archivo");
        data = new JMenu("Datos");
        salir = new JMenuItem("Salir");
        resumen = new JMenuItem("Resumen");
        creador = new JMenuItem("Creador");
        salir.setActionCommand("ItemSalir");
        resumen.setActionCommand("ItemResumen");
        creador.setActionCommand("ItemCreador");
        file.add(salir);
        data.add(resumen);
        data.add(creador);
        this.add(file);
        this.add(data);
    }
    
    public void setActionListener(ActionListener actionListener) {
        salir.addActionListener(actionListener);
        resumen.addActionListener(actionListener);
        creador.addActionListener(actionListener);
    }
}
