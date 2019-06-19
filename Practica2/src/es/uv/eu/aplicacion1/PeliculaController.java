/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.aplicacion1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Rulos
 */
public class PeliculaController {

    private PeliculaModel model;
    private PeliculaView view;
    private ResumenView viewR;
    private CreadorView viewC;

    public PeliculaController(PeliculaModel model, PeliculaView view, ResumenView viewR, CreadorView viewC) {
        this.model = model;
        this.view = view;
        this.viewR = viewR;
        this.viewC = viewC;

        view.addWindowListener(new PeliculaControllerWindowListener());
        view.setActionListener(new PeliculaControllerActionListener());
        viewR.setActionListener(new PeliculaControllerActionListener());
        viewC.setActionListener(new PeliculaControllerActionListener());
    }

    class PeliculaControllerWindowListener extends WindowAdapter {

        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("PeliculaController: Cerrar ventana.");
            System.exit(0);
        }

    }

    class PeliculaControllerActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            switch (command) {
                case "buttonExit":
                    System.out.println("PeliculaController: Boton 'salir'.");
                    System.exit(0);
                    break;
                case "ItemSalir":
                    System.out.println("PelicullaController: Menu 'salir'.");
                    System.exit(0);
                    break;
                case "ItemResumen":
                    System.out.println("PelicullaController: Menu 'resumen'.");
                    System.out.println("Numero de elemtos: " + model.getNumElementos());
                    System.out.println("La mas antigua es del anyo: " + model.getAntigua());
                    System.out.println("La mas moderna es del anyo: " + model.getNueva());
                    view.dispose();
                    viewC.dispose();
                    viewR.setVisible(true);
                    break;
                case "ItemCreador":
                    System.out.println("PelicullaController: Menu 'creador'.");
                    view.dispose();
                    viewC.setVisible(true);
                    viewR.dispose();
                    break;
                default:
                    System.out.println("PeliculaController: Comando'" + command + "' no reconocido.");
                    break;
            }
        }

    }
}
