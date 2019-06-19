package es.uv.eu.euroconversor.view;

import es.uv.eu.euroconversor.model.EuroConversorModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DisplayPanel extends JPanel{
 
    EuroConversorModel modelo;
    DisplayPrincipal displayPrincipal;
    DisplaySecundario displaySecundario;
    
    public DisplayPanel(EuroConversorModel modelo){
        
        this.modelo = modelo;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
 
        
        displayPrincipal = new DisplayPrincipal("0");
        add(displayPrincipal);
    
        
        displaySecundario = new DisplaySecundario(this.modelo.getExchangeRate());
        add(displaySecundario);
    }

    void nuevoNumeroDisplay(String newNumber) {
        displayPrincipal.nuevoNumeroDisplay(newNumber);
    }

    void resetearDisplay() {
        displayPrincipal.nuevoNumeroDisplay("0");
    }

    void mostrarNuevaConversion(String nuevaConversion) {
        displayPrincipal.nuevoNumeroDisplay(nuevaConversion);
    }

    void changeExchangeDisplay(String newExchangeRate) {
        displaySecundario.nuevoExchangeDisplay(newExchangeRate);
    }
    
    class DisplayPrincipal extends JPanel{
        JLabel displayPrincipal;
        DisplayPrincipal(String string){
            displayPrincipal = new JLabel(string);
            this.setLayout(new BorderLayout());
            this.setBackground(Color.GREEN);
            
            displayPrincipal.setFont(new Font("Sans", Font.BOLD, 40));
            add(displayPrincipal, BorderLayout.EAST);
            
        }

        private void nuevoNumeroDisplay(String newNumber) {
            displayPrincipal.setText(newNumber);        
        }
    }
    
    class DisplaySecundario extends JPanel{
        JLabel displaySecundario;

        DisplaySecundario(String string){
            displaySecundario = new JLabel("Exchange rate: " + string);

            this.setLayout(new BorderLayout());
            this.setBackground(Color.GREEN);
            
            add(displaySecundario, BorderLayout.WEST);
        }

        private void nuevoExchangeDisplay(String newNumber) {
            displaySecundario.setText("Exchange rate: " + newNumber);        
        }
    }
}
