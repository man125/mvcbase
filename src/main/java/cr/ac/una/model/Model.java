/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.model;

/**
 *
 * @author manuel
 */
public class Model {
    private int num;
    private int num2;
    private int resultado;

    public Model() {
     
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    //methods implemente here class
    public int multiplicar(){
        resultado = num * num2;
        return resultado;
    }
    
}
