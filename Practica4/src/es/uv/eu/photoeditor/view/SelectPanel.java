/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.photoeditor.view;

import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author ajgs
 */
public class SelectPanel extends JPanel{
    ColorPanel colorPanel1;
    ColorPanel colorPanel2;
    
    public SelectPanel(){
        
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        this.setBorder(border);
        
        colorPanel1 = new ColorPanel("Color 1:", 0);
        colorPanel2 = new ColorPanel("Color 2:", 13);
        
        add(colorPanel1);
        add(colorPanel2);        
    }

    void setMyActionListener(ActionListener myActionListener) {
        colorPanel1.setMyActionListener(myActionListener);
        colorPanel2.setMyActionListener(myActionListener);
    }
}
