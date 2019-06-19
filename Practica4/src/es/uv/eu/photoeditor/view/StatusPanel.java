/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.photoeditor.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author ajgs
 */
public class StatusPanel extends JPanel{
    JLabel radioCirculo;
    JLabel color1;
    JLabel color2;
    Color c1;
    Color c2;
    int radio;
    JTextField indiceRadioCirculo;
    JTextField indiceC1;
    JTextField indiceC2;
    
    public StatusPanel(){
        Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        this.setBorder(border);
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        

        radioCirculo = new JLabel("Radio del Circulo");
        color1 = new JLabel("Color 1");
        color2 = new JLabel("Color 2");
        radio = 20;
        indiceRadioCirculo = new JTextField(3);
        indiceC1 = new JTextField(3);
        indiceC2 = new JTextField(3);
        
        indiceRadioCirculo.setText(""+20);
        indiceC1.setBackground(c1);
        indiceC2.setBackground(c2);
        
        add(Box.createRigidArea(new Dimension(235, 5)));
        add(radioCirculo);
        add(indiceRadioCirculo);
        add(Box.createRigidArea(new Dimension(235, 5)));
        add(color1);
        add(indiceC1);
        add(Box.createRigidArea(new Dimension(235, 5)));
        add(color2);
        add(indiceC2);
        add(Box.createRigidArea(new Dimension(235, 5)));
    }

    void setColor1(Color background) {
        c1 = background;
        indiceC1.setBackground(c1);
    }

    void setColor2(Color background) {
        c2 = background;
        indiceC2.setBackground(c2);
    }
    
    Color getColor1() {
        return c1;
    }

    Color getColor2() {
        return c2;
    }

    void setRadio(int fps) {
        radio = fps;
        indiceRadioCirculo.setText(""+fps);
    }
    
    int getRadio(){
        return radio;
    }
}
