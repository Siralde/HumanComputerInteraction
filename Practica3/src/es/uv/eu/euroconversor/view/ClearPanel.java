package es.uv.eu.euroconversor.view;

import es.uv.eu.euroconversor.model.EuroConversorModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ClearPanel extends JPanel{

    EuroConversorModel model;
    JButton clear;
    
    public ClearPanel(EuroConversorModel model){
        this.model = model;
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(174, 209, 255));
        
        clear = new JButton("Clear");
        add(clear, BorderLayout.CENTER);  
    }

    void setMyActionListener(ActionListener myActionListener) {
        clear.addActionListener(myActionListener);
    }
}