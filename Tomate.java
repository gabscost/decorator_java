/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotcom.lab3exer1;

/**
 *
 * @author Gabriel
 */
public class Tomate extends PizzaDecorator{
    
    public Tomate(Pizza pizza) {
        super(pizza);
    }
     @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", Tomate";
    }

    @Override
    public double getPreco() {
        return pizza.getPreco() + 4.00;
    }
    
}
