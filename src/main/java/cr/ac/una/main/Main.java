/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
https://github.com/man125/mvcbase.git
 */
package cr.ac.una.main;

import cr.ac.una.controller.Controller;
import cr.ac.una.model.Model;
import cr.ac.una.view.View;

/**
 *
 * @author manuel
 */
public class Main {
    
    public static void main(String[] args) {
       Model m = new Model();
       View v = new View();
       Controller c= new Controller(m,v);
       v.setVisible(true);
    }
}
