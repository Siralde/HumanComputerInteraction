package es.uv.eu.euroconversor.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

public class NumberPanel extends JPanel{

    ArrayList<JButton> botones;
    
    public NumberPanel(){
        
        botones = new ArrayList<JButton>();
        
        this.setLayout(new GridLayout(3,8));
        this.setBackground(new Color(174, 209, 255));
           
        crearBotones();
        agregarBotones();
    }
    
    public void crearBotones(){
        
        JButton boton;
        String nombreBoton;
            
        for(int i = 0; i < 10; i++)
        {
            nombreBoton = Integer.toString(i);
            boton = new JButton(nombreBoton);
            botones.add(boton);
        }
        
        botones.add(new JButton("."));
        botones.add(new JButton("C"));
    }
    
    
    public void agregarBotones(){    
        for(JButton oneButton : botones)
        {
            add(oneButton);
        }
    }

    void setMyActionListener(ActionListener myActionListener) {
        for(JButton oneButton : botones)
        {
            oneButton.addActionListener(myActionListener);
        }
    }
}