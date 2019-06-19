package es.uv.eu.euroconversor.controller;


import es.uv.eu.euroconversor.model.EuroConversorModel;
import es.uv.eu.euroconversor.view.EuroConversorView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EuroConversorController {
    EuroConversorModel model;
    EuroConversorView view;
    
    public EuroConversorController(EuroConversorView view, EuroConversorModel model){
        this.view = view;
        this.model = model;
        
        MyActionListener myActionListener = new MyActionListener();
        view.setMyActionListener(myActionListener);
    }
   
    public class MyActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {   
                String nombre, newNumber, nuevaConversion, newExchangeRate;
                nombre = event.getActionCommand();
                
                switch (nombre){
                    case "0":
                    case "1":
                    case "2":
                    case "3":
                    case "4":
                    case "5":
                    case "6":
                    case "7":
                    case "8":
                    case "9":
                    case ".":
                    case "C":
                        newNumber = model.addDigit(nombre);
                        view.nuevoNumeroDisplay(newNumber);
                    break;
                    case "Clear":
                        model.reset();
                        view.resetear();
                    break;
                    case "Convertir":
                        nuevaConversion = model.convert();
                        view.convertir(nuevaConversion);
                    break;
                    case "Salir":
                        System.out.println("Cerrar Calculadora");
                        System.exit(0);
                    break;
                    case "ChangeRate":
                        newExchangeRate = view.getNewExchange();
                        model.setExchangeRate(Float.parseFloat(newExchangeRate));
                        view.changeExchangeDisplay(newExchangeRate);
                    break;
                }
        }
    }

}