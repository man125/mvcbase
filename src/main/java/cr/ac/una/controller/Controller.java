/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.controller;

import cr.ac.una.model.Model;
import cr.ac.una.view.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author manuel
 */
public class Controller implements ActionListener {
    private Model model;
    private View view;
    
    public Controller(Model model, View view) {
        this.model= model;
        this.view=view;
        //puede tambien ser en la vista
        //indicar el evento
        this.view.send.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        model.setNum(Integer.parseInt(view.num1.getText()));
        model.setNum2(Integer.parseInt(view.num2.getText()));
        model.multiplicar();
        view.res.setText(String.valueOf(model.getResultado()));
    }

 
    
}
