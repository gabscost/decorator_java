/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotcom.lab3exer1;

/**
 *
 * @author Gabriel
 */
public class PizzaDecorator implements Pizza {
    protected Pizza pizza;
    
    public PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }
    
    
 @Override
    public String getDescricao() {
        return pizza.getDescricao();
    }

    @Override
    public double getPreco() {
        return pizza.getPreco();
    }
  
    
  
}
