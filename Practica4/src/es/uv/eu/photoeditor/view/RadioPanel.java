/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.photoeditor.view;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeListener;

/**
 *
 * @author ajgs
 */
public class RadioPanel extends JPanel{

    private JLabel etiqueta;
    private JSlider radioCirculo;
    
    public RadioPanel(){
        this.setLayout(new BorderLayout());
        
        Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        this.setBorder(border);
        
        etiqueta = new JLabel("Grosor del Circulo:");
        radioCirculo = new JSlider(1, 1001);
        radioCirculo.setMinorTickSpacing(1);
        radioCirculo.setMajorTickSpacing(100);
        radioCirculo.setPaintTicks(true);
        radioCirculo.setPaintLabels(true);
        radioCirculo.setFont(new Font("Sans", Font.BOLD, 10));
        radioCirculo.setValue(20);
        
        
        this.add(etiqueta, BorderLayout.NORTH);
        this.add(radioCirculo, BorderLayout.CENTER);

    }

    void setMyChangeListener(ChangeListener myChangeListener) {
        radioCirculo.addChangeListener(myChangeListener);
    }
    
}
