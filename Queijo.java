/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotcom.lab3exer1;

/**
 *
 * @author Gabriel
 */
public class Queijo extends PizzaDecorator{
   public Queijo(Pizza pizza) {
        super(pizza);
    }
     @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", Queijo";
    }

    @Override
    public double getPreco() {
        return pizza.getPreco() + 5.00;
    } 
}
