package es.uv.eu.euroconversor.view;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class OperationPanel extends JPanel{

    JButton convertir;
    
    public OperationPanel(){
        
        this.setBackground(new Color(174, 209, 255));
        
        convertir = new JButton("Convertir");
        add(convertir);
    }

    void setMyActionListener(ActionListener myActionListener) {
        convertir.addActionListener(myActionListener);
    }

}