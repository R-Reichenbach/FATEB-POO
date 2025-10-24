package br.com.poo;

import br.com.poo.modelos.Carro;

public class App{
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");

        try {
            carro.setPlaca("ABC-1234");
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println(carro);
        
    }
}
