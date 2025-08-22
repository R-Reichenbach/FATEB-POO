package aula2;

class Aula2 {

    public static void main(String[] args){
        Carro carro = new Carro();
        carro.acelerar();
    }
}

    class Carro{

        String cor;
        String Marca;
        String anoFabricacao;

        public void acelerar(){
            System.out.print("O carro acelerou !");
        }
    }
