/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restfullbddproduct;

/**
 *
 * @author entrar
 */
public class RestfullBDDProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewJerseyClient cliente = new NewJerseyClient();
        System.out.println(cliente.findAll_XML(String.class));
        System.out.println(cliente.find_XML(String.class, "1"));
    }
    
}
