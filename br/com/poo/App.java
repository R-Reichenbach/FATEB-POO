package br.com.poo;

import java.time.LocalDate;

import br.com.poo.modelos.Carro;
import br.com.poo.modelos.Cliente;
import br.com.poo.modelos.Locacao;
import br.com.poo.modelos.Pagamento;

public class App {

    public static void main(String[] args) {
      // 1) Cadastrar Clientes
      Cliente cliente1 = new Cliente();
      cliente1.setNome("David");
      try {
        cliente1.setCnh("123123123");
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
      try {
        cliente1.setCnh("87865428");
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
      System.out.println("Dados do cliente: " +  
      " Nome: " + cliente1.getNome() +  " - " + 
      " CNH: " + cliente1.getCnh());

      // 2) Cadastrar Carros
      Carro carro1 = new Carro();
      carro1.setMarca("Chevrolet");
      carro1.setModelo("Onix");
      try {
        carro1.setPlaca("ADT-2532");
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
      System.out.println("Dados do carro: " +  
      " Marca: " + carro1.getMarca() +  " - " + 
      " Modelo: " + carro1.getModelo() +  " - " + 
      " Placa: " + carro1.getPlaca());
      
      // 3) Alugar um Carro 
      Locacao locacao = new Locacao();
      locacao.setCliente(cliente1); 
      locacao.setCarro(carro1);
      try {
        locacao.iniciaLocacao(LocalDate.now());
        //imprimir dados da locacao ativa
        System.out.println("Dados da locação: Nome do cliente: " + locacao.getNomeCliente() + " - Modelo do carro: " + locacao.getModeloCarro());        
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
      
      // 4) Devolver Carro
      try {
        locacao.finalizaLocacao(LocalDate.now());
      } catch (Exception e) {
        System.err.println(e.getMessage());
      } 
      
      // 5) Registrar o Pagamento
      Pagamento pagamento = new Pagamento();
      pagamento.setLocacao(locacao);
      pagamento.setValor(200);
      pagamento.finalizaPagamento();
    }
}