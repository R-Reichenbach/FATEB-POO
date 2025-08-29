

class Aula2 {

    public static void main(String[] args){
        Carro fusca = new Carro("verde", "vw", "1960");
        

        System.err.println(new Carro("verde", "vw", "1960"));       
    }
}

    class Carro{

        String cor;
        String marca;
        String anoFabricacao;


        Carro(String cor, String marca, String anoFabricacao){
            this.cor = cor;
            this.marca = marca;
            this.anoFabricacao = anoFabricacao;
        }
        
                //void = não retorna nada!
        public String informacoes(){
            return "cor: " + cor + "- marca: " + marca + " - ano de fabricação: " + anoFabricacao;
        }

        public void imprimeInformacoes(){
            System.out.println("cor: " + cor + " - marca: ");
        }
    }
    
