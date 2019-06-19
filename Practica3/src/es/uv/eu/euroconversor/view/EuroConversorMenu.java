package es.uv.eu.euroconversor.view;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class EuroConversorMenu extends JMenuBar{
    
    private JMenu file;
    private JMenuItem salir, changeRate;
    
    public EuroConversorMenu(){
        file = new JMenu("Calculadora");
        salir = new JMenuItem("Salir");
        changeRate = new JMenuItem("ChangeRate");

        file.add(salir);
        file.add(changeRate);

        this.add(file);
    }

    void setMyActionListener(ActionListener myActionListener) {
        salir.addActionListener(myActionListener);
        changeRate.addActionListener(myActionListener);
    }
    
    public String nuevoConversionRate(){
        String newExchange;
        newExchange = JOptionPane.showInputDialog(null, "Enter new exchange rate:");
        return newExchange;
    }
}
