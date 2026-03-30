import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- VEJA A SUA MÉDIA ---");
            System.out.println("A) Prova semestral é composta  por 50% da média final");
            System.out.println("B) Trabalho de comclusãoo de curso é composto por 30% da média final");
            System.out.println("C) As avaliações intermediárias são compostas por duas avaliações " +
                    "durante o semestre e média das duas juntas é composta 20% da média final");

            System.out.println("\nDigite a sua nota da prova semestral: ");
            float provaSemestral = input.nextFloat();

            System.out.println("Digite a sua nota do trabalho de conclusão de curso: ");
            float trabalhoConclusao = input.nextFloat();

            System.out.println("Digite a sua nota da avaliação intermediária 1: ");
            float avaliacaoIntermediaria1 = input.nextFloat();

            System.out.println("Digite a sua nota da avaliação intermediária 2: ");
            float avaliacaoIntermediaria2 = input.nextFloat();

            System.out.println("Calculando a média final...");

            double mediaFinal = (provaSemestral * 0.5) + (trabalhoConclusao * 0.3) + ((avaliacaoIntermediaria1 + avaliacaoIntermediaria2) / 2) * 0.2;

            if (mediaFinal >= 6) {
                System.out.println("Parabéns! Voce foi aprovado com média final: " + mediaFinal);
            }
            else if (mediaFinal >= 3) {
                System.out.println("Voce está de recuperação com média final: " + mediaFinal);
            }
            else {
                System.out.println("Infelizmente, voce foi reprovado com média final: " + mediaFinal);
            }


                System.out.println("\nDeseja calcular a média para outro aluno? (s/n)");
                String choice = input.next();

                if (choice.equalsIgnoreCase("n")) {
                    System.out.println("Obrigado por usar o programa! Encerrando...");
                    break;
                }
                else if (!choice.equalsIgnoreCase("s")) {
                    while (true) {
                        System.out.println("Opção inválida. Por favor, digite 's' para sim ou 'n' para não.");
                        choice = input.next();
                        if (choice.equalsIgnoreCase("n")) {
                            System.out.println("Obrigado, até a próxima! Encerrando...");
                            break;
                        }
                        else if (choice.equalsIgnoreCase("s")) {
                            break;
                        }
                    }
                }
        }
    }
}