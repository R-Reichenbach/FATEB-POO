public class Aula5{
    public static void main(String[] args){
        long x = 9_007_199_25_70_993L;
        double y = x;

        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y: " + y);

        boolean ehigual = (x == y);
        System.out.println("X é igual a Y: " + ehigual);
    }

    static void testeConversao02(){
        double d = 50.35;
        int i = d;

        System.out.println("Valor de D: " + d);
        System.out.println("Valor de I: " + i);
        
    }
}