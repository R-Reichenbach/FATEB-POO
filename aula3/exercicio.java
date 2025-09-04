import java.util.Scanner;

public class exercicio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // primeiro aluno
        Aluno aluno1 = new Aluno();
        System.out.print("Digite o nome do aluno: ");
        aluno1.nome = scanner.nextLine();

        System.out.print("Digite o RA do aluno: ");
        aluno1.ra = scanner.nextLine();
        
        System.out.print("Digite o nome da matéria: ");
        aluno1.materia = scanner.nextLine();

        while (aluno1.nota < 0 || aluno1.nota >10) {
            System.out.print("Digite a nota da materia: ");
            aluno1.atribui_nota(scanner.nextDouble());
        }

        System.out.println("o aluno foi " + aluno1.foiAprovado() + " na materia " + aluno1.materia);
        scanner.close();
    }
}

class Aluno{

        String nome = null;
        String ra = null;
        String materia = null;
        double nota = -1;

        Aluno(){
        }

        public String informacoesdoAluno(){
            return "Nome: " + this.nome + " - ra: " + this.ra;
        }

        public String foiAprovado(){
            String resultado;
            if (this.nota >= 7) {
                resultado = "Aprovado";
            }else{
                resultado = "Reprovado";
            }
            return resultado;
        }

        public void atribui_nota(double notaRecebida){

            if(notaRecebida < 0){
                System.out.print("Nota inválida, coloque um valor maior que 0");
                return;
            }
            else if(notaRecebida > 10){
                System.out.print("A nota deve ser menor ou igual a 10");
                return;
            }
            this.nota = notaRecebida;
        }
}
