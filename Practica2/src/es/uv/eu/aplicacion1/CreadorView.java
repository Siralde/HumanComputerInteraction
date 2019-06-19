/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.aplicacion1;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Rulos
 */
public class CreadorView extends JFrame {

    private PeliculaModel peliculas;
    private PeliculaMenu peliculaMenu;
    private JButton exit;

    public CreadorView(PeliculaModel peliculas) {
        super("Aplicacion 1: Creador de Peliculas");

        this.peliculas = peliculas;
        this.setLayout(new BorderLayout());

        this.setSize(800, 400);

        peliculaMenu = new PeliculaMenu();
        this.setJMenuBar(peliculaMenu);

        exit = new JButton("Salir");
        exit.setActionCommand("buttonExit");

        JLabel label = new JLabel("Aldemaro Gonzalez.");
        label.setFont(new Font("Sans", Font.BOLD, 14));

        this.add(label, BorderLayout.CENTER);
        this.add(exit, BorderLayout.SOUTH);

    }

    public void setActionListener(ActionListener actionListener) {
        exit.addActionListener(actionListener);
        peliculaMenu.setActionListener(actionListener);
    }

}
