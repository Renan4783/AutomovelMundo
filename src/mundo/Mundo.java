/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author tony
 */
public class Mundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Criando um automóvel!");
        Automovel auto = new Automovel();
        auto.setAno(2014);
        auto.setCor("Preto");
        auto.setModelo("Honda Civic");
        auto.setPotencia(150);
        System.out.println(auto.toString());
        auto.apertarBuzina();
//        int tempo = 10;
//        float pressao = 20;
//        auto.acelerar(tempo, pressao);
    }
}
