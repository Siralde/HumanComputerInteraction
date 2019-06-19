/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.photoeditor.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author ajgs
 */
public class ColorPanel extends JPanel{
    
    JLabel nombre;
    private final JButton[] botones;
    private static final String[] nombreColores = {"Cyan","Gris","Magenta","Rosa","Blanco","Azul","Negro","Gris Oscuro","Gris Claro","Naranja","Amarillo","Rojo","Verde"};
    private static final Color[] colores = {Color.CYAN,Color.GRAY,Color.MAGENTA,Color.PINK,Color.WHITE,Color.blue,Color.BLACK,Color.DARK_GRAY,Color.LIGHT_GRAY,Color.ORANGE,Color.YELLOW,Color.RED,Color.GREEN};
//    private UIManager.LookAndFeelInfo[] info;
    
    public ColorPanel(String nombreLabel, int num){
       this.setLayout(new GridLayout(7, 2));
       botones = new JButton[13];
       nombre = new JLabel(nombreLabel);   
       
//       info = UIManager.getInstalledLookAndFeels();
//       for(int i = 0; i < info.length; i++)
//       {
//           System.out.println(info[i].getName());
//       }
//        try {
//            UIManager.setLookAndFeel(info[0].getClassName());
//        } catch (Exception e) {
//            System.out.println("FUCKK");
//        }

       
       add(nombre);
       crearBotones(num);
    }

    private void crearBotones(int num) {
        int name;
        for(int i = 0; i < colores.length; i++)
        {
            botones[i] = new JButton(nombreColores[i]); //Crea un Boton con el nombre del color
            
            //Pinta el Boton del color correspondinte en Mac 
            //Si fuera en windows basta con el setBackground
            botones[i].setBackground(colores[i]);
            botones[i].setOpaque(true);
            botones[i].setBorderPainted(false);
            
            name = num + i;
            botones[i].setActionCommand("" + name);
            
            switch(i){
                case 5:
                case 6:
                case 7:
                    botones[i].setForeground(Color.WHITE);
            }

            add(botones[i]);
        }
    }

    void setMyActionListener(ActionListener myActionListener) {
        for(int i = 0; i < colores.length; i++)
        {
            botones[i].addActionListener(myActionListener);
        }
    }
}
