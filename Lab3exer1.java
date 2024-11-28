/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dotcom.lab3exer1;

/**
 *
 * @author Gabriel
 */
public class Lab3exer1 {

    public static void main(String[] args) {
        Pizza pedido1 = new MassaFinaPizza();
        Pizza margaritaPedido1 = new Queijo(new Tomate(pedido1));
        
        
        System.out.println("descricao: " + margaritaPedido1.getDescricao());
        System.out.println("Preco: "+margaritaPedido1.getPreco());
        
        
    }
}
