package es.uv.eu.euroconversor.view;

import es.uv.eu.euroconversor.controller.EuroConversorController;
import es.uv.eu.euroconversor.model.EuroConversorModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import javax.swing.JFrame;

public class EuroConversorView extends JFrame{
    
    EuroConversorModel modelo;
    EuroConversorMenu menu;
    DisplayPanel displayPanel;
    NumberPanel numberPanel;
    OperationPanel operationPanel;
    ClearPanel clearPanel;
    
    public EuroConversorView(EuroConversorModel modelo){
        
        this.modelo = modelo;
        
        this.setLayout(new BorderLayout());
        this.setSize(500, 300);
    
        
        menu = new EuroConversorMenu();
        this.setJMenuBar(menu);
        
        displayPanel = new DisplayPanel(modelo);
        this.add(displayPanel, BorderLayout.NORTH);
        
        numberPanel = new NumberPanel();
        this.add(numberPanel, BorderLayout.WEST);
        
        operationPanel = new OperationPanel();
        this.add(operationPanel, BorderLayout.CENTER);
        
        clearPanel = new ClearPanel(modelo);
        this.add(clearPanel, BorderLayout.SOUTH);
        
    }

    public void setMyActionListener(ActionListener myActionListener) {
        numberPanel.setMyActionListener(myActionListener);
        clearPanel.setMyActionListener(myActionListener);
        operationPanel.setMyActionListener(myActionListener);
        menu.setMyActionListener(myActionListener);
    }

    public void nuevoNumeroDisplay(String newNumber) {
        displayPanel.nuevoNumeroDisplay(newNumber);
    }

    public void resetear() {
        displayPanel.resetearDisplay();
    }

    public void convertir(String nuevaConversion) {
        displayPanel.mostrarNuevaConversion(nuevaConversion);
    }    

    public String getNewExchange() {
        return menu.nuevoConversionRate();
    }

    public void changeExchangeDisplay(String newExchangeRate) {
        displayPanel.changeExchangeDisplay(newExchangeRate);
    }
}



