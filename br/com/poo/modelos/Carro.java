package br.com.poo.modelos;

    public class Carro {

        private String marca;
        private String modelo;
        private String placa;
        private Boolean disponivel;

        public Carro() {
            // Do nothing
        }

        // setters
        public void setMarca(String marca){
            this.marca = marca;
        }
        public void setModelo(String modelo){
            this.modelo = modelo;
        }
        public void setPlaca(String placa) throws Exception{
            if (this.placa == null){
                this.placa = placa;
            }else {
                throw new Exception("O conteudo de placa não pode ser alterado.");
            }
        }

        @Override
        public String toString() {
            return "Marca  : " + this.marca + "\nModelo : " + this.modelo + "\nPlaca  : " 
            + this.placa ;
        }
    }